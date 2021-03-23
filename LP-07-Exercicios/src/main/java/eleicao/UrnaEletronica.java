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
public class UrnaEletronica {
    private String candidatoUmNome;
    private Integer candidatoUmVoto = 0;
    private String candidatoDoisNome;
    private Integer candidatoDoisVoto = 0;

    public void exibirRelatorio(){
        System.out.println("Candidato 1 recebeu ");
    }
    
    public String getCandidatoUmNome() {
        return candidatoUmNome;
    }

    public void setCandidatoUmNome(String candidatoUmNome) {
        this.candidatoUmNome = candidatoUmNome;
    }

    public Integer getCandidatoUmVoto() {
        return candidatoUmVoto;
    }

    public void setCandidatoUmVoto(Integer candidatoUmVoto) {
        this.candidatoUmVoto = candidatoUmVoto;
    }

    public String getCandidatoDoisNome() {
        return candidatoDoisNome;
    }

    public void setCandidatoDoisNome(String candidatoDoisNome) {
        this.candidatoDoisNome = candidatoDoisNome;
    }

    public Integer getCandidatoDoisVoto() {
        return candidatoDoisVoto;
    }

    public void setCandidatoDoisVoto(Integer candidatoDoisVoto) {
        this.candidatoDoisVoto = candidatoDoisVoto;
    }
    
    public void votarCandidatoUm(){
        candidatoUmVoto++;
        System.out.println(getCandidatoUmNome() + " recebeu 1 voto, totalizando: " + candidatoUmVoto);
    }
    
    public void votarCandidatoDois(){
        candidatoDoisVoto++;
        System.out.println(getCandidatoDoisNome() + " recebeu 1 voto, totalizando: " + candidatoDoisVoto);
    }
    
    public void encerrarEleicao(){
        System.out.println("Eleição encerrada!");
        System.out.println("---------------------------------------");
        System.out.println("Total de votos: " + (getCandidatoUmVoto() + getCandidatoDoisVoto()));
        if(getCandidatoUmVoto() > getCandidatoDoisVoto()){
            System.out.println("Resultado: " + getCandidatoUmNome() + " venceu");
        }
        else if (getCandidatoUmVoto() < getCandidatoDoisVoto()){
            System.out.println("Resultado: " + getCandidatoDoisNome() + " venceu");
        }
        else{
            System.out.println("Resultado: Empate!");
        }
    }
}
