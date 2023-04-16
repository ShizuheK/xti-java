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
    
    public int eggs; 
    
    public void layEggs() {
        this.eggs++;
    }
    
    public Chicken layEggsNew() {
        this.eggs++;
        return this;
    }
}
