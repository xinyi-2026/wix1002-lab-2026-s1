/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;
import java.util.Random;
import java.util.Scanner;
public class SortList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int[] num = new int[20];
        
        num[0] = r.nextInt(101);
        System.out.println("A list of 20 random inteegr within 0 to 100");
        System.out.print(num[0]);
        for(int i = 1; i < num.length; i++){
            num[i] = r.nextInt(101);
            System.out.print(", " + num[i]);
        }
        
        System.out.println();
        
        for(int pass = 1; pass < num.length; pass++){
            for(int i = num.length - 1; i > 0; i--){
                if(num[i] > num[i-1]){
                    int hold = num[i];
                    num[i] = num[i-1];
                    num[i-1] = hold;
                }
            }
        }
        
        System.out.println("Array in descending order");
        System.out.print(num[0]);
        for(int i = 1; i < num.length; i++){
            System.out.print(", " + num[i]);
        }
        
        System.out.println();
        System.out.print("Enter a  number to search: ");
        int target = sc.nextInt();
        
        boolean linearFound = false;
        //linear search
        int linearCount = 0;
        for(int i = 0; i < num.length; i++){
            linearCount++;
            if(num[i] == target){
                linearFound = true;
                break;
            }
        }
        
        if(linearFound){
           System.out.println(target + " found");
           System.out.println("Linear Search - " + linearCount + " loop(s)");
        }else{
            System.out.println(target + " not found");
            System.out.println("Linear Search - " + linearCount + " loop(s)");
        }
       
        
        //binary search
        int mid;
        int low = 0;
        int high = num.length - 1;
        int binaryCount = 0;
        boolean binaryFound = false;
        
        while (low <= high) {
            binaryCount++;
            mid = (low + high) / 2;

            if (target == num[mid]){
                binaryFound = true;
                break;
            }else if (target < num[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        if(binaryFound){
           System.out.println(target + " found");
           System.out.println("Binary Search - " + binaryCount + " loop(s)");
        }else{
            System.out.println(target + " not found");
            System.out.println("Binary Search - " + binaryCount + " loop(s)");
        }
        
    }
}
