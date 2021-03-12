/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicios;
/**
 *
 * @author castr
 */
public class Termometro { 
    Double temperaturaAtual, temperaturaMax, temperaturaMin;
    
    public void aumentaTemperatura(Double temperatura){
        temperaturaAtual = temperaturaAtual + temperatura;
        if (temperaturaAtual > temperaturaMax){
            temperaturaMax = temperaturaAtual;
        }
        System.out.println("Temperatura atual é: " + temperaturaAtual);
        System.out.println("Temperatura Máxima é: " + temperaturaMax);
    }
    
    public void diminuiTemperatura(Double temperatura){
        temperaturaAtual = temperaturaAtual - temperatura;
        if (temperaturaAtual < temperaturaMin){
            temperaturaMin = temperaturaAtual;
        }
        System.out.println("Temperatura atual é: " + temperaturaAtual);
        System.out.println("Temperatura Mínima é: " + temperaturaMin);
    }
    
    public void exibeFahreinheit (){
        Double Fahreinheit = (temperaturaAtual * 1.8) + 32;
        System.out.println(String.format("A temperatura atual em Fahreinheit é: %.2f", Fahreinheit));
    }
}
