/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public enum MetricLengths {
    
    MM("Millimeters"), CM("Centimeters"), M("Meters"), KM("Kilometers");
    
    public String title;

    private MetricLengths(String title) {
        this.title = title;
    }
    
}
