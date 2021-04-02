/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachorro;

/**
 *
 * @author castr
 */
public class Cachorro {
    String apelido;
    String porte;
    Double peso;
    
    public Cachorro() {
        
    }
    
    public Cachorro (String apelido, String porte, Double peso){
        this.apelido = apelido;
        this.porte = porte;
        this.peso = peso;
    }
    
    public void Comer(String nomeComida, Double quantidadeKg){
        if (quantidadeKg > 0){
            if ("Pequeno".equals(this.porte) && this.peso < 15.00){
                System.out.println("Cão comeu " + quantidadeKg + "kg de " + nomeComida);
                this.peso = this.peso + ((30 / 100) * quantidadeKg);
            }
            else{
                System.out.println("Cão obeso demais, não vai aceitar a comida");
            }
            if ("Medio".equals(this.porte) && this.peso < 30.00){
                System.out.println("Cão comeu " + quantidadeKg + "kg de " + nomeComida);
                this.peso = this.peso + ((30 / 100) * quantidadeKg);
            }
            else{
                System.out.println("Cão obeso demais, não vai aceitar a comida");
            }
            if ("Grande".equals(this.porte) && this.peso < 45.00){
                System.out.println("Cão comeu " + quantidadeKg + "kg de " + nomeComida);
                this.peso = this.peso + ((30 / 100) * quantidadeKg);
            }
            else{
                System.out.println("Cão obeso demais, não vai aceitar a comida");
            }
        }
        else{
            System.out.println("Quantidade inválida");
        }
    }
}


