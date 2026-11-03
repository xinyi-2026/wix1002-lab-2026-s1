/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;
import java.util.Scanner;
public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        System.out.print("Enter first day of the year(0-6): ");
        int firstDay = sc.nextInt();
        
        if(firstDay > 6 || firstDay < 0){
            System.out.print("Invalid Day");
            return;
        }
        
        int feb;
        if((year % 4 == 0 && year % 400 == 0)|| year % 400 == 0){
            feb = 29;
        } else {
            feb = 28;
        }
        
        int may = (firstDay + 31 + feb + 31 + 30) % 7; //find first day of May
        int august = (may + 31 + 30 + 31)%7;
        
        //display calender for May and August
        for(int count = 1; count <= 2; count++){
            String month = (count == 1)? "May" : "August";
            int startDay = (count == 1)? may : august;
            
            System.out.println(month + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for(int i = 0; i < startDay; i++){
                System.out.print("    "); //print blank before the first day
            }
            //print 7 day in a row
             for(int day = 1; day <= 31; day++){
                System.out.printf("%4d", day);
                if((startDay + day) % 7 == 0){
                 System.out.println();
                 }
            }
            System.out.println();
            System.out.println();
        }
    }   
}        
        
        
       

