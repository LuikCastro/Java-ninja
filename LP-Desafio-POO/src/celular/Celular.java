/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular;

/**
 *
 * @author castr
 */

public class Celular {
    private Integer bateria;
    
    public Celular(){
        bateria = 100;
    }
    
    public Celular(Integer bateria){
        this.bateria = bateria;
    }
    
    public void jogar(){
        if (bateria == 0){
            System.out.println("Celular descarregado");
        } 
        else {
            bateria-=20;
            if(bateria < 0){
                bateria = 0;
                System.out.println("Celular descarregado");
            }
        }
    }
    
    public void fazerLigacao(){
        if (bateria == 0){
            System.out.println("Celular descarregado");
        } 
        else {
            bateria -= 5;
            if (bateria < 0){
                bateria = 0;
                System.out.println("Celular descarregado");
            }
        }
    }
    
    public void assistirVideo(){
        if (bateria == 0){
            System.out.println("Celular descarregado");
        } 
        else {
            bateria -=15;
            if (bateria < 0){
                bateria = 0;
                System.out.println("Celular descarregado");
            }
        }
    }
    
    public void carregarCelular(){
        if (bateria == 100){
            System.out.println("Celular já está carregado");
        } 
        else {
            bateria+=25;
            if (bateria > 100){
                bateria = 100;
                System.out.println("Celular foi carregado 100%");
            }
        }
    }
    
    public Integer getBateria() {
        return bateria;
    }
    
}