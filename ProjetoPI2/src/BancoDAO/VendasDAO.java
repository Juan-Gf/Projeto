/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import Model.Vendas;
import java.util.ArrayList;

/**
 *
 * @author raphael.ldalmeida
 */
public class VendasDAO {
    
     public static boolean salvarVendas(Vendas c)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarVendas(c);
    }
    
    public static ArrayList<Vendas> getVendas()
    {
        return SimulaDB.getInstance().getVendas();
    }
    
    
}
