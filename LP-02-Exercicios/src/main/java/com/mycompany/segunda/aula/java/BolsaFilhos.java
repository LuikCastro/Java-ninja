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
public class BolsaFilhos {
    public static void main(String[] args) {
        Integer filhos1, filhos2, filhos3, quantidade;
        Double valor;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite quantos filhos você tem de 0 a 3 anos");
        filhos1 = leitor.nextInt();
        
        System.out.println("Digite quantos filhos você tem de 4 a 16 anos");
        filhos2 = leitor.nextInt();
        
        System.out.println("Digite quantos filhos você tem de 17 a 18 anos");
        filhos3 = leitor.nextInt();
        
        quantidade = filhos1 + filhos2 + filhos3;
        
        valor = (filhos1 * 25.12) + (filhos2 * 15.88) + (filhos3 * 12.44);
        
        System.out.println(String.format("Você tem um total de " + quantidade + " filhos e vai receber R$%.2f de bolsa", valor));
    }
}
