/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q3;
public class reverseArray {

    static void reverse(int[] a){
        for(int i = 0; i < a.length; i++){
            String reversedNum = "";
            int num = a[i];

            while(num != 0){
                reversedNum += num % 10;
                num /= 10;
            }
        a[i] = Integer.parseInt(reversedNum);
        }
    }

    public static void main(String[] args) {
        int[] num = {8543, 4287, 9093, 7023, 1051, 9051, 8052, 7900, 2717, 6445};
        System.out.print("Before: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        
        System.out.println();
        System.out.print("After: ");
        reverse(num);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    
}
