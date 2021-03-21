/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula06;

/**
 *
 * @author castr
 */
public class Teste {
    
    public static void main(String[] args) {    
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.depositar(500.0);
        System.out.println("O saldo da conta 1 é: " + conta1.saldo);
        
        conta1.sacar(200.0);
        System.out.println("O saldo da conta 1 é: " + conta1.saldo);
        
        conta1.depositar(1000.0);
        conta1.sacar(1000.0);
    }
    
}
