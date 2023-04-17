/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.inheritance;

/**
 *
 * @author k
 */
public class AnimalTest {
    
    public static void main(String[] args){
        
        Cat tom = new Cat();
        tom.name = "Tom";
        tom.food = "Meat";
        tom.sleep();
        
        Owl ja = new Owl();
        ja.name = "Ja";
        ja.food = "Meat";
        ja.watch();
        
    }
    
}
