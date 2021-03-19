/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursosHumanos;

/**
 *
 * @author castr
 */
public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colaboradorUm = new Colaborador();
        Colaborador colaboradorDois = new Colaborador();
        RecursosHumanos RecursosHumanosUm = new RecursosHumanos();
        
        colaboradorUm.nome = "Luik";
        colaboradorUm.cargo = "Estágiario TI";
        colaboradorUm.salario = 2647.00;
        
        colaboradorDois.nome = "Ricardo";
        colaboradorDois.cargo = "Análista Pleno";
        colaboradorDois.salario= 7000.00;
         
        System.out.println("*** FUNCIONÁRIOS ***");
        System.out.println("Colaborador: " + colaboradorUm.nome + "\nCargo: " + colaboradorUm.cargo + "\nSalario: " + colaboradorUm.salario);
        System.out.println("--------------");
        System.out.println("Colaborador: " + colaboradorDois.nome + "\nCargo: " + colaboradorDois.cargo + "\nSalario: " + colaboradorDois.salario);
        System.out.println("--------------");
        System.out.println("             ");
        System.out.println("             ");
        
        RecursosHumanosUm.promoverColaborador(colaboradorUm, "Analista Júnior", 5000.00);
        RecursosHumanosUm.promoverColaborador(colaboradorDois, "Análista Senior", 6000.00);
        
        RecursosHumanosUm.reajustarSalario(colaboradorDois, 8000.00);
        
        System.out.println("*** FUNCIONÁRIOS ***");
        System.out.println("Colaborador: " + colaboradorUm.nome + "\nCargo: " + colaboradorUm.cargo + "\nSalario: " + colaboradorUm.salario);
        System.out.println("--------------");
        System.out.println("Colaborador: " + colaboradorDois.nome + "\nCargo: " + colaboradorDois.cargo + "\nSalario: " + colaboradorDois.salario);
        
        System.out.println("Total promovidos: " + RecursosHumanosUm.totalPromovidos);
        System.out.println("Total reajustes: " + RecursosHumanosUm.totalReajustados);
    }
}
