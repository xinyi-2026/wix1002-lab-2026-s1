/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q1;
import java.util.Random;
import java.util.Scanner;
public class ScoreList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        if(N < 0){
           System.out.println("Invalid N");
        }
        
        int[] scores = new int[N];
        
        int sum = 0;
        System.out.print("List of score: ");
        
        for(int i = 0; i < scores.length; i++){
            scores[i] = r.nextInt(101);
            System.out.print(scores[i] + " ");
            sum += scores[i];
        }
        
        double avg = (double)sum / N;
        int highest = scores[0];
        int lowest = scores[0];
        
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > highest){
                highest = scores[i];
            }
            
            if(scores[i] < lowest){
                lowest = scores[i];
            }
        }
        
        System.out.println();
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.printf("Average: %.2f%n", avg);
    }
    
}
