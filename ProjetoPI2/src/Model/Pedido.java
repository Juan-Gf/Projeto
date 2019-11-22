/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author raphael.ldalmeida
 */
public class Pedido {
    
    private static int qtdPedidosRealizados = 1000;
    
    public int idPedido;
    private int quantidadeItens;
    private int dataPedido;
    private double valorPedido;
    
    public Pedido() {
         //TODO:Ao conectar-se ao banco, remover incremento pelo código
         qtdPedidosRealizados++;
         this.idPedido =  qtdPedidosRealizados;
    }
    
    public Pedido(int quantidadeItens, int dataPedido,double valorPedido) {
        
        qtdPedidosRealizados++;
        this.idPedido = qtdPedidosRealizados;
        this.quantidadeItens = quantidadeItens;
        this.dataPedido = dataPedido;
        this.valorPedido = valorPedido;
        
    }
    
    public Pedido(int idPedido, int quantidadeItens, int dataPedido,double valorPedido) {
        
        this.idPedido = idPedido;
        this.quantidadeItens = quantidadeItens;
        this.dataPedido = dataPedido;
        this.valorPedido = valorPedido;
        
    }

    public static int getQtdPedidosRealizados() {
        return qtdPedidosRealizados;
    }

    public static void setQtdPedidosRealizados(int qtdPedidosRealizados) {
        Pedido.qtdPedidosRealizados = qtdPedidosRealizados;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public int getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(int dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }
    
    
    
}
