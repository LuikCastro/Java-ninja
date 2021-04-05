/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadinhos;

import java.util.Random;
/**
 *
 * @author castr
 */
public class Dadinho {
    Random aleatorio = new Random();
    private Integer dado1;
    private Integer dado2;
    
    public Dadinho(){
        
    }
    
    public void sorteio(){
        dado1 = aleatorio.nextInt(6) + 1;
        dado2 = aleatorio.nextInt(6) + 1;
        System.out.println(dado1);
        System.out.println(dado2);
    }

    public Integer getDado1() {
        return dado1;
    }

    public void setDado1(Integer dado1) {
        this.dado1 = dado1;
    }

    public Integer getDado2() {
        return dado2;
    }

    public void setDado2(Integer dado2) {
        this.dado2 = dado2;
    }
}
