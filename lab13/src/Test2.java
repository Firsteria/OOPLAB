/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Test2 implements Runnable{
    public String name;
    public Test2(String n) { name = n; }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(name + " : " + i);
        }
    }
}
