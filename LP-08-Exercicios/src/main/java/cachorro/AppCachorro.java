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
        cachorro1.setPeso(20.00);
        
        Cachorro cachorro2 = new Cachorro("Thor", "Pequeno", 4.00);
        Cachorro cachorro3 = new Cachorro("Odin", "Grande", 35.00);
       
        
        cachorro1.Comer("Ração", 2.00);
       
    }
}
