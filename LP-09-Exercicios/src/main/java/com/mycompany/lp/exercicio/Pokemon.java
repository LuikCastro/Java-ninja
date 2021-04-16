/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicio;

/**
 *
 * @author castr
 */
public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;
    
    public Pokemon(){
        this.doces = 0;
        this.forca = 5.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", tipo=" + tipo + ", forca=" + forca + ", doces=" + doces + '}';
    }
    
}
