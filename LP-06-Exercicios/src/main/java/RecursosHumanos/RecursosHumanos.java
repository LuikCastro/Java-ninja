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
public class RecursosHumanos {
    Integer totalPromovidos = 0;
    Integer totalReajustados = 0;
    
    public void reajustarSalario(Colaborador colaborador, Double reajuste){
        colaborador.salario = reajuste;
        totalReajustados++;
        
    }
    
    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
     if(novoSalario <= colaborador.salario){
         System.out.println("*** ERRO ***");
         System.out.println("Operação inválida");
         System.out.println("             ");
         System.out.println("             ");
     }
     else{
         colaborador.cargo = novoCargo;
         colaborador.salario = novoSalario;
         totalPromovidos++;
     }
    }
}
