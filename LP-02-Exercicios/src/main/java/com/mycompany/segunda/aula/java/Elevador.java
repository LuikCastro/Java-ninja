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
public class Elevador {
    public static void main(String[] args) {
        
        Double peso_total, limite_peso, peso1, peso2, peso3;
        Integer pessoas_limite;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso");
        
        limite_peso = leitor.nextDouble();
        
        System.out.println("Digite o limite de pessoas");
        pessoas_limite = leitor.nextInt();
        
        System.out.println("Qual é o peso da 1º pessoa que entrou no elevador?");
        peso1 = leitor.nextDouble();
        
        System.out.println("Qual é o peso da 2º pessoa que entrou no elevador?");
        peso2 = leitor.nextDouble();
        
        System.out.println("Qual é o peso da 3º pessoa que entrou no elevador?");
        peso3 = leitor.nextDouble();
        
        peso_total = peso1 + peso2 + peso3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabe " + pessoas_limite + ". O peso total do elevador é de " + peso_total + ", sendo que ele suporta " + limite_peso);
    }
}
