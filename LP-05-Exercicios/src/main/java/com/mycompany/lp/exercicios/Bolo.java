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
public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVenda;
    
    public void comprarBolo(Integer quantidadeBolo){
        Integer quantidadeValidacao = quantidadeVenda + quantidadeBolo;
        if (quantidadeValidacao <= 100){
            quantidadeVenda += quantidadeBolo;
        }
        else{
            System.out.println("Seu pedido ultrapassou nosso limite diário para este bolo");
        }
    }
    public void exibirRelatorio(){
        System.out.println(String.format("O bolo de %s, foi comprado %d vezez hoje, totalizando R$%.2f ", sabor, quantidadeVenda, valor * quantidadeVenda));
    }
}
