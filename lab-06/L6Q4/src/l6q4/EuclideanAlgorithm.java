/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q4;
public class EuclideanAlgorithm {

    static int gcd(int a, int b){
        if(b > a){
            int hold = a;
            a = b;
            b = hold;
        }
        
        if(a % b == 0){
            return b;
        }
       
        int remainder;
        while(a % b != 0){
            remainder = a % b;
            a = b;
            b = remainder;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("GCD(24,8) = " + gcd(24,8));
        System.out.println("GCD(200, 625) = " + gcd(200,625));
    }
    
}
