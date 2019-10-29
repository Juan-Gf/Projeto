/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDAO.PedidoDAO;
import Model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author raphael.ldalmeida
 */
public class PedidoController {
    
    public static boolean salvar(int pQuantidadeItens, int pDataPedido,double pValorPedido)
    {
        //Salvo na memória
        Pedido p =  new Pedido(pQuantidadeItens,pDataPedido,pValorPedido);
        return PedidoDAO.salvarPedido(p);
    }
    
    public static ArrayList<String[]> getPedidos()
    {
        ArrayList<Pedido> pedidos = PedidoDAO.getPedidos();
        ArrayList<String[]> listaPedidos = new ArrayList<>();
        
        for(int i=0;i<pedidos.size();i++)
        {
            listaPedidos.add(new String[]{String.valueOf(pedidos.get(i).getIdPedido()),String.valueOf(pedidos.get(i).getDataPedido()),String.valueOf(pedidos.get(i).getValorPedido()) });
        
        }
        
        return listaPedidos;
    
}
}
