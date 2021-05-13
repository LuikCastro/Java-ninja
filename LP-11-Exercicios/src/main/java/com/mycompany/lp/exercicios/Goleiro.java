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
public class Goleiro extends Jogador {

    private Integer golsSofridos;
    private Integer penaltisDefendidos;

    public Goleiro(String nome, Integer numeroCamiseta) {
        super(nome, numeroCamiseta);
        this.golsSofridos = 0;
        this.penaltisDefendidos = 0;
    }

    public void sofrerGol() {
        this.golsSofridos++;
    }

    public void defenderPenalti() {
        this.penaltisDefendidos++;
    }

    @Override
    public String toString() {
        return "---" + getNome() + "---"
                + "\nGols sofridos: " + golsSofridos
                + "\nPenaltis defendidos: " + penaltisDefendidos
                + "\n";
    }
}
