/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import Model.Pedido;
import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author raphael.ldalmeida
 */
public class PedidoDAO {
    
    public static boolean salvarPedido(Pedido p)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarPedido(p);
    }
    
    public static ArrayList<Pedido> getPedidos()
    {
        return SimulaDB.getInstance().getPedidos();
    }
    
}
