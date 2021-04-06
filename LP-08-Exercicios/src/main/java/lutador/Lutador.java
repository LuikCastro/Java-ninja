/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutador;

/**
 *
 * @author castr
 */
public class Lutador {
    private Integer vida1;
    private Integer vida2;

    public Lutador(){
        vida1 = 100;
        vida2 = 100;
    }
    
    public void apanhar1(){
        if(vida1 <= 0 || vida2 <= 0){
            System.out.println("Luta já acabou");
        } else{
            vida1 -= 10;
            if (vida1 < 0){
                vida1 = 0;
            }
        }
       
    }
    
    public void apanhar2(){
        if(vida2 <= 0 || vida1 <= 0){
            System.out.println("Luta já acabou");
        } 
        else{
            vida2 -= 10;
            if (vida2 < 0){
                vida2 = 0;
            }
        }
    }
    
    public void concentrarForca1(){
        if (vida1 <= 0 || vida2 <= 0){
            System.out.println("Luta já acabou");
        } 
        else if(vida1 >=100) {
            System.out.println("Já está com vida máxima");
        }
        else{
            vida1 += 3;
            if (vida1 > 100){
                vida1 = 100;
            }
        }
    }
    
    public void concentrarForca2(){
        if (vida2 <= 0 || vida1 <= 0){
            System.out.println("Luta já acabou");
        } 
        else if(vida2 >=100) {
            System.out.println("Já está com vida máxima");
        }
        else{
            vida2 += 3;
            if (vida2 > 100){
                vida2 = 100;
            }
        }
    }

    public Integer getVida1() {
        return vida1;
    }

    public Integer getVida2() {
        return vida2;
    }
}
