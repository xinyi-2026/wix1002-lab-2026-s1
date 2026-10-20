/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        long time = sc.nextInt();
        
        long hour = time/3600;
        long minute = (time % 3600)/60;
        long seconds = (time %3600)% 60;
        
        System.out.println(time + " seconds is " + hour +" hours, " + minute + " minutes and " + seconds + " seconds");
    }    
    
}
