/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class MathTest {
    
    public static void main(String[] args){
        
        Math math = new Math();
        
        int greaterThanResult = math.greaterThan(10, 20);
        System.out.println(greaterThanResult);
        
        double sumResult = math.sum(50, 20);
        System.out.println(sumResult);
        
    }
}
