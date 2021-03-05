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
public class exibirDivisores {
    public static void Divisor(Integer numero){
        for (int i = numero; i > 0; i--){
            if(numero%i==0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        Divisor(numero);
    }
}
