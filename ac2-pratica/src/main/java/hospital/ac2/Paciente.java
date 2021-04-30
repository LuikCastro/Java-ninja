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
    private Integer qtdDias;
    private Boolean foiOperado;

    public Paciente() {
        this.valorDiaria = 0.0;
        this.valorCirurgia = 0.0;
        this.estaInternado = false;
        this.foiOperado = false;
    }

    public Double calcularValorTotal() {
        return (this.valorDiaria * this.qtdDias) + this.valorCirurgia;
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
        return qtdDias;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDias = qtdDias;
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
                this.idPaciente, this.nome, this.doenca, (this.estaInternado == true) ? "Sim" : "Não", this.valorCirurgia, this.valorDiaria, this.qtdDias, (this.foiOperado == true) ? "Sim" : "Não");
    }
}
