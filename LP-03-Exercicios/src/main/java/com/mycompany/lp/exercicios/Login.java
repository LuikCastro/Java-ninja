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
public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String login, senha;
        Boolean validacao = true;
        
        do{
            System.out.println("Digite seu login");
            login = leitor.next();
            System.out.println("Digite sua senha");
            senha = leitor.next();
            
            if ("admin".equals(login) && "#Bandtec".equals(senha)){
                validacao = false;
                System.out.println("Login realizado com sucesso!");
            } else{
                System.out.println("Login ou senha inválido.");
            }
        } while (validacao);
    }
}
