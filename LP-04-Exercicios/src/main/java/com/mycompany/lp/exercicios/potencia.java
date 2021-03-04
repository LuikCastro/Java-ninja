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
public class potencia {
    
    public static Integer potencia(Integer numero, Integer exponente){
        Integer resultado = numero;
        for (int i = exponente; i > 1; i--){
                resultado = resultado *  numero;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Integer numeroUm, numeroDois;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número");
        numeroUm = leitor.nextInt();
        
        System.out.println("Digite o exponente");
        numeroDois = leitor.nextInt();
        System.out.println(potencia(numeroUm, numeroDois));
    }
}

