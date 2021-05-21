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
public class ProgramaAlunoHeranca {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("0202054", "Luik Castro", 9.0, 8.7);
        AlunoPos alunoPos = new AlunoPos(9.8, "0202054", "Luik Castro", 9.0, 8.7);
        Faculdade faculdade = new Faculdade("Bandtec", 60);
        faculdade.matricularAluno(aluno);
        faculdade.matricularAluno(alunoPos);
        faculdade.exibirAlunosMatriculado();
        faculdade.exibirAlunosPos();
        System.out.println(faculdade);
    }
}
