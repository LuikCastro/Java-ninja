/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.corrente;

/**
 *
 * @author luik
 */
public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Luik");

        conta.depositar(2600.0);
        conta.sacar(2700.0);
        conta.depositar(2600.0);
        conta.depositar(2600.0);
        conta.sacar(4000.0);
        conta.exibirExtrato();

    }
}
