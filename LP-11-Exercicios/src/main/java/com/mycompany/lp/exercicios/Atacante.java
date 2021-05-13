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
public class Atacante extends Jogador {

    private Integer golsMarcados;
    private Integer assistencias;

    public Atacante(String nome, Integer numeroCamiseta) {
        super(nome, numeroCamiseta);
        this.golsMarcados = 0;
        this.assistencias = 0;
    }

    public void marcarGol() {
        this.golsMarcados++;
    }

    public void darAssistencia() {
        this.assistencias++;
    }

    @Override
    public String toString() {
        return "---" + getNome() + "---"
                + "\nGols Marcados: " + golsMarcados
                + "\nAssistencias: " + assistencias
                + "\n";
    }

}
