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
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer salarioTotalReajustado;

    public RecursosHumanos() {

        this.totalPromovidos = 0;
        this.salarioTotalReajustado = 0;

    }



    public void reajustarSalario(Colaborador colaborador, Double reajuste) {

        colaborador.setSalario(colaborador.getSalario() + (colaborador.getSalario() * (reajuste / 100)));
        salarioTotalReajustado++;

    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {

        colaborador.setCargo(novoCargo);

        if(colaborador.getSalario() < novoSalario){

            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;

        }else{

            System.out.println("Operação Invalida");

        }

    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getSalarioTotalReajustado() {
        return salarioTotalReajustado;
    }

}
