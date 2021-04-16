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
public class Encomenda{
    private Double altura;
    private Double largura;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;
    private Boolean enviado;

    public Encomenda(Double altura, Double largura, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda){
        this.altura = altura;
        this.largura = largura;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
        this.enviado = false;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }
    
    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString() {
        return "Encomenda{" + "altura=" + altura + ", largura=" + largura + ", enderecoRemetente=" + enderecoRemetente + ", enderecoDestinatario=" + enderecoDestinatario + ", distancia=" + distancia + ", valorEncomenda=" + valorEncomenda + ", enviado=" + enviado + '}';
    }

}