/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NK
 */
public class Pedido {
    
    private int idPedido;  
    private int idProduto;
    private int idCliente;  
    private int quantidadeItens;
    private double valorPedido;
    private int numeroCompra;
    
    
    
    public Pedido( int idProduto, int idCliente, int quantidadeItens,double valorPedido, int numeroCompra) {
        
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidadeItens = quantidadeItens;
        this.valorPedido = valorPedido;    
        this.numeroCompra=numeroCompra;
    }
    
    //Pedido
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    //Produto
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    //Cliente
    public int getIdCliente(){
        return idCliente;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    //Quantidade Itens
    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    //Valor Pedido
    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido){
        this.valorPedido = valorPedido;
    }
    
    //Valor Compra
    public double getNumeroCompra() {
        return numeroCompra;
    }

    public void setValorPedido(int numeroCompra){
        this.numeroCompra = numeroCompra;
    }
            
}
