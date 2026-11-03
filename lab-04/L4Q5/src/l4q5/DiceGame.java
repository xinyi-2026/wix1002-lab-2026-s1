/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;
import java.util.Random;
public class DiceGame {
    public static void main(String[] args) {
        Random r = new Random();
        
        int score1 = 0;
        int score2 = 0;
        int dice;
        int player = 1;
        
        while(score1 <= 100 && score2 <= 100){
            do{
                dice = r.nextInt(6) + 1;
                
                if(player == 1){
                    score1 += dice;
                } else {
                    score2 += dice;
                }
                System.out.println("Player 1 score: " + score1);
                System.out.println("Player 2 score: " + score2);
                
                if(score1 > 100){
                    System.out.println("Player 1 wins!");
                    break;
                } else if(score2 > 100){
                    System.out.println("Player 2 wins!");
                    break;
                }
            }while (dice == 6);
        player = 3 - player;
        }   
    }
    
}
