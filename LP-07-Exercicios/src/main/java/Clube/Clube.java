/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clube;

/**
 *
 * @author castr
 */
public class Clube {
    private String nomeClube = "";
    private Integer vitoria = 0;
    private Integer derrota = 0;
    private Integer empate = 0;
    private Integer pontos = 0;
    
    
    // métodos para registrar
    public void registrarVitoria(){
        vitoria++;
        pontos += 3;
    }
    
    public void registrarEmpate(){
        empate++;
        pontos += 1;
    }
    
    public void registrarDerrota(){
        derrota++;
    }
   
    // Encapsulamento 
    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }
    
    public String getNomeClube() {
        return nomeClube;
    }

    public Integer getVitoria() {
        return vitoria;
    }

    public Integer getDerrota() {
        return derrota;
    }

    public Integer getEmpate() {
        return empate;
    }

    public Integer getPontos() {
        return pontos;
    }
}
