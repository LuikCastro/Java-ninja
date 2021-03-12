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
    Double temperaturaAtual, temperaturaMax, temperaturaMin;
    Scanner leitor = new Scanner(System.in);
    
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
}
