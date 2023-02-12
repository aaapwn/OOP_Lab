/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author armmy
 */
public class MyBank {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.name = "Tirevichet";
        MyDate dob = new MyDate();
        dob.day = 8;
        dob.month = 11;
        dob.year = 2023;

        Account acct = new Account();
        acct.name = c.name;
        acct.balance = 500;

        c.DOB = dob;
        c.acct = acct;

        System.out.println("My name is " + c.name + ".");

        c.acct.showInfo();
        c.DOB.showDate();

        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000);
        c.acct.showInfo();
    }
}

class Account {
    public double balance;
    public String name;
    public void deposit(double b) {
        if (b > 0) {
            balance += b;
        }else {
            System.out.println("The balance varible must be greater than or equal to zero.");
        }
    }
    public double withdraw(double b) {
        
        if (b > 0) {
            if (balance-b < 0) {
                System.out.println("Your account balance is insufficient");
                return 0;
            }else {
                balance -= 0;
                return b;
            }
        }else {
            System.out.println("The balance varible must be greater than or equal to zero.");
            return 0;
        }
    }
    public void showInfo() {
        System.out.println("In "+name+" account, these is a balance equal to "+balance+" baht.");
    }
}
class MyDate{
    public int day;
    public int month;
    public int year;
    public void showDate() {
        System.out.println(day+"/"+month+"/"+year);
    }
}
class Customer{
    public String name;
    public MyDate DOB;
    public Account acct;
}
