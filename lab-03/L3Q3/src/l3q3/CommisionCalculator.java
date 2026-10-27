/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

import java.util.Scanner;
public class CommisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the sales volume: ");
        double volume = sc.nextDouble();
        
        if(volume < 0){
            System.out.println("Invalid sales volume");
            return;
        }
        
        double rate;
        if(volume <= 100){
            rate = 0.05;
        } else if(volume > 100 && volume <= 500) {
            rate = 0.075;
        } else if(volume >= 500 && volume <=1000){
            rate = 0.1;
        }else{
            rate = 0.0125;
        }
        
        double commision = volume * rate;
        System.out.printf("Commision: %.2f%n", commision);   
    }
    
}
