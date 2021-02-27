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
public class MediaNota {
    public static void main(String[] args) {
        String nome;
        Double nota1, nota2, nota_final;
        Boolean aprovado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome.");
        nome = leitor.next();
        
        System.out.println("Digite sua primeira nota");
        nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua segunda nota");
        nota2 = leitor.nextDouble();
        
        nota_final = (nota1 * 0.4)+(nota2 * 0.6);
        
        aprovado = nota_final >=6;
        
        if (aprovado){
            System.out.println(String.format("Olá " + nome + " sua média foi %.2f. Você foi aprovado", nota_final));
        }
        if (!aprovado){
            System.out.println(String.format("Olá " + nome + " sua média foi %.2f. Você foi reprovado", nota_final));
        }
    }
}
