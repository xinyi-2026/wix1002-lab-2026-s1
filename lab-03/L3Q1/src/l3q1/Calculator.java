/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second integer number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        
        switch (operand){
            case ('+'):
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
                break;
            case ('-'):
                int difference = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + difference);
                break;
            case ('*'):
                int product = num1 * num2;
                System.out.println(num1 + " * "+ num2 + " = " + product);
                break;
            case ('/'):
                if(num2 == 0){
                    System.out.println("Cannot divide by 0");
                }else{
                    int division = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + division);
                }
                break;
            case ('%'):
                if(num2 == 0){
                    System.out.println("Cannot divide by 0");
                }else{
                    int remainder = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + remainder);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
