/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class Chicken {
    
    public static int allEggs; // Global Variable
    public int eggs; // Object Variable
    
    public void layEggs() {
        this.eggs++;
        Chicken.allEggs++;
    }
    
    public Chicken layEggsNew() {
        this.eggs++;
        Chicken.allEggs++;
        return this;
    }
    
    public static double eggsAverage(int chickens) {
        return Chicken.allEggs / chickens;
    }
}
