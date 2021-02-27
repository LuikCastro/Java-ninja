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
public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double bruto, transporte, liquido, desconto1, desconto2, desconto3, desconto_total;
        Double inss = 10.00 / 100;
        Double ir = 20.00 / 100;
        
        System.out.println("Digite seu salário bruto");
        bruto = leitor.nextDouble();
        
        System.out.println("Digite o valor total do transporte só de ida");
        transporte = leitor.nextDouble();
        
        desconto1 = (inss * bruto);
        desconto2 = (ir * bruto);
        desconto3 = ((transporte * 2) * 22);
        
        desconto_total = desconto1 + desconto2 + desconto3;
        
        liquido = bruto - desconto_total;
        
        System.out.println(String.format("Seu bruto é de R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", bruto, desconto_total, liquido));
    }
}
