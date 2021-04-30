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
public class Pedido {

    private String codigo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorComDesconto;
    private Double valorTotal;
    private Boolean itemPromocional;

    public Pedido() {
        this.itemPromocional = false;
    }

    public void calcularValorTotal() {
        this.valorTotal = this.valorUnitario * this.quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Boolean getItemPromocional() {
        return itemPromocional;
    }

    public void setItemPromocional(Boolean itemPromocional) {
        this.itemPromocional = itemPromocional;
    }

    @Override
    public String toString() {
        if (this.itemPromocional) {
            return String.format("PEDIDO: \n"
                    + "Código: %s\n"
                    + "Produto: %s\n"
                    + "Valor Unitário %.2f\n"
                    + "Quantidade: %d\n"
                    + "Valor Total: R$%.2f\n"
                    + "Item promocional: %s\n"
                    + "Valor com desconto: %.2f\n"
                    + "Total a ser pago: %.2f",
                    this.codigo, this.produto, this.valorUnitario, this.quantidade, this.valorTotal, "Sim", this.valorComDesconto, this.valorComDesconto);
        } else {
            return String.format("PEDIDO: \n"
                    + "Código: %s\n"
                    + "Produto: %s\n"
                    + "Valor Unitário %.2f\n"
                    + "Quantidade: %d\n"
                    + "Valor Total: R$%.2f\n"
                    + "Item promocional: %s\n"
                    + "Total a ser pago: %.2f",
                    this.codigo, this.produto, this.valorUnitario, this.quantidade, this.valorTotal, "Não", this.valorTotal);
        }
    }

}
