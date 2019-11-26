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
    
    public static boolean salvar( int pIdProduto, int pIdCliente, int pQuantidadeItens,double pValorPedido, int pNumeroCompra)
    {
        //Salvo na memória
        Pedido p =  new Pedido( pIdProduto,pIdCliente, pQuantidadeItens, pValorPedido, pNumeroCompra);
        return PedidoDAO.salvarPedido(p);
    }
    
    
}

