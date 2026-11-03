/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;
import java.util.Random;
public class DigitCount {
    public static void main(String[] args) {
        Random r = new Random();
        
        int num = r.nextInt(Integer.MAX_VALUE);
        int digit = 0;
        
        System.out.println("Number: " + num);
        
        do{
            digit++;
            num = num/10; 
        } while(num != 0);
        
        System.out.println("Digit: " + digit);
    }
    
}
