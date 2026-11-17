/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q6;

import java.util.Scanner;


import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        int[][] pascal = new int[row][row];

        for (int r = 0; r < row; r++) {
            pascal[r][0] = 1;
            pascal[r][r] = 1;

            for (int c = 1; c < r; c++) {
                pascal[r][c] = pascal[r - 1][c - 1] + pascal[r - 1][c];
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < row; c++) {
                System.out.print(pascal[r][c] + "  ");
            }
            System.out.println();
        }
    }
}

