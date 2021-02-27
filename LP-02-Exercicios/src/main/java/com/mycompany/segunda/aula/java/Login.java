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
public class Login {
    public static void main(String[] args) {
        String login, senha;
        Integer quantidade;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu login");
        login = leitor.next();
        
        System.out.println("Digite sua senha");
        senha = leitor.next();
        
        System.out.println("Digite a quantidade de tentativas");
        quantidade = leitor.nextInt();
        
        System.out.println("Seu login é " + login + " e sua senha é " + senha + ". Você tem " + quantidade + " tentativas antes de ser bloqueado");
    }
}
