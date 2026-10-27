/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

import java.util.Scanner;
public class PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter coordinate point (x,y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double distance = Math.sqrt(x*x + y*y);
        
        if(distance <= r){
            System.out.println("The point is inside the circle centered at (0,0)");
        } else if (x==0 && y==0){
            System.out.println("The point is inside the circle centered at (0,0)");
        }else{
            System.out.println("The point is outside the circle centered at (0,0)");
        }
    }
    
}
