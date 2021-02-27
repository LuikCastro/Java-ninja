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
public class Votacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer contador_mussarela = 0;
        Integer contador_calabresa = 0;
        Integer contador_quatro_queijos = 0;
        Integer voto;
        
        
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite seu voto");
            voto = leitor.nextInt();
            switch (voto) {
                case 5:
                    contador_mussarela++;
                    break;
                case 25:
                    contador_calabresa++;
                    break;
                case 50:
                    contador_quatro_queijos++;
                    break;
                default:
                    System.out.println("Voto inválido");
                    break;
            }
        }
        System.out.println("A pizza de calabresa teve " + contador_calabresa + " votos, a pizza de mussarela teve " + contador_mussarela + " votos e a pizza de quatro queijos teve " + contador_quatro_queijos + " votos!");
        if (contador_calabresa > contador_mussarela && contador_calabresa > contador_quatro_queijos){
            System.out.println("A pizza mais votada foi a de calabresa!");
        }
        else if (contador_mussarela > contador_calabresa && contador_mussarela > contador_quatro_queijos){
            System.out.println("A pizza mais votada foi a de mussarela!");
        }
        else if (contador_quatro_queijos > contador_calabresa && contador_quatro_queijos > contador_mussarela){
            System.out.println("A pizza mais votada foi a de quatro queijos!");
        }
    }
}
