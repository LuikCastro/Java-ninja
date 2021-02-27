/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Calculadora {
    public static void main(String[] args) {
        Integer numero1, numero2;
        System.out.println("Digite um número");
        Scanner leitor1 = new Scanner(System.in);
        numero1 = leitor1.nextInt();
        System.out.println("Digite outro número");
        Scanner leitor2 = new Scanner(System.in);
        numero2 = leitor2.nextInt();
        Integer soma = numero1 + numero2;
        Integer subtracao = numero1 - numero2;
        Integer multiplicacao = numero1 * numero2;
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
    }
}
