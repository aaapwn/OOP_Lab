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

public class DrawTown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height of town : ");
        int height = sc.nextInt();
        for (int a = 1; a <= height; a++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
