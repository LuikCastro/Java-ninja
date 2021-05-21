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
    private Integer vagas;
    private List<Aluno> listaAlunos;
    
    public Faculdade(String nome, Integer vagas){
        this.nome = nome;
        this.vagas = vagas;
        listaAlunos = new ArrayList();
    }
    
    public void matricularAluno(Aluno aluno){
        if (this.listaAlunos.size() < this.vagas){
            this.listaAlunos.add(aluno);
        }else{
            System.out.println("Não há mais vagas");
        }
    }
    
    public void exibirAlunosMatriculado(){
        listaAlunos.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
    
    public void exibirAlunosPos(){
        listaAlunos.forEach(aluno -> {
            if (aluno instanceof AlunoPos){
                System.out.println(aluno);
            }
        });
    }

    @Override
    public String toString() {
        return "\n=== Faculdade ===" 
               + "\nNome: " + this.nome
               + "\nVagas total: " + this.vagas
               + "\nVagas disponiveis: " + (this.vagas - this.listaAlunos.size());
        //return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + ", listaAlunos=" + listaAlunos + '}';
    }
    
}
