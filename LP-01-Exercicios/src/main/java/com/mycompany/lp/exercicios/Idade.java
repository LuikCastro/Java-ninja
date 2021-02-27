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
public class Idade {
    public static void main(String[] args) {
        System.out.println("Qual é seu nome?");
        String nome;
        Scanner leitorNome = new Scanner(System.in);
        nome = leitorNome.next();
        System.out.println("Olá, " + nome + "! Qual é o ano de seu nascimento?");
        Integer idade;
        Scanner leitorAno = new Scanner(System.in);
        idade = 2021 - leitorAno.nextInt();
        Integer resposta = idade + 9;
        System.out.println("Em 2030 você terá " + resposta + " anos.");
    }
}
