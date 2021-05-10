/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.corrente;

import java.util.Date;

/**
 *
 * @author luik
 */
public class ContaCorrente {

    private String titular;
    private Double saldo;

    public ContaCorrente(String titular) {
        this.saldo = 0.0;
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(Double valor) {
        this.saldo = this.saldo - valor;
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
}
