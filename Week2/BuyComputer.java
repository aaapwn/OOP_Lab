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

public class BuyComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monitor, dvdrom, printer;
        float price = 375.99f;
        
        System.out.print("Please insert your monitor size(38 or 43 only) : ");
        monitor = sc.nextInt();
        System.out.print("Do you want DVD-ROM? (1 is yes/0 is no : ");
        dvdrom = sc.nextInt();
        System.out.print("Do you want Printer? (1 is yes/0 is no : ");
        printer = sc.nextInt();
        
        System.out.println("======= Your order =======");
        System.out.println("- Computer >>> 375.99$");
        
        // Monitor
        switch (monitor) {
            case 38:
                price += 75.99;
                System.out.println("- 38'Monitor >>> 75.99$");
                break;
            default:
                price += 99.99;
                System.out.println("- 43'Monitor >>> 99.99$");
                break;
        }
        
        // DVD-CD Writer
        if (dvdrom == 1) {
            price += 65.99;
            System.out.println("- DVD-ROM >>> 65.99$");
        }
        
        // Printer
        if (printer == 1) {
            price += 125;
            System.out.println("- Printer >>> 125.00$");
        }
        
        System.out.println("======= Total price >>> "+price+" =======");
    }
}
