/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class Car {
    
    String model;
    int maximumSpeed;
    double secondsZeroToHundred;
    Motor motor;
    
    public Car(){
        
    }
    
    public Car(String model, int maximumSpeed, double secondsZeroToHundred, Motor motor){
        this.model = model;
        this.maximumSpeed = maximumSpeed;
        this.secondsZeroToHundred = secondsZeroToHundred;
        this.motor = motor;
    }
    
}