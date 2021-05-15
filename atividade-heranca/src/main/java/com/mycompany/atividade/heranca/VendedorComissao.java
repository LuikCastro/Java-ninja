/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.heranca;

/** Classe VendedorComissao
 * 
 *  Representa um vendedor que ganha seu salário baseado em comissão sobre as vendas
 * 
 * @author CYOT7
 */
public class VendedorComissao {
    
    // Atributos
    private Integer codigo;         // identificador do vendedor
    private String nome;            // nome do vendedor
    private Double vendas;          // total de vendas realizadas no mês (em reais)
    private Double taxa;            // taxa de comissão sobre as vendas (por ex: 0.10 = 10%)
    
    // Construtor

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    
    // Métodos
    
    /* Método calcularSalario() - calcula e retorna o salário do vendedor */
    public Double calcularSalario() {
        return vendas * taxa;
    }

    /* Método toString() - retorna uma String com as informações sobre o vendedor,
       inclusive o seu salário
    */
    @Override
    public String toString() {
        return "VendedorComissao{" + "codigo=" + codigo + ", nome=" + nome + 
                ", vendas=" + vendas + ", taxa=" + taxa + 
                ", salário=" + calcularSalario() + '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    
    
    
}
