/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDAO.VendasDAO;
import Model.Vendas;
import java.util.ArrayList;

/**
 *
 * @author raphael.ldalmeida
 */
public class VendaController {
    
    public static boolean SalvarVendas(int fIdCliente, String fnomeCliente, int fdataVenda, int fNumPedido, double fValorVenda){
        
        Vendas c = new Vendas(fIdCliente, fnomeCliente, fdataVenda, fNumPedido, fValorVenda);
        return VendasDAO.salvarVendas(c);
        
    }
    
     public static ArrayList<String[]> getVendas()
    {
        ArrayList<Vendas> Vendas = VendasDAO.getVendas();
        ArrayList<String[]> listaVendas = new ArrayList<>();
        
        for(int i=0;i<Vendas.size();i++)
        {
            listaVendas.add(new String[]{String.valueOf(Vendas.get(i).getIdCliente()),Vendas.get(i).getNomeCliente(),String.valueOf(Vendas.get(i).getDataVenda()),String.valueOf(Vendas.get(i).getNumPedido()),String.valueOf(Vendas.get(i).getValorVenda()) });
        
        }
        
        return listaVendas;
    
}
    
}
