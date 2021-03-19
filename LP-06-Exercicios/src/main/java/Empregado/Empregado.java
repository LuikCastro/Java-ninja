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
public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    public void reajustarSalario(Double reajuste){
        salario += ((reajuste / 100) * salario); 
    }
    
    public void exibirEmpregado(){
        System.out.println(String.format("Nome: %s\n Cargo: %s\n Salário: %.2f", nome, cargo, salario));
    }
}
