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
public class CalculadoraTroco {
    public static void main(String[] args) {
        Double valor, valor_pago, troco;
        Integer quantidade;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto.");
        valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de produto.");
        quantidade = leitor.nextInt();
        
        System.out.println("Digite o valor pago pelo cliente.");
        valor_pago = leitor.nextDouble();
        
        troco = valor_pago - (valor * quantidade);
        System.out.println("Seu troco sera de R$" + troco);
    }
}
