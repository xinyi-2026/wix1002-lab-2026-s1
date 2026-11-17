/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q3;
import java.util.Random;
import java.util.Scanner;
public class WorkHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter number of employees: ");
        int N = sc.nextInt();
        
        int[] hour = new int[7];
        
        for(int i = 0; i < N; i++){
            int sum = 0;
            System.out.print("Employee " + (i+1) + ": ");
            for(int h =0; h < hour.length; h++){
                hour[h] = r.nextInt(9);
                System.out.print(hour[h] + " ");
                sum += hour[h];
            }
            System.out.println();
            System.out.println("Sum: " + sum);
        }
    }
    
}
