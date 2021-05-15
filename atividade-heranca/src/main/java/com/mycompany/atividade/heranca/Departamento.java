/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.heranca;

import java.util.ArrayList;
import java.util.List;

/** Esta classe representa uma agregação de VendedorComissao.
 * 
 *  Ela contém um List de VendedorComissao.
 *  Esse List pode ocnter objetos de VendedorComissao e também objetos das 
 *  classes herdeiras de VendedorComissao.
 *
 * @author CYOT7
 */
public class Departamento {
    
    // Atributo
    private List<VendedorComissao> lista;
    
    // Construtor
    public Departamento() {
        lista = new ArrayList();
    }
    
    // Métodos
    
    /* Método adicionaVendedor - Recebe um objeto do tipo VendedorComissao, e adiciona 
       esse objeto à lista do Departamento. Esse objeto pode ser um objeto da classe 
       VendedorComissao ou da classe VendedorComissaoMaisFixo.
    */
    public void adicionaVendedor(VendedorComissao v) {
        lista.add(v);
    }
    
    
    /* Método exibeTodos - Percorre a lista dos vendedores do Departamento, exibindo
       as informações de cada vendedor
    */
    public void exibeTodos() {
        System.out.println("Lista dos vendedores:");
        for (VendedorComissao v : lista) {
            System.out.println(v);
        }
    }
    
    /* Método calcularTotalSalario - Percorre a lista dos vendedores do Departamento,
       calcula o total de salários do departamento e retorna esse valor
    */
    public Double calcularTotalSalario() {
        Double total = 0.0;
        for (VendedorComissao v : lista) {
            total += v.calcularSalario();
        }
        return total;
    }
 
    /* Método exibeVendedorComissaoMaisFixo - Percorre a lista dos vendedores do 
       Departamento, exibindo os dados apenas dos vendedores que ganham comissão
       mais salário fixo
    */
    public void exibeVendedorComissaoMaisFixo() {
        for (VendedorComissao v : lista) {
            /* Verifica se o objeto v é uma instãncia de VendedorComissaoMaisFixo
               Se for, exibe suas informações
            */
            if (v instanceof VendedorComissaoMaisFixo) {
                System.out.println(v);
            }
        }
    }
    
}
