/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author armmy
 */

import java.util.Scanner;

public class LineSlash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plese insert a number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%5 == 0) {
                System.out.print("/");
            }else {
                System.out.print("|");
            }
        }
        System.out.println();
    }
}
