/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package l5q2;
import java.util.Random;

public class NumGenerator {
    public static void main(String[] args) {
        Random r = new Random();

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            boolean duplicate;

            do {
                num[i] = r.nextInt(21);
                duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (num[j] == num[i]) {
                        duplicate = true;
                        break;
                    }
                }

            } while (duplicate);

            System.out.print(num[i] + " ");
        }
    }
}