/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q1;
public class L6Q1 {
    
    static int triangle(int term){
        int triangleNum = 0;
        for(int i = 1; i <= term; i++){
            triangleNum += i;
        }
        return triangleNum;
    }
    
    public static void main(String[] args) {
        System.out.println("First 20 triangle numbers: ");
        for(int i = 1; i <= 20; i++){
            System.out.print(triangle(i) +  " ");
        }
        
    }
    
}
