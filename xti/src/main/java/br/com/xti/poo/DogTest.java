/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.poo;
/**
 *
 * @author k
 */
public class DogTest {
    public static void main(String[] args){
        Dog narcisus = new Dog();
        narcisus.race = "Mutt";
        narcisus.size = 30;
        narcisus.bark();
        
        Dog rodolpho = new Dog();
        rodolpho.race = "Dobber";
        rodolpho.size = 40;
        rodolpho.bark();
    }
}
