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
    private String apelido;
    private String porte;
    private Double peso;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public Cachorro() {
        
    }
    
    public Cachorro (String apelido, String porte, Double peso){
        this.apelido = apelido;
        this.porte = porte;
        this.peso = peso;
    }
    
    public void Comer(String nomeComida, Double quantidadeKg){
        if (quantidadeKg > 0){
            if ("Pequeno".equals(this.porte) && this.peso < 15.00 || "Medio".equals(this.porte) && this.peso < 30.00 || "Grande".equals(this.porte) && this.peso < 45.00){
                System.out.println(this.apelido + " comeu " + quantidadeKg + "kg de " + nomeComida);
                this.peso = this.peso + (0.3 * quantidadeKg);
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


