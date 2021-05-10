/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.corrente;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author luik
 */
public class ContaCorrente {

    private String titular;
    private Double saldo;
    private List<Historico> lista;
    private LocalDate data;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        lista = new ArrayList();
    }

    public void depositar(Double valor) {
        Historico historico = new Historico();
        this.saldo = this.saldo + valor;
        historico.setValor(valor);
        historico.setTipoOperacao("depositar");
        data = LocalDate.now();
        historico.setAno(data.getYear());
        historico.setMes(data.getMonthValue());
        historico.setDia(data.getDayOfMonth());
        this.lista.add(historico);
    }

    public void sacar(Double valor) {
        Historico historico = new Historico();
        this.saldo = this.saldo - valor;
        historico.setValor(valor);
        historico.setTipoOperacao("sacar");
        data = LocalDate.now();
        historico.setAno(data.getYear());
        historico.setMes(data.getMonthValue());
        historico.setDia(data.getDayOfMonth());
        this.lista.add(historico);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "*** CONTA CORRENTE ***"
                + "\nTitular: " + titular
                + "\nSaldo: " + saldo
                + "\nExtrato: " + lista;
        //return "ContaCorrente{" + "titular=" + titular + ", saldo=" + saldo + ", extrato=" + lista + '}';
    }

}
