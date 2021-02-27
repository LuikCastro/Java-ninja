/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segunda.aula.java;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer aquecimento, aerobicos, musculacao, calorias, tempo;
        System.out.println("Quantos minutos de aquecimento você fez?");
        aquecimento = leitor.nextInt();
        
        System.out.println("Quantos minutos de aeróbica você fez?");
        aerobicos = leitor.nextInt();
        
        System.out.println("Quantos minutos de musculação você fez?");
        musculacao = leitor.nextInt();
        
        calorias = (aquecimento * 12) + (aerobicos * 20) + (musculacao * 25);
        tempo = aquecimento + aerobicos + musculacao;
        
        System.out.println("Olá Jorge. Você fez um total de " + tempo + " minutos de exercício e perdeu cerca de " + calorias + " calorias.");
    }
}
