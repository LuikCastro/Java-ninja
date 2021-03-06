/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.aluno;

/**
 *
 * @author castr
 */
public class Aluno {
    Integer ra;
    String nome;
    Integer quantidadeFaltas;
    Double nota1, nota2;
    
    public void verNotas(){
        System.out.println("Notas do aluno " + ", RA " + ra);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
    }
    
    public void verFaltas(){
        System.out.println("Quantidade de faltas: " + quantidadeFaltas);
    }
    
    
    public Double calculaMedia() {
        return nota1 * 0.4 + nota2 * 0.6;
    }

    
    public void exibeStatus(){
        System.out.print("Status do aluno " + nome + ", RA " + ra + ": ");
        if (calculaMedia() >= 6.0){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
