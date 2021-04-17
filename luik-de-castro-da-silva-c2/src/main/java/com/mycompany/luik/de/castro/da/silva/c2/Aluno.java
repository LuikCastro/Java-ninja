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
public class Aluno {
    String ra;
    String nome;
    Boolean ativo;
    Boolean inadimplente;
    Double media;
    
    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.ativo = true;
        this.inadimplente = false;
    }
    
    public Aluno(){
        this.ativo = true;
        this.inadimplente = false;
    }
    
    public void calcularMedia(Double nota1, Double nota2){
        this.media = (nota1 * 0.4) + (nota2 * 0.6);
    }
    
    public void calcularMedia(Double nota1, Double nota2, Double nota3){
        this.media = (nota1 + nota2 + nota3) / 3;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getInadimplente() {
        return inadimplente;
    }

    public void setInadimplente(Boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "***ALUNO***:" + "\nRA: " + ra + "\nNome:" + nome + "\nAtivo:" + ativo + "\nInadimplente:" + inadimplente + "\nMedia: " + media;
    }
}
