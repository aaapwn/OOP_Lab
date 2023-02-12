/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author armmy
 */

import java.util.Scanner;

public class OilPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float liter = sc.nextFloat(), price;
        price = liter*30;
        System.out.println(price);
    }
}
