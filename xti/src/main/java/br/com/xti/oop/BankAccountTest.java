/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author k
 */
public class BankAccountTest {
    public static void main(String[] args){
       BankAccount accountRoger = new BankAccount();
       accountRoger.clientName = "Roger";
       accountRoger.accountBalance = 10_000.00;
       accountRoger.showBalance();
       accountRoger.withdrawMoney(1000);
       accountRoger.showBalance();
       accountRoger.depositMoney(1000);
       accountRoger.showBalance();
       
       BankAccount accountLine = new BankAccount();
       accountLine.clientName = "Line";
       accountLine.accountBalance = 5_000.00;
       accountLine.showBalance();
       
       accountRoger.transferMoney(accountLine, 5000);
       accountRoger.showBalance();
       accountLine.showBalance();
    }
}
