/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testejavaswing;

/**
 *
 * @author castr
 */
public class ContaCorrente {
    // atributos
    private String agencia;
    private Double saldo;
    
    // construtor
    public ContaCorrente(){
        this.saldo = 0.0;
    }
    
    // métodos
    public void sacar(Double valor){
        this.saldo -= valor;
    }
    
    public void depositar(Double valor){
        this.saldo += valor;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }   
}
