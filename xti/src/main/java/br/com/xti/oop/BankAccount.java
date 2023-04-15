/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class BankAccount {
    
    String clientName;
    double accountBalance;
    
    void showBalance() {
        System.out.println(clientName + ", your account balance is: " + accountBalance);
    }
    
    void withdrawMoney(double value) {
        accountBalance -= value;
    }
    
    void depositMoney(double value) {
        accountBalance += value;
    }
    
    void transferMoney(BankAccount destination, double value) {
        this.withdrawMoney(value);
        destination.depositMoney(value);
    }
}
