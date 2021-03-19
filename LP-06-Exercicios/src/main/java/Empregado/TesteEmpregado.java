/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregado;

/**
 *
 * @author castr
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado empregadoUm = new Empregado();
        
        empregadoUm.nome = "João";
        empregadoUm.cargo = "Analista de Sistemas";
        empregadoUm.salario = 5400.00;
        
        empregadoUm.reajustarSalario(10.0);
        empregadoUm.exibirEmpregado();
    }
}
