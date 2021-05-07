/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.agregacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luik
 */
public class Album {

    private String nome;
    private List<Musica> lista;

    public Album(String nome){
        this.nome = nome;
        lista = new ArrayList();
    }
    
    public void registrarMusica(Musica musica){
        lista.add(musica);
    }
    
    public void deletarMusica(Musica musica){
        lista.remove(musica);
    }
    
    public void exibeMusicas() {
        System.out.println("Músicas do album: " + this.nome);
        
        lista.forEach(musica -> {
            System.out.println(musica);
        });
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Musica> getLista() {
        return lista;
    }

    public void setLista(List<Musica> lista) {
        this.lista = lista;
    }
    

}
