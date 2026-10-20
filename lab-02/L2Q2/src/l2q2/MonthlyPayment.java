/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;
import java.util.Scanner;
public class MonthlyPayment {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter price of the car: ");
       double price = sc.nextDouble();
       
       System.out.print("Enter down payment: ");
       double downPayment = sc.nextDouble();
       
       System.out.print("Enter interest rate in %: ");
       double rate = sc.nextDouble();
       
       System.out.print("Enter loan duration in year: ");
       double year = sc.nextDouble();
       
       double monthlyPayment = (price - downPayment)* ( 1 + rate*year/100)/(year*12);
       System.out.printf("Monthly payment: RM%.2f\n", monthlyPayment);
    }
    
}
