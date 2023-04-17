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
        
        Engine v4 = new Engine();
        v4.type = "V4";
        v4.horsepower = 106;
        
        honda.engine = v4;
        
        Engine v6 = new Engine("V6", 276);
        
        Car nissan = new Car("Skyline R32", 180, 5, v6);
        
        Car subaru = new Car("WRX 2005 Impreza", 230, 6, new Engine("EJ205", 227));
        
    }
}
