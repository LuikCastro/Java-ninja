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
public class App {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();

        pedido1.setCodigo("001");
        pedido2.setCodigo("002");
        pedido3.setCodigo("003");

        pedido1.setProduto("Camiseta");
        pedido2.setProduto("Tênis");
        pedido3.setProduto("Boné");

        pedido1.setQuantidade(3);
        pedido2.setQuantidade(1);
        pedido3.setQuantidade(2);

        pedido1.setValorUnitario(59.90);
        pedido2.setValorUnitario(359.90);
        pedido3.setValorUnitario(100.00);
        
        pedido1.calcularValorTotal();
        pedido2.calcularValorTotal();
        pedido3.calcularValorTotal();

        Loja loja = new Loja();

        loja.aplicarDesconto(pedido2);
        loja.aplicarDesconto(pedido3);
        
        loja.finalizarPedido(pedido1);
        System.out.println("---------");
        loja.finalizarPedido(pedido2);
        System.out.println("---------");
        loja.finalizarPedido(pedido3);
        System.out.println("---------");
        
        System.out.println(loja.toString());
        
    }
}
