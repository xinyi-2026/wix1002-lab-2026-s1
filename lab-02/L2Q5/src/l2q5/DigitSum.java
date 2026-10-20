/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;
import java.util.Random;
public class DigitSum {
    public static void main(String[] args) {
        Random generator = new Random();
        
        int num = generator.nextInt(10001);
        int one = num % 10;
        int ten = (num/10) % 10;
        int hundred = (num/100) % 10;
        int thousand = (num/1000) % 10;
        int tenthousand = (num/10000) % 10;
        
        int sum = one + ten + hundred + thousand + tenthousand;
        
        System.out.println("Number: "+ num);
        System.out.println("Sum of digit: " + sum);
    }
    
}
