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
        if (temperatura > temperaturaMax){
            temperaturaMax = temperatura;
        }
    }
    
    public void diminuiTemperatura(Double temperatura){
        if (temperatura < temperaturaMin){
            temperaturaMin = temperatura;
        }
    }
    
    public void exibeFahreinheit (){
        Double Fahreinheit = (temperaturaAtual * 9) / 5;
        System.out.println("A temperatura atual em Fahreinheit é: " + Fahreinheit);
    }
}
