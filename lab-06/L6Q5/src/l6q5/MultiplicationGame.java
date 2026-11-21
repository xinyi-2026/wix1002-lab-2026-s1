/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q5;
import java.util.Scanner;
import java.util.Random
public class MultiplicationGame {

    static boolean multiplication(int a, int b, int c){
        return a*b == c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int score = 0;
        
        while(true){
            int first = r.nextInt(13);
            int second = r.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(first + " x " + second +" = ");
            int ans = sc.nextInt();
            
            if(ans < 0){
                break;
            }
            
            if(multiplication(first, second, ans)){
                score++;
            }
        }
        
        System.out.println("Your score is " + score);
        
    }
    
}
