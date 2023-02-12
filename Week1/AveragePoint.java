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

public class AveragePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat(), y = sc.nextFloat(), z = sc.nextFloat();
        float avg = (x+y+z)/3;
        System.out.println(avg);
    }
}
