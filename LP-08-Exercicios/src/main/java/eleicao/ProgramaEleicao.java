/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

/**
 *
 * @author castr
 */
public class ProgramaEleicao {
    public static void main(String[] args) {
        UrnaEletronica eleicao = new UrnaEletronica();
        
        eleicao.setCandidatoUmNome("Márcio");
        eleicao.setCandidatoDoisNome("Roberto");
        
        System.out.println("Começou a eleição");
        System.out.println("                 ");
        
        eleicao.votarCandidatoUm();
        eleicao.votarCandidatoDois();
        System.out.println("Total de votos: " + (eleicao.getCandidatoUmVoto() + eleicao.getCandidatoDoisVoto()));
        System.out.println("                      ");
        
        eleicao.votarCandidatoUm();
        eleicao.votarCandidatoUm();
        System.out.println("Total de votos: " + (eleicao.getCandidatoUmVoto() + eleicao.getCandidatoDoisVoto()));
        System.out.println("                      ");
        
        eleicao.votarCandidatoUm();
        eleicao.votarCandidatoDois();
        System.out.println("Total de votos: " + (eleicao.getCandidatoUmVoto() + eleicao.getCandidatoDoisVoto()));
        System.out.println("                      ");
        
        eleicao.votarCandidatoUm();
        eleicao.votarCandidatoUm();
        System.out.println("Total de votos: " + (eleicao.getCandidatoUmVoto() + eleicao.getCandidatoDoisVoto()));
        System.out.println("                      ");
        
        eleicao.votarCandidatoDois();
        eleicao.votarCandidatoDois();
        System.out.println("Total de votos: " + (eleicao.getCandidatoUmVoto() + eleicao.getCandidatoDoisVoto()));
        System.out.println("                      ");
        
        eleicao.encerrarEleicao();
    }
}
