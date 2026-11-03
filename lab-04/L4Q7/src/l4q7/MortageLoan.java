/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;
import java.util.Scanner;
public class MortageLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double p =sc.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        
        System.out.print("Enter total number of month(s): ");
        int n = sc.nextInt();
        
        if(p <= 0 || i <= 0 || n <= 0){
            System.out.println("Invalid value");
            return;
        }
        
        double total = 0;
        
        System.out.printf("%-6s%18s%14s%12s%18s%18s%n", "Month", "Monthly Payment",
                "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for(int count = 1; count <= n; count++){
            double r = i / (12 * 100); 
            double m = (p * r) / (1 - Math.pow(1 + r, -n)); //monthly payment
            double c = m  * Math.pow((1 + r), -(1 + n - count)); //principle portion due
            double l = m - c; //interest due
            double balance = (l / r) -c;//remaining principal due
            total += l;
            
            System.out.printf("%-6d%18.2f%14.2f%12.2f%18.2f%18.2f%n", count, m, c, l, balance, total);
        }
    }
    
}
