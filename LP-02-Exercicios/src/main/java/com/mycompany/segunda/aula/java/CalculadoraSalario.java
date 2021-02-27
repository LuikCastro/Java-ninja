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
public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double salario, porcentagem, salario_liquido;
        System.out.println("Digite seu salário");
        salario = leitor.nextDouble();
        System.out.println("Digite porcentagem de imposto");
        porcentagem = leitor.nextDouble();
        porcentagem = porcentagem / 100;
        salario_liquido = salario - (salario * porcentagem);
        
        System.out.println("Seu salário liquído será de " + salario_liquido);
    }
}
