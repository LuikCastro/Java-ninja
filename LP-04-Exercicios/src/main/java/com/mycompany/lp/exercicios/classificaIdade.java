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
public class classificaIdade {
    
    public static void classificaIdade(Integer idade){
        if (idade >= 0 && idade <= 2){
            System.out.println("Bebê");
        } 
        else if (idade >= 3 && idade <= 11){
            System.out.println("Criança");
        }
        else if (idade >= 12 && idade <= 19){
            System.out.println("Adolescente");
        }
        else if (idade >= 20 && idade <= 30){
            System.out.println("Jovem");
        }
        else if (idade >= 31 && idade <= 60){
            System.out.println("Adulto");
        }
        else if (idade >= 12 && idade <= 19){
            System.out.println("Adolescente");
        }
        else if (idade > 60){
            System.out.println("Idoso");
        }
    }
    
    public static void main(String[] args) {
        Integer idade;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a sua idade.");
        
        idade = leitor.nextInt();
        classificaIdade(idade);
    }
}
