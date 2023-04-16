/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class ChickenTest {
    public static void main(String[] args){
        
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        
        System.out.println("Chicken 1 has a total of " + chicken1.eggs + " eggs.");
        System.out.println("Chicken 2 has a total of " + chicken2.eggs + " eggs.");
        
        chicken1.layEggs();
        chicken1.layEggs();
        chicken1.layEggs();
        
        chicken1.layEggsNew().layEggsNew().layEggsNew();
        chicken2.layEggsNew().layEggsNew();
        
        System.out.println("Chicken 1 has a total of " + chicken1.eggs + " eggs.");
        System.out.println("Chicken 2 has a total of " + chicken2.eggs + " eggs.");
        System.out.println("Total of eggs: " + Chicken.allEggs);
    }
}
