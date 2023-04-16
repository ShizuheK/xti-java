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
    double sum(double ... numbers){
        double sumTotal = 0;
        for(double n : numbers){
            sumTotal += n;
        }
        return sumTotal;
    }
    
    /**
     * 
     * @param number
     * @return square root based on Pell's Equation
     */
    int pellEquation(int number){
        int oddCount = 1, squareRoot = 0;
        while (number >= oddCount){
            number -= oddCount;
            oddCount += 2;
            ++squareRoot;
        }
        return squareRoot;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return average between x and y
     */
    int average(int x, int y){
        return (x+y)/2;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return average between x and y
     */
    int average(String x, String y){
        int ix = Integer.parseInt(x);
        int iy = Integer.parseInt(y);
        return (ix+iy/2);
    }
    
    /**
     * 
     * @param x
     * @return average of x
     */
    int average(int x){
        return x;
    }
    
    /**
     * 
     * @param numbers
     * @return average between array of numbers
     */
    double average(double ... numbers){
        return sum(numbers)/numbers.length;
    }
}
