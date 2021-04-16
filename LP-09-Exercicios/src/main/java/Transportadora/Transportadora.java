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
public class Transportadora {
    private String nome;
    private Integer envio;
    private Double faturamento;
    
    public Transportadora(String nome){
        this.nome = nome;
        this.envio = 0;
        this.faturamento = 0.0;
    }
    
    private Double calcularFrete(Encomenda encomenda){
        Double valorFrete = 0.00;
        if (encomenda.getAltura() >= 16.00 || encomenda.getLargura() >= 51.00){
            valorFrete = ((1 / 100) * encomenda.getValorEncomenda());
        } 
        else if (encomenda.getAltura() >= 7.00 && encomenda.getAltura() < 16.00 || encomenda.getLargura() >=16.00 && encomenda.getLargura() < 51.00){
            valorFrete = ((3 / 100) * encomenda.getValorEncomenda());
        }
        else if (encomenda.getAltura() > 0.00 && encomenda.getAltura() < 7.00 || encomenda.getLargura() > 0.00 && encomenda.getLargura() < 16.00){
            valorFrete = ((5 / 100) * encomenda.getValorEncomenda());
            System.out.println(valorFrete);
        }
        
        if(encomenda.getDistancia() <= 50.00){
            valorFrete += 3.00;
        }
        else if (encomenda.getDistancia() > 50.00 && encomenda.getDistancia() <= 200.00){
            valorFrete += 5.00;
        }
        else if (encomenda.getDistancia() > 200.00){
            valorFrete += 7.00;
        }
        return valorFrete;
    }
    
    private void emitirEtiqueta(Encomenda encomenda){
        System.out.println("******* ETIQUETA PARA ENVIO *******");
        System.out.println("Endereço do remetente: " + encomenda.getEnderecoRemetente());
        System.out.println("Endereço do destinatário: " + encomenda.getEnderecoDestinatario());
        System.out.println("Altura da encomenda: " + encomenda.getAltura() + "cm");
        System.out.println("Largura da encomenda: " + encomenda.getLargura() + "cm");
        System.out.println("-----------------------------------");
        System.out.println("Valor da encomenda: R$" + encomenda.getValorEncomenda());
        System.out.println("Valor do frete: R$" + calcularFrete(encomenda).toString());
        System.out.println("-----------------------------------");
        System.out.println(String.format("Valor total: R$%.2f", encomenda.getValorEncomenda()+ calcularFrete(encomenda)));
    }
    
    public void enviar(Encomenda encomenda){
        if (encomenda.getEnviado() == false){
            encomenda.setEnviado(true);
            this.envio++;
            this.faturamento+= calcularFrete(encomenda);
            emitirEtiqueta(encomenda);
        } else{
            System.out.println("Envio já realizado!!!!!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnvio() {
        return envio;
    }

    public void setEnvio(Integer envio) {
        this.envio = envio;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "Transportadora{" + "nome=" + nome + ", envio=" + envio + ", faturamento=" + faturamento + '}';
    }
    
}
