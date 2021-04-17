/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luik.de.castro.da.silva.c2;

/**
 *
 * @author castr
 */
public class Secretaria {
    Integer totalInadimplentes;
    Integer totalCancelamentos;
    Integer totalPagamentos;
    
    public Secretaria(){
        totalInadimplentes = 0;
        totalCancelamentos = 0;
        totalPagamentos = 0;
    }
    
    public void registraPagemento(Aluno aluno){
        aluno.inadimplente = false;
        System.out.println("O aluno(a) " + aluno.nome + " de RA " + aluno.ra + " está em dia com o pagamento.");
        totalPagamentos++;
    }
    
    public void registraAtrasoPagamento(Aluno aluno){
        aluno.inadimplente = true;
        System.out.println("O aluno(a) " + aluno.nome + " de RA " + aluno.ra + " está inadimplente.");
        totalInadimplentes++;
    }
    
    public void registraCancelamento(Aluno aluno){
        aluno.ativo = false;
        System.out.println("O aluno(a) " + aluno.nome + " de RA " + aluno.ra + " cancelou a matrícula.");
        totalCancelamentos++;
    }
    
    public void verificaAprovacaoAluno(Aluno aluno){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(aluno.toString());
        System.out.println("--------------------------------------");
        if (aluno.media < 6){
            System.out.println("O Aluno(a) " + aluno.nome + " foi Reprovado(a)");
        } 
        else {
            System.out.println("O Aluno(a) " + aluno.nome + " foi Aprovado(a)");
        }
    }

    public Integer getTotalInadimplentes() {
        return totalInadimplentes;
    }

    public void setTotalInadimplentes(Integer totalInadimplentes) {
        this.totalInadimplentes = totalInadimplentes;
    }

    public Integer getTotalCancelamentos() {
        return totalCancelamentos;
    }

    public void setTotalCancelamentos(Integer totalCancelamentos) {
        this.totalCancelamentos = totalCancelamentos;
    }

    public Integer getTotalPagamentos() {
        return totalPagamentos;
    }

    public void setTotalPagamentos(Integer totalPagamentos) {
        this.totalPagamentos = totalPagamentos;
    }
    
    @Override
    public String toString() {
        return "RELATÓRIO:" + "\nPagamentos realizados: " + totalPagamentos + "\nInadimplentes: " + totalInadimplentes + "\nEvasões: " + totalCancelamentos;
    }
}
