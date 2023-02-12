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

public class AllSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours, mins, secs;
        System.out.print("Hours : ");
        hours = sc.nextInt();
        System.out.print("Mins  : ");
        mins = sc.nextInt();
        secs = (hours*3600)+(mins*60);
        System.out.println("Secs = "+secs);
        
    }
}
