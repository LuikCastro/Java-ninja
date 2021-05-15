/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.heranca;

/**
 *
 * @author CYOT7
 */
public class Teste {
    
    
    public static Double media (Double num1, Double num2) {
        return (num1 + num2)/ 2;
    }

    public static Double media (Double num1, Double num2, Double num3) {
        return (num1 + num2 + num3)/ 3;
    }


    
    public static void main(String[] args) {
        // Cria objetos VendedorComissao e VendedorComissaoMaisFixo
        VendedorComissao vendedor1 = new VendedorComissao(1234, "Mickey", 20000.0, 0.10);
        VendedorComissaoMaisFixo vendedor2 = new VendedorComissaoMaisFixo(5678, "Pateta", 10000.0,
                                               0.10, 1000.0);
        
        // Exibe os dados dos vendedores
        System.out.println("Vendedor Comissao:");
        System.out.println(vendedor1);
        
        System.out.println("Vendedor Comissao Mais Fixo:");
        System.out.println(vendedor2);
        
        // Cria um objeto Departamento
        Departamento deptoVendas = new Departamento();
        
        // Adiciona os objetos vendedores ao deptoVendas
        deptoVendas.adicionaVendedor(vendedor1);
        deptoVendas.adicionaVendedor(vendedor2);
        
        // Exibe todos os vendedores do deptoVendas
        deptoVendas.exibeTodos();
        
        // Exibe o total de salários do deptoVendas
        System.out.println("O total de salários do depto é " + deptoVendas.calcularTotalSalario());
        
        // Exibe somente os vendedores do depto que são os que tem salário fixo
        deptoVendas.exibeVendedorComissaoMaisFixo();
    }
    
}
