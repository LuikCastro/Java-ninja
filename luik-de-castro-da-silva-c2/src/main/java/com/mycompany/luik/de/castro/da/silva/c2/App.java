/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luik.de.castro.da.silva.c2;

/**
 *
 * @author castr
 */
public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("01202054", "Luik Castro Silva");
        Aluno aluno2 = new Aluno();
        aluno2.setRa("01202053");
        aluno2.setNome("João Pedro");
        Aluno aluno3 = new Aluno();
        aluno3.setRa("01202055");
        aluno3.setNome("Maria Julia");
        
        aluno1.calcularMedia(10.0, 10.0);
        aluno2.calcularMedia(5.0, 5.0, 5.0);
        aluno3.calcularMedia(3.0, 4.0);
        
        Secretaria secretaria = new Secretaria();
        secretaria.registraPagemento(aluno1);
        secretaria.registraAtrasoPagamento(aluno2);
        secretaria.registraCancelamento(aluno3);
        
        secretaria.verificaAprovacaoAluno(aluno1);
        secretaria.verificaAprovacaoAluno(aluno2);
        secretaria.verificaAprovacaoAluno(aluno3);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(secretaria.toString());
    }
}
