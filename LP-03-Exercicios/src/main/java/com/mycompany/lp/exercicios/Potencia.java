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
public class Potencia {
    public static void main(String[] args) {
        Integer numero, expoente, resultado;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        System.out.println("Digite um expoente");
        expoente = leitor.nextInt();
        resultado = numero;
        for (int i = expoente; i > 1; i--){
            resultado = resultado * numero;
        }
        System.out.println("Resultado final: " + resultado);
    }
   
}
