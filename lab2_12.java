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
public class lab2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double weight, age, numday1, numday2, salary = 0, bonus = 0;
        System.out.print("Please insert your name : ");
        name = sc.nextLine();
        System.out.print("Please insert your age : ");
        age = sc.nextDouble();
        System.out.print("Please insert your number of working days : ");
        numday1 = sc.nextDouble();
         System.out.print("Please insert your number of absent days : ");
        numday2 = sc.nextDouble();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextDouble();
            
        if(age >= 21 | age <= 30){
            salary = (numday1 * 300) - (numday2 * 50);
         
        }else if(age >= 31 & age <= 40){
            salary = (numday1 * 500) - (numday2 * 50);
        }else if(age >= 41 & age <= 50){
            salary = (numday1 * 1000) - (numday2 * 25);
        }else if(age >= 51 & age <= 60){
            salary = (numday1 * 3000);
        }
        if (weight >= 10 & weight <= 60){
            bonus = salary + 5000;
        } else if(weight >= 61 & weight <= 90){
            bonus = salary + (5000 - ((weight-60) * 10));
        
        }
        System.out.println("Hi"+name);
        System.out.println("Your salary is : "+salary+"Baht");
        System.out.println("Your salary and bonus is : "+bonus+"Baht");
    }
}