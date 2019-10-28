/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import java.util.ArrayList;
import Model.Produto;

/**
 *
 * @author raphael.ldalmeida
 */
public class ProdutoDAO {
    
    public static boolean salvarProduto(Produto p)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarProduto(p);
    }
    
    public static boolean atualizarProduto(Produto p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaDB.getInstance().AtualizarProduto(p);
    }
    
    public static boolean excluirProduto(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaDB.getInstance().ExcluirProduto(pID);
    }
    
    public static ArrayList<Produto> getProdutos()
    {
        return SimulaDB.getInstance().getProdutos();
    }
}
