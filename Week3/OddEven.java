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

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0, num;
        while (true) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            else if (num%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.print("Odd number = " + odd);
        System.out.println(" and Even nuber = " + even);
    }
}
