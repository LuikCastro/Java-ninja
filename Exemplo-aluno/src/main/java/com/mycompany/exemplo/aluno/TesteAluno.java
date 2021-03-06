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
public class TesteAluno {
    public static void main(String[] args) {
        Aluno joao = new Aluno();
        
        joao.ra = 1202021;
        joao.nome = "João Amorim";
        joao.nota1 = 10.0;
        joao.nota2 = 8.0;
        joao.quantidadeFaltas = 0;
        
        joao.verNotas();
        joao.verFaltas();
        
        System.out.println("O aluno " + joao.nome + ", RA " + joao.ra + " tem média " + joao.calculaMedia());
        joao.exibeStatus();
    }
    
    
}
