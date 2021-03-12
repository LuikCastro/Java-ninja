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
public class Termometro { 
    public static Double aumentaTemperatura(Double temperaturaNova, Double temperaturaAtual){
        Double resultado = 0.0;
        if (temperaturaNova > temperaturaAtual){
            resultado = temperaturaNova;
        }
        else{
            resultado = temperaturaAtual;
        }
        return resultado;
    }
    
    public static Double diminuiTemperatura(Double temperaturaNova, Double temperaturaAtual){
        Double resultado = 0.0;
        if (temperaturaNova < temperaturaAtual){
            resultado = temperaturaNova;
        }
        else{
            resultado = temperaturaAtual;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Double temperaturaAtual, temperaturaMax, temperaturaMin;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma temperatura");
        temperaturaAtual = leitor.nextDouble();
        System.out.println("Digite outra temperatura");
        temperaturaMax = aumentaTemperatura(leitor.nextDouble(), temperaturaAtual);
        temperaturaMin = diminuiTemperatura(leitor.nextDouble(), temperaturaAtual);
    }
}
