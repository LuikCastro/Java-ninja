/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.heranca;

/** Classe VendedorComissaoMaisFixo 
 * 
 *  Representa um vendedor que ganha seu salário na base da comissão sobre as vendas
 *  realizadas, mas que também tem um salário fixo mensal.
 * 
 *  Esta classe é herdeira de VendedorComissao
 *
 * @author CYOT7
 */
public class VendedorComissaoMaisFixo extends VendedorComissao {
    
    // Atributo
    private Double salarioFixo;         // salário fixo do vendedor
    
    // Construtor

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }
    
    // Métodos

    // Sobrescrita ou reescrita de método
    // Isto é necessário quando precisamos implementar um método herdado, para adequar
    // o comportamento à classe filha
    // Neste caso, se apenas herdar o método da classe mãe, não vai calcular o salário corretamente,
    // pois o calcularSalario da classe mãe não leva em conta o salário fixo do vendedor
    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + salarioFixo;
    }

    /* toString() da classe herdeira - acrescentamos aqui a chamada ao toString() da classe mãe */
    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo{" + super.toString() + ", salarioFixo=" + salarioFixo + '}';
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    
    
    
    
}
