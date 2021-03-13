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
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Bolo boloUm = new Bolo();
        
        System.out.println("Digite o sabor do bolo");
        boloUm.sabor = leitor.next();
        
        System.out.println("Digite o valor deste bolo");
        boloUm.valor = leitor.nextDouble();
        
        System.out.println("Digite quantos bolos já vendeu");
        boloUm.quantidadeVenda = leitor.nextInt();
        
        System.out.println("Digite a quantidade de bolos que você deseja comprar");
        boloUm.comprarBolo(leitor.nextInt());
        boloUm.exibirRelatorio();
        
        Bolo boloDois = new Bolo();
        
        System.out.println("Digite o sabor do bolo");
        boloDois.sabor = leitor.next();
        
        System.out.println("Digite o valor deste bolo");
        boloDois.valor = leitor.nextDouble();
        
        System.out.println("Digite quantos bolos já vendeu");
        boloDois.quantidadeVenda = leitor.nextInt();
        
        System.out.println("Digite a quantidade de bolos que você deseja comprar");
        boloDois.comprarBolo(leitor.nextInt());
        boloDois.exibirRelatorio();
        
        Bolo boloTres = new Bolo();
        
        System.out.println("Digite o sabor do bolo");
        boloTres.sabor = leitor.next();
        
        System.out.println("Digite o valor deste bolo");
        boloTres.valor = leitor.nextDouble();
        
        System.out.println("Digite quantos bolos já vendeu");
        boloTres.quantidadeVenda = leitor.nextInt();
        
        System.out.println("Digite a quantidade de bolos que você deseja comprar");
        boloTres.comprarBolo(leitor.nextInt());
        boloTres.exibirRelatorio();
   }
}
