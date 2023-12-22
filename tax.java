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
public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        
        if(n1 >= 50000){
            double n5 = n1 * 0.05;
            System.out.println(n5);
        }else{
            double n10 = n1 * 0.1;
            System.out.println(n10);
        }
        
        
    }

    
}
