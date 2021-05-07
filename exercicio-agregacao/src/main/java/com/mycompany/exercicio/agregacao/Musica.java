/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.agregacao;

import java.time.LocalDate;

/**
 *
 * @author luik
 */
public class Musica {

    private String artista;
    private String faixa;
    private Double duracao;
    private Boolean single;

    public Musica(String artista, String faixa, Double duracao, Boolean single) {
        this.artista = artista;
        this.faixa = faixa;
        this.duracao = duracao;
        this.single = single;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Boolean getSingle() {
        return single;
    }

    public void setSingle(Boolean single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return "Musica{" + "artista=" + artista + ", faixa=" + faixa + ", duracao=" + duracao + ", single=" + single + '}';
    }
}
