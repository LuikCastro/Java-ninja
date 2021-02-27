/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Sorteio {
    public static void main(String[] args) {
        Integer numeroUsuario, numeroAleatorio;
        Integer ContadorPar = 0;
        Integer ContadorImpar = 0;
        Integer ContadorVoltas = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 100");
        numeroUsuario = leitor.nextInt();
        
        for (int i = 1; i <= 200; i++){
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0,100);
            if (numeroAleatorio % 2 == 0){
                ContadorPar++;
            } 
            else{
                ContadorImpar++;
            }
            if (numeroAleatorio.equals(numeroUsuario)){
                if (ContadorVoltas == 0){
                    ContadorVoltas = i;
                }
            }
        }
        System.out.println("Foi sorteado um número par " + ContadorPar + " vezes");
        System.out.println("Foi sorteado um número impar " + ContadorImpar + " vezes");
        if (ContadorVoltas != 0){
            System.out.println("Seu número foi sorteado na " + ContadorVoltas +"º volta");
        }
    }
}
