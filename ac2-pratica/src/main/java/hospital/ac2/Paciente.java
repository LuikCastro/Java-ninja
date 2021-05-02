/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.ac2;

/**
 *
 * @author luik
 */
public class Paciente {

    private Integer idPaciente;
    private String nome;
    private String doenca;
    private Boolean estaInternado;
    private Double valorCirurgia;
    private Double valorDiaria;
    private Integer qtdDiasInternado;
    private Boolean foiOperado;

    public Paciente() {
        this.valorDiaria = 0.0;
        this.valorCirurgia = 0.0;
        this.estaInternado = false;
        this.foiOperado = false;
    }

    public Double calcularValorTotal() {
        return (this.valorDiaria * this.qtdDiasInternado) + this.valorCirurgia;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public Boolean getEstaInternado() {
        return estaInternado;
    }

    public void setEstaInternado(Boolean estaInternado) {
        this.estaInternado = estaInternado;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Integer getQtdDias() {
        return qtdDiasInternado;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDiasInternado = qtdDias;
    }

    public Boolean getFoiOperado() {
        return foiOperado;
    }

    public void setFoiOperado(Boolean foiOperado) {
        this.foiOperado = foiOperado;
    }

    @Override
    public String toString() {
        return String.format("PACIENTE: \n"
                + "Id: %d\n"
                + "Nome: %s\n"
                + "Doença: %s\n"
                + "Internado: %s\n"
                + "Valor cirurgia: %.2f\n"
                + "Valor diária: %.2f\n"
                + "Quantidade de dias internado: %d\n"
                + "Operado: %s",
                this.idPaciente,
                this.nome,
                this.doenca,
                (this.estaInternado) ? "Sim" : "Não",
                this.valorCirurgia,
                this.valorDiaria,
                this.qtdDiasInternado,
                (this.foiOperado) ? "Sim" : "Não"
        );
    }
}
