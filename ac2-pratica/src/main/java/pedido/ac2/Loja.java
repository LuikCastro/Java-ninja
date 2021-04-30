/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido.ac2;

/**
 *
 * @author luik
 */
public class Loja {

    private Integer pedidosRealizados;
    private Integer descontosAplicados;

    public Loja() {
        this.pedidosRealizados = 0;
        this.descontosAplicados = 0;
    }

    public void aplicarDesconto(Pedido pedido) {
        pedido.setValorComDesconto((pedido.getValorTotal() - (5 * pedido.getValorTotal()) / 100));
        pedido.setItemPromocional(true);
        this.descontosAplicados++;
    }

    public void finalizarPedido(Pedido pedido) {
        System.out.println(pedido.toString());
        this.pedidosRealizados++;
    }

    @Override
    public String toString() {
        return String.format("RELATÓRIO: \n"
                + "Pedidos realizados: %s\n"
                + "Descontos aplicados: %s",
                this.pedidosRealizados, this.pedidosRealizados);
    }
}
