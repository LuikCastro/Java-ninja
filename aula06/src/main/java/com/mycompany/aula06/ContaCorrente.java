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
public class ContaCorrente {
    Double saldo = 0.0;
    Double limiteSaldo = 1000.0;
    
    public void depositar (Double valor){
        if (saldo + valor > limiteSaldo){
            System.out.println("Não é possível efetuar esse depósito");
        }
        else {
            saldo += valor;
        }
    }
    
    public void sacar(Double valor) {
        if (saldo - valor < 0.0){
        System.out.println("Não é possível efetuar esse saque");
        } else {
            saldo = saldo - valor;
        }
    }
}
