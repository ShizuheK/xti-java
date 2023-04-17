/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class CarTest {
    
    public static void main(String[] args){
        
        Car honda = new Car();
        honda.model = "Civic 98 Sedan EX";
        honda.maximumSpeed = 180;
        honda.secondsZeroToHundred = 8;
        
        Car nissan = new Car("Skyline R32", 180, 5);
        
    }
}
