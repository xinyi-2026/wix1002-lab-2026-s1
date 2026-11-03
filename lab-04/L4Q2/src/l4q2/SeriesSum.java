/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;
import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int last = 0;
        int sum = 0;
        for(int i=1; i <= n; i++){
            last += i;
            sum += last ;
        }
        System.out.println("Sum: " + sum);
    }
    
}
