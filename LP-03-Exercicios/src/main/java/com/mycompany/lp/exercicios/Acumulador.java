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
public class Acumulador {
    public static void main(String[] args) {
        Integer resultado = 0;
        Integer acrescentador;
        
        Scanner leitor = new Scanner(System.in);
        
        do{
            System.out.println("Digite um número inteiro");
            acrescentador = leitor.nextInt();
            resultado = resultado + acrescentador;
        } while (acrescentador != 0);
        System.out.println("A soma total é: " + resultado);
    }
}
