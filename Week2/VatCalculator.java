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

public class VatCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Salary : ");
        double salary = sc.nextFloat(), vat;
        if (salary > 50000) {
            vat = salary*0.1;
        }else{
            vat = salary*0.05;
        }
        System.out.println(vat);
    }
}
