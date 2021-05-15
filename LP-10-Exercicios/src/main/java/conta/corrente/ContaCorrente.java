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
        if (valor > this.saldo) {
            System.out.println(String.format("=== OPERAÇÃO INVÁLIDA ==="
                    + "\nNão foi possível efetuar o saque de R$%.2f"
                    + "\nMotivo: Saldo insuficiente"
                    + "\n=========================", valor));
        } else {
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

    }

    public void exibirExtrato() {
        System.out.println("-------------------");
        System.out.println("Nome do Titular: " + this.titular);
        System.out.println("-------------------");
        System.out.println("----- EXTRATO -----");
        for (Historico historico : lista) {
            System.out.println("Operação: " + historico.getTipoOperacao());
            System.out.println("Data: " + historico.getDia() + "/" + historico.getMes() + "/" + historico.getAno());
            System.out.println(String.format("Valor: R$%.2f", historico.getValor()));
            System.out.println("-------------------");
        }
        System.out.println(String.format("Saldo atual: R$%.2f", this.saldo));
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
    }

}
