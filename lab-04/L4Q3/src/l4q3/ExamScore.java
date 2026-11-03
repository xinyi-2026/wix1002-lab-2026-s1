/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;

import java.util.Scanner;
public class ExamScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter exam score [negative score to quit]: ");
        int score = sc.nextInt();
        double square = score*score;
        
        int sum = 0;
        double sumSquare = 0;
        int n = 0;
        int min = score;
        int max = score;
        while(score >= 0){
            sum += score;
            sumSquare += square;
            
            if(score < min){
                min = score;
            }
            
            if(score > max){
                max = score;
            }
            
            n++;
            
            System.out.print("Enter exam score [negative score to quit]: ");
            score = sc.nextInt();   
            square = score * score;
        }
          
        if(n < 0){
            System.out.println("Invalid score");
            return;
        }
        
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        
        if(n >= 2){
            double avg = (double)sum / n;
            double variance = ((double)sumSquare - (sum * sum / n))/(n-1);
            double s = Math.sqrt(variance);
            System.out.println("Average score: " + avg);
            System.out.printf("Standard Deviation: %.2f%n", s);
        } else {
            System.out.println("Cannot be calculated");
        }
    }
    
}
