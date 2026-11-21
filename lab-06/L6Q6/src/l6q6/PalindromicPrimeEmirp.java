/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q6;

public class PalindromicPrimeEmirp {

    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;    
    }
    
    static int reverse(int num){
        int reversed = 0;
        int n = num;
        while(n != 0){
            reversed = reversed*10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
    
    static boolean isPalindrome(int num){
        return reverse(num) == num;
    }
    
    static boolean isPalindromicPrime(int num){
        return isPrime(num) && isPalindrome(num);
    }
    
    static boolean isEmrip(int num){
        return isPrime(num) && isPrime(reverse(num)) && !isPalindromicPrime(num);
    }
    public static void main(String[] args) {
        System.out.println("The first 20 palindromic primes");
        int count = 0;
        for(int num = 2; count < 20; num++){
            if(isPalindromicPrime(num)){
                System.out.print(num + " ");
                count++;
            }
        }
        
        System.out.println();
        
        System.out.println("The first 20 palindromic emrips");
        int emrip = 0;
        for(int num = 2; emrip < 20; num++){
            if(isEmrip(num)){
                System.out.print(num + " ");
                emrip++;
            }
        }
    }
    
}
