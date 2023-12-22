/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab2;

/**
 *
 * @author LAB203_70
 */
import java.util.*;
public class lab2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        int m = sc.nextInt();
        System.out.print("Input your account type(Please type A B C or Xin uppercase : ");
        String t = sc.next();
        if (t.equals("A") | (t.equals("C"))){
            double a = m + ((m/100)*1.5);
            System.out.println("Your total money in one year = "+a);
        }else if (t.equals("B")){
            double a = m + ((m/100)*2.0);
            System.out.println("Your total money in one year = "+a);
        }else if(t.equals("X")){
            double a = m + ((m/100)*2.0);
            System.out.println("Your total money in one year = "+a);
        }    
            
        

    }
    
}
