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
    
    private String idPedido;  
    private int idProduto;
    private int idCliente;  
    private int quantidadeItens;
    private double valorPedido;
    
    
    
    public Pedido(String idPedido, int idProduto, int idCliente, int quantidadeItens,double valorPedido) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidadeItens = quantidadeItens;
        this.valorPedido = valorPedido;        
    }
    
    //Pedido
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
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

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
