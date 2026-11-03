/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;

import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter integer: ");
        int integer = sc.nextInt();
        
        if(integer <= 0){
            System.out.println("Invalid integer");
            return;
        }
        System.out.print("The factors are: ");

        for(int i = 1; i <= integer; i++){
            if(integer % i == 0){
                System.out.print(i);
                if( i < integer){
                    System.out.print(",");
                } else {
                    System.out.print("");
                }
            }
        }
        System.out.println();
    }
    
}
