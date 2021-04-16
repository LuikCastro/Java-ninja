/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportadora;

/**
 *
 * @author castr
 */
public class TesteEnvio {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda(12.00, 8.00, "Rua adria", "Rua fernandes", 18.00, 16.00);
        Encomenda encomenda2 = new Encomenda(8.00, 4.00, "Rua adria", "Avenida Belmira Marim", 18.00, 16.00);
        Transportadora transportadora = new Transportadora("Correios");
        
        transportadora.enviar(encomenda1);
        transportadora.enviar(encomenda1);
        
        transportadora.enviar(encomenda2);
        
        System.out.println(transportadora.toString());
        System.out.println(encomenda1.toString());
        System.out.println(encomenda2.toString());
    }
}
