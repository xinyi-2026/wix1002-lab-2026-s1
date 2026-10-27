/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

import java.util.Scanner;
public class CramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        System.out.print("Enter e: ");
        int e = sc.nextInt();
        System.out.print("Enter f: ");
        int f = sc.nextInt();
        
        if((a*d)-(b*c) == 0){
            System.out.println("The equation has no solution.");
            return;
        }
        
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        
        System.out.printf("x: %.2f%n" ,x);
        System.out.printf("y: %.2f%n" , y);
    }
    
}
