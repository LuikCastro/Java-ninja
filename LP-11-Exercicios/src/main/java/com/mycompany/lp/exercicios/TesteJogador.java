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
public class TesteJogador {
    public static void main(String[] args) {
        
        Jogador jogador = new Jogador("Cristiano Ronaldo", 7);
        System.out.println(jogador);
        
        Atacante atacante = new Atacante("Neymar Jr", 10);
        Goleiro goleiro = new Goleiro("Manuel Neuer", 1);
        
        for (int i = 0; i < 5; i++){
            atacante.darAssistencia();
        }
        
        for (int i = 0; i < 2; i++){
            atacante.marcarGol();
        }
        
        for (int i = 0; i < 2; i++){
            goleiro.defenderPenalti();
        }
        
        for (int i = 0; i < 1; i++){
            goleiro.sofrerGol();
        }
        
        System.out.println(atacante);
        System.out.println(goleiro);
        
      
    }
}
