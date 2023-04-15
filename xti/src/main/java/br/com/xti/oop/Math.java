/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class Math {
    
    /**
     * 
     * @param firstNumber
     * @param secondNumber
     * @return the greater number between the two
     */
    int greaterThan(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
    
    /**
     * 
     * @param firstNumber
     * @param secondNumber
     * @return the sum of both numbers
     */
    double sum(double firstNumber, double secondNumber){
        double sum = firstNumber + secondNumber;
        return sum;
    }
    
    int pellEquation(int number){
        int oddCount = 1;
        int squareRoot = 0;
        while (number >= oddCount){
            number -= oddCount;
            oddCount += 2;
            squareRoot += 1;
        }
        return squareRoot;
    }
}
