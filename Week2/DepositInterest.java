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

public class DepositInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble(), totalMoney;
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char type = sc.next().charAt(0);
        switch (type) {
            case 'A': case 'C':
                totalMoney = money*(115/100);
                break;
            case 'B':
                totalMoney = money*1.02;
                break;
            case 'X':
                totalMoney = money*1.05;
                break;
            default:
                totalMoney = 0;
                break;
        }
        System.out.println("Your total money in one year = "+ totalMoney);
        
    }
}
