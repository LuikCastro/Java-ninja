/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;

/**
 *
 * @author Aluno
 */
public class VariacaoContador {
    public static void main(String[] args) {
        for(double i = 0.15; i < 5; i+=0.15){
            System.out.println(String.format("%.2f", i));
        }
    }
}
