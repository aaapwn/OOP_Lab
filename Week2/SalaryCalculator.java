/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author armmy
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int numDay1, numDay2, age, weight, salary = 0;
        
        System.out.print("Please insert your name : ");
        name = sc.nextLine();
        System.out.print("Please insert your age : ");
        age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextInt();
        
        if (age >= 51 && age <= 60) {
            salary = (numDay1 * 3000);
        }
        else if (age >= 41) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if (age >= 31) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        }
        else if (age >= 21) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        }
        
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        
        if (weight > 90) {
            
        }
        else if (weight >= 61) {
            salary = salary + (5000 - ((weight-60) * 10));
        }
        else if (weight >= 10) {
            salary = salary + 5000;
        }
        
        System.out.println("Your salary and bonus is "+salary+" Baht");
        
    }
}
