/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q4;
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };
        
        System.out.println("3 by 3 Matrix");
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        
        int[][] rotated = new int[3][3];
        
        System.out.println("After rotates 90 degree clockwise");
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                rotated[r][c] = matrix[matrix.length - 1 - c][r];
                System.out.print(rotated[r][c] + " ");
            }
            System.out.println();
        }
    }
    
}
