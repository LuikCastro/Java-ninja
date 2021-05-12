/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno.faculdade;

/**
 *
 * @author luik
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("01202054", "Luik Castro");
        Aluno aluno2 = new Aluno("01202053", "Joaozinho");
        
        Faculdade faculdade = new Faculdade("Bandtec");
        
        faculdade.matricularAluno(aluno1, 3);
        faculdade.matricularAluno(aluno2, 2);
        
        faculdade.exibirAlunos();
        
        faculdade.exibirAlunosPorSemestre(2);
        
        faculdade.cancelarMatricula("01202053");
        
        faculdade.exibirCancelados();
        
        faculdade.exibirAlunos();
    }
}