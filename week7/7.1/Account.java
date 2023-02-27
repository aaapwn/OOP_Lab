/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double a){
        if (a > 0){
            setBalance(getBalance()+a);
            System.out.println(a+" baht is deposit to "+name+".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if (a < 0){
            System.out.println("Input number must be a positive integer.");
        }else if (balance - a < 0){
            System.out.println("Not enough money!");
        }else{
            setBalance(getBalance()-a);
            System.out.println(a+" baht is withdrawn to "+name+".");
        }
    }
    public void showAccount(){
        System.out.println(name+" account has "+balance+" baht.");
    }
}
