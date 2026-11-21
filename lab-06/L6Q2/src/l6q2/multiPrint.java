/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q2;
import java.util.Scanner;
public class multiPrint {

    static void multiPrint(int n, char c){
        for(int i = 0; i < n; i++){
            System.out.print(c);
        }
    }
    
    //right-angled triangle
    static void rightAngle(int size){
        for(int row = 1; row <= size; row++){
            multiPrint(row,'*');
            System.out.println();
        }
    }
    
    //centered triangle
    static void centered(int size){
        for(int row = 1; row <= size; row++){
            multiPrint(size-row, ' ');
            multiPrint(2 * row -1, '*');
            System.out.println();
        }
    }
    
    static void diamond(int size){
        centered(size);
        for(int row = size-1; row >= 1; row--){
            multiPrint(size-row, ' ');
            multiPrint(2*row-1, '*');
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        
        System.out.println("Triangle");
        rightAngle(size);
        System.out.println();
        
        System.out.println("Centred Traingle");
        centered(size);
        System.out.println();
        
        System.out.println("Diamond");
        diamond(size);
        }
    }
    

