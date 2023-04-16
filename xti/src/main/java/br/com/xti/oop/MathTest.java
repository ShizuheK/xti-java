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
        
        int evenGreater = math.greaterThan(8, 16);
        int oddGreater = math.greaterThan(5, 11);
        double sumEvenOdd = math.sum(evenGreater, oddGreater);
        // Or you can do it like this: double sumEvenOdd = math.sum(math.greatherThan(8,16), math.greaterThan(5,11);
        System.out.println(sumEvenOdd);
        
        int mySquareRoot = math.pellEquation(35);
        System.out.println(mySquareRoot);
        
        System.out.println("\n");
        
        System.out.println(math.average("6","12"));
        System.out.println(math.average(4));
        System.out.println(math.average(45,33,24,51));
        System.out.println(math.average(44, 33));
        
    }
}
