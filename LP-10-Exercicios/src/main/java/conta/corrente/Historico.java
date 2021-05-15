/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.corrente;

import java.time.LocalDate;

/**
 *
 * @author luik
 */
public class Historico {

    private Double valor;
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private String tipoOperacao;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    @Override
    public String toString() {
        return "\nValor: " + valor
                + "\nDia: " + dia
                + "\nMes: " + mes
                + "\nAno: " + ano
                + "\nOperação: " + tipoOperacao
                + "\n";
    }

}
