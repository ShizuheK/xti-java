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
       BankAccount account = new BankAccount();
       account.clientName = "Roger";
       account.accountBalance = 10_000.00;
       account.showBalance();
       account.withdrawMoney(1000);
       account.showBalance();
       account.depositMoney(1000);
       account.showBalance();
    }
}
