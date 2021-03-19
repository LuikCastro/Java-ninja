/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encomendas;

import Encomendas.Encomendas;

/**
 *
 * @author castr
 */
public class TesteEncomendas {
    public static void main(String[] args) {
        Encomendas encomendaUm = new Encomendas();
        
        encomendaUm.altura = 6.00;
        encomendaUm.largura = 15.00;
        encomendaUm.enderecoRemetente = "Rua adria número 10";
        encomendaUm.enderecoDestinatario = "Avenida Belmira marim número 5";
        encomendaUm.distancia = 20.00;
        encomendaUm.valorEncomenda = 60.00;
        
        encomendaUm.calcularFrete(encomendaUm.altura, encomendaUm.largura);
        encomendaUm.emitirEtiqueta(encomendaUm.enderecoRemetente, encomendaUm.enderecoDestinatario, encomendaUm.altura, encomendaUm.largura, encomendaUm.valorEncomenda, encomendaUm.distancia);
    }
   
}
