/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

import java.util.Random;

public class RandomStatistics {
    public static void main(String[] args) {
        Random generator = new Random();
        int first = generator.nextInt(41) + 10;
        int second = generator.nextInt(41) + 10;
        int third = generator.nextInt(41) + 10;
        
        int sum = first + second + third;
        double avg = (double)sum / 3;
        
        System.out.println("Numbers: " + first + " " + second + " " + third);
        System.out.println("Sum :" + sum);
        System.out.printf("Average: %.2f%n", avg);
    }
    
}
