/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

import java.util.Random;
public class DiceGame {
    public static void main(String[] args) {
        Random generator = new Random();
        
        int p1First = generator.nextInt(6)+1;
        int p1Second = generator.nextInt(6)+1;
        int p2First = generator.nextInt(6)+1;
        int p2Second = generator.nextInt(6)+1;
        
        int p1 = p1First + p1Second;
        int p2 = p2First + p2Second;
        
        System.out.println("Player 1: " + p1First + " " + p1Second);
        System.out.println("Player 2: " + p2First + " " + p2Second);
        
        if(p1 > p2){
            System.out.println("Player 1 wins");
        }else if(p2 > p1){
            System.out.println("Player 2 wins");
        }else{
            System.out.println("It's a draw");
        }
    }
    
}
