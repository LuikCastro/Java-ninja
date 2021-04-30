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
public class Hospital {

    private Integer internacoesRealizadas;
    private Integer cirurgiasRealizadas;
    private Integer altasRealizadas;

    public Hospital() {
        internacoesRealizadas = 0;
        cirurgiasRealizadas = 0;
        altasRealizadas = 0;
    }

    public void registraInternacao(Paciente paciente, Integer qtdDiasInternado) {
        if (paciente.getEstaInternado()) {
            System.out.println("Este paciente já se encontra internado.");
        } else {
            paciente.setEstaInternado(true);
            paciente.setQtdDias(qtdDiasInternado);
            paciente.setValorDiaria(120.00);
            System.out.println("O paciente " + paciente.getNome() + " de ID " + paciente.getIdPaciente() + " está sendo internado por " + qtdDiasInternado + " dias");
            internacoesRealizadas++;
        }
    }

    public void registraInternacao(Paciente paciente, Integer qtdDiasInternado, Double valorDiaria) {
        if (paciente.getEstaInternado()) {
            System.out.println("Este paciente já se encontra internado.");
        } else {
            paciente.setEstaInternado(true);
            paciente.setQtdDias(qtdDiasInternado);
            paciente.setValorDiaria(valorDiaria);
            System.out.println("O paciente " + paciente.getNome() + " de ID " + paciente.getIdPaciente() + " está sendo internado por " + qtdDiasInternado + " dias");
            internacoesRealizadas++;
        }
    }

    public void registraAlta(Paciente paciente) {
        if (paciente.getEstaInternado()) {
            paciente.setEstaInternado(false);
            System.out.println(String.format("O paciente %s de ID %s está recebendo alta e deve pagar R$%.2f", paciente.getNome(), paciente.getIdPaciente(), paciente.calcularValorTotal()));
            altasRealizadas++;
        } else {
            System.out.println("Este paciente não está internado");
        }
    }

    public void registraCirurgia(Paciente paciente, Double valorCirurgia) {
        if (paciente.getEstaInternado()) {
            paciente.setFoiOperado(true);
            paciente.setValorCirurgia(valorCirurgia);
            System.out.println(String.format("O paciente %s de ID %s foi operado e o preço da cirurgia é R$%.2f", paciente.getNome(), paciente.getIdPaciente(), valorCirurgia));
            cirurgiasRealizadas++;
        } else {
            System.out.println("Este paciente não está internado");
        }
    }

    public Integer getInternacoesRealizadas() {
        return internacoesRealizadas;
    }

    public void setInternacoesRealizadas(Integer internacoesRealizadas) {
        this.internacoesRealizadas = internacoesRealizadas;
    }

    public Integer getCirurgiasRealizadas() {
        return cirurgiasRealizadas;
    }

    public void setCirurgiasRealizadas(Integer cirurgiasRealizadas) {
        this.cirurgiasRealizadas = cirurgiasRealizadas;
    }

    public Integer getAltasRealizadas() {
        return altasRealizadas;
    }

    public void setAltasRealizadas(Integer altasRealizadas) {
        this.altasRealizadas = altasRealizadas;
    }

    @Override
    public String toString() {
        return String.format("RELATÓRIO: \n"
                + "Internações realizadas: %d\n"
                + "Cirurgias realizadas: %d\n"
                + "Altas realizados: %d",
                this.internacoesRealizadas, this.cirurgiasRealizadas, this.altasRealizadas);
    }
}
