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
public class AcerteNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero, numeroAleatorio, contador;
        System.out.println("Digite um número de 0 a 10");
        numero = leitor.nextInt();
        contador = 0;
        do {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0,10);
            contador++;
            System.out.println(numeroAleatorio);
        } while (!numeroAleatorio.equals(numero));
        
        if (contador <= 3){
            System.out.println("Você é MUITO sortudo");
        }
        else if (contador >3 && contador <= 10){
            System.out.println("Você é sortudo");
        }
        else if (contador > 10){
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
