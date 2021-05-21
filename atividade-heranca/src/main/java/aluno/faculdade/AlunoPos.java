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
public class AlunoPos extends Aluno {

    private Double notaMonografia;

    public AlunoPos(Double notaMonografia, String ra, String nome, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;

    }

    public void exibirMensagem() {
        System.out.println("O aluno de pós graduação " + nome + " tem média " + String.format("%.2f", this.calcularMedia()));
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    @Override
    public String toString() {
        return super.toString()
               +"\nNota monografia: " + this.notaMonografia
               + "\n-------------------";
    }
    
    @Override
    public String tipoAluno(){
        return "\n==== Aluno Pós ====";
    }

    @Override
    public Double calcularMedia() {
        return (super.notaContinuada + super.notaSemestral + this.notaMonografia) / 3;  
    }
}
