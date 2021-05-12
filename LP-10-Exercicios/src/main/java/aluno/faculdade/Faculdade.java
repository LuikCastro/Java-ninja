/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luik
 */
public class Faculdade {
    private String nome;
    private List<Aluno> lista;
    
    public Faculdade(String nome){
        this.nome = nome;
        lista = new ArrayList();
    }
    
    public void matricularAluno(Aluno aluno, Integer semestre){
        lista.add(aluno);
        aluno.setSemestre(semestre);
        aluno.setAtivo(true);
    }
    
    public void cancelarMatricula(String ra){
        for (Aluno aluno : lista){
            if (aluno.getRa().equals(ra)){
                aluno.setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos(){
        System.out.println("\nLISTA DE ALUNOS");
        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        System.out.println("\nALUNOS DO SEMESTRE " + semestre);
        for (Aluno aluno:  lista){
            if (aluno.getSemestre().equals(semestre)){
                System.out.println(aluno);
            }
        }
    }
    
    public void exibirCancelados(){
        System.out.println("\nALUNOS CANCELADOS");
        for (Aluno aluno: lista){
            if (aluno.getAtivo().equals(false)){
                System.out.println(aluno);
            }
        }
    }
}
    
