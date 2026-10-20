/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;
import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        int gram = sc.nextInt();
        
        double kg = gram / 1000;
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = sc.nextDouble();
        
        System.out.print("Enter the final temparature in Fahrenheit: ");
        double finalF = sc.nextDouble();
        
        double initialC = (initialF - 32)/ 1.8;
        double finalC = (finalF - 32)/ 1.8;
        double energy = kg * (finalC - initialC) * 4184;
        
        System.out.printf("Energy: %.2f J%n", energy);
        System.out.printf("Scientific: %.6e J%n", energy);
    }
    
}
