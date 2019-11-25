/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDAO.PedidoDAO;
import Model.Pedido;

/**
 *
 * @author NK
 */
public class PedidoController {
    
    public static boolean salvar(String pIdPedido, int pIdProduto, int pIdCliente, int pQuantidadeItens,double pValorPedido)
    {
        //Salvo na memória
        Pedido p =  new Pedido(pIdPedido, pIdProduto,pIdCliente, pQuantidadeItens, pValorPedido);
        return PedidoDAO.salvarPedido(p);
    }
    
    
}

