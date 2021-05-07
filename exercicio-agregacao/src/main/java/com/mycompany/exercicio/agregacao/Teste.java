/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.agregacao;

/**
 *
 * @author luik
 */
public class Teste {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Twenty one pilots", "Stressed Out", 3.22, false);
        Musica musica2 = new Musica("Twenty one pilots", "Ride", 3.35, false);
        
        Album album1 = new Album("Blurryface");
        
        album1.registrarMusica(musica1);
        album1.registrarMusica(musica2);
        
        album1.exibeMusicas();
        
        album1.deletarMusica(musica1);
        
        album1.exibeMusicas();
    }
}
