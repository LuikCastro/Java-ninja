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
public class Aluno {

    protected String ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(String ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }
    
    public String tipoAluno(){
        return "\n==== Aluno ====";
    }
    
    public Double calcularMedia() {
        return (this.notaContinuada * 0.4) + (this.notaSemestral * 0.6);
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(Double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    @Override
    public String toString() {
        //return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + '}';
        return  "\n"
                + tipoAluno()
                + "\nRa: " + ra
                + "\nNome: " + nome
                + "\nNota Continuada: " + notaContinuada
                + "\nNota Semestral: " + notaSemestral
                + "\nMédia: " + Double.valueOf(String.format("%.2f", calcularMedia()).replaceAll(",", "."));
    }

}
