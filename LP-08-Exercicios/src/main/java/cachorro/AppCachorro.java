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
public class AppCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setApelido("Murphy");
        cachorro1.setPorte("Medio");
        cachorro1.setPeso(29.00);
        
        Cachorro cachorro2 = new Cachorro("Thor", "Pequeno", 13.00);
        Cachorro cachorro3 = new Cachorro("Odin", "Grande", 42.00);
       
        
        cachorro1.Comer("Ração", 2.00);
        cachorro1.Comer("Ração", 5.00);
        cachorro1.Comer("Ração", 2.00);
        System.out.println("-----------------");
        cachorro2.Comer("Ração", 3.00);
        cachorro2.Comer("Ração", 4.00);
        cachorro2.Comer("Ração", 3.00);
        cachorro2.Comer("Ração", 3.00);
        System.out.println("-----------------");
        cachorro3.Comer("Ração", 6.00);
        cachorro3.Comer("Ração", 5.00);
        cachorro3.Comer("Ração", 2.00);
        System.out.println("*****************");
        System.out.println("Apelido: " + cachorro1.getApelido() + "\nPeso: " + cachorro1.getPeso());
        System.out.println("Apelido: " + cachorro2.getApelido() + "\nPeso: " + cachorro2.getPeso());
        System.out.println("Apelido: " + cachorro3.getApelido() + "\nPeso: " + cachorro3.getPeso());
        
    }
}
