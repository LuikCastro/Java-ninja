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
public class TesteTermometro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Termometro TermometroUm = new Termometro();
        
        System.out.println("Digite a temperatura atual");
        TermometroUm.temperaturaAtual = leitor.nextDouble();
        
        System.out.println("Digite a temperatura máxima");
        TermometroUm.temperaturaMax = leitor.nextDouble();
        
        System.out.println("Digite a temperatura mínima");
        TermometroUm.temperaturaMin = leitor.nextDouble();
        
        System.out.println("Atual: " + TermometroUm.temperaturaAtual + "\nMáxima: " + TermometroUm.temperaturaMax + "\nMínima: " + TermometroUm.temperaturaMin);
        
        System.out.println("Digite um número para aumentar");
        TermometroUm.aumentaTemperatura(leitor.nextDouble());
        
        System.out.println("Digite um número para diminuir");
        TermometroUm.diminuiTemperatura(leitor.nextDouble());
        
        TermometroUm.exibeFahreinheit();
        
        Termometro TermometroDois = new Termometro();
        
        System.out.println("Digite a temperatura atual");
        TermometroDois.temperaturaAtual = leitor.nextDouble();
        
        System.out.println("Digite a temperatura atual");
        TermometroDois.temperaturaAtual = leitor.nextDouble();
        
        System.out.println("Digite a temperatura máxima");
        TermometroDois.temperaturaMax = leitor.nextDouble();
        
        System.out.println("Digite a temperatura mínima");
        TermometroDois.temperaturaMin = leitor.nextDouble();
        
        System.out.println("Atual: " + TermometroUm.temperaturaAtual + "\nMáxima: " + TermometroUm.temperaturaMax + "\nMínima: " + TermometroUm.temperaturaMin);
        
        System.out.println("Digite um número para aumentar");
        TermometroDois.aumentaTemperatura(leitor.nextDouble());
        
        System.out.println("Digite um número para diminuir");
        TermometroDois.diminuiTemperatura(leitor.nextDouble());
        
        TermometroDois.exibeFahreinheit();
    }
}
