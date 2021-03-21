/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encomendas;

/**
 *
 * @author castr
 */
public class Encomendas {
    Double altura;
    Double largura;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    
    public Double calcularFrete(Double altura, Double largura){
        Double valorFinal = 0.00;
        if (altura >= 16.00 || largura >= 51.00){
            valorFinal = valorFinal + ((1 / 100) * valorEncomenda);
        } 
        else if (altura >= 7.00 && altura < 16.00 || largura >=16.00 && largura < 51.00){
            valorFinal = valorFinal + ((3 / 100) * valorEncomenda);
        }
        else if (altura > 0.00 && altura < 7.00 || largura > 0.00 && largura < 16.00){
            valorFinal = valorFinal + ((5 / 100) * valorEncomenda);
            System.out.println(valorFinal);
        }
        
        if(distancia <= 50.00){
            valorFinal = valorFinal + 3.00;
        }
        else if (distancia > 50.00 && distancia <= 200.00){
            valorFinal = valorFinal + 5.00;
        }
        else if (distancia > 200.00){
            valorFinal = valorFinal + 7.00;
        }
        return valorFinal;
    }
    
    public void emitirEtiqueta(String enderecoRemetente, String enderecoDestinatario, Double altura, Double largura, Double valorEncomenda, Double distancia){
        System.out.println("**** ETIQUETA PARA ENVIO ****");
        System.out.println("Endreço do remetente: " + enderecoRemetente);
        System.out.println("Endreço do destinatário: " + enderecoDestinatario);
        System.out.println(String.format("Altura da encomenda: %.2fcm", altura));        
        System.out.println(String.format("Largura da encomenda: %.2fcm", largura));
        System.out.println("----------------------");
        System.out.println(String.format("Valor da encomenda: %.2fR$", valorEncomenda));
        System.out.println(String.format("Valor do frete: %.2fR$", calcularFrete(altura, largura)));
        System.out.println("----------------------");
        System.out.println(String.format("Valor total: %.2fR$", valorEncomenda + calcularFrete(altura, largura)));
    }
}