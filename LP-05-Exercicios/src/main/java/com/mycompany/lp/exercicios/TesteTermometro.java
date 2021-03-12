/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;

/**
 *
 * @author castr
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro TermometroUm = new Termometro();
        
        TermometroUm.temperaturaAtual = 24.0;
        TermometroUm.temperaturaMax = 35.0;
        TermometroUm.temperaturaMin = 18.0;
        
        TermometroUm.aumentaTemperatura(5.0);
        TermometroUm.diminuiTemperatura(20.0);
        TermometroUm.exibeFahreinheit();
    }
}
