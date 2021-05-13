/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;

/**
 *
 * @author luik
 */
public class Jogador {

    private String nome;
    protected Integer numeroCamiseta;

    public Jogador(String nome, Integer numeroCamiseta) {
        this.nome = nome;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return "---" + this.nome + "---"
                + "\nNúmero camisa: " + this.numeroCamiseta
                + "\n"; 
    }

}
