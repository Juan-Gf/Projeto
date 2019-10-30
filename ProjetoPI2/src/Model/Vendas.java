/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Pedido;

/**
 *
 * @author raphael.ldalmeida
 */
public class Vendas {
    
    private int IdCliente;
    private String NomeCliente;
    private int dataVenda;
    private int NumPedido;
    private double valorVenda;
    
    
    public Vendas(){}
    
    public Vendas(int idCliente, String nomCliente, int dtVenda, int numpedido, double vVenda){
        
        this.NumPedido = Model.Pedido.getQtdPedidosRealizados();
        this.IdCliente = idCliente;
        this.NomeCliente = nomCliente;
        this.dataVenda = dtVenda;
        this.valorVenda = vVenda;

    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public int getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(int dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getNumPedido() {
        return NumPedido;
    }

    public void setNumPedido(int NumPedido) {
        this.NumPedido = NumPedido;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
    
}


