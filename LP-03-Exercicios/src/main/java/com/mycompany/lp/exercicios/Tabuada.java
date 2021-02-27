/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    public static void main(String[] args) {
        Integer numero;
        System.out.println("Digite um número");
        Scanner leitor = new Scanner(System.in);
        numero = leitor.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println("2 x " + i + " = " + numero * i);
        }
    }
}
