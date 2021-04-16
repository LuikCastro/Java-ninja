/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

/**
 *
 * @author castr
 */
public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador funcionario1 = new Colaborador("Pedrin", "uber", 2100.0);
        Colaborador funcionario2 = new Colaborador("rogerio", "Supervisora", 3700.0);

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(funcionario1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(funcionario2.toString());
        System.out.println("---------------------------------------------");

        rh.promoverColaborador(funcionario2, "Gerente", 5600.0);
        rh.promoverColaborador(funcionario1, "Analista Jr.", 3200.0);

        rh.reajustarSalario(funcionario1, 20.0);

        System.out.println(funcionario1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(funcionario2.toString());
        System.out.println("---------------------------------------------");

        System.out.println("Total de reajustados:" + rh.getSalarioTotalReajustado());
        System.out.println("Total de promovidos" + rh.getTotalPromovidos());

    }
}
