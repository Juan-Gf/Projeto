/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDAO.ProdutoDAO;
import java.util.ArrayList;
import Model.Produto;

/**
 *
 * @author raphael.ldalmeida
 */
public class ProdutoController {
    
    public static boolean salvar( String pModeloProduto,int pQuantidadeProduto, String pMarcaProduto, String pCategoriaProduto, String pGeneroProduto, String pTamanhoProduto, double pPrecoProduto, String pDescricaoProduto)
    {
        //Salvo na memória
        Produto p =  new Produto(pModeloProduto,pQuantidadeProduto,pMarcaProduto,pCategoriaProduto,pGeneroProduto,pTamanhoProduto,pPrecoProduto,pDescricaoProduto);
        return ProdutoDAO.salvarProduto(p);
    }
    
    public static boolean excluir(int pIDProduto)
    {
        return ProdutoDAO.excluirProduto(pIDProduto);
    }
    
    public static boolean atualizar(int pIdProduto, String pModeloProduto,int pQuantidadeProduto, String pMarcaProduto, String pCategoriaProduto, String pGeneroProduto, String pTamanhoProduto, double pPrecoProduto, String pDescricaoProduto)
    {
        Produto p =  new Produto(pIdProduto,pModeloProduto,pQuantidadeProduto,pMarcaProduto,pCategoriaProduto,pGeneroProduto,pTamanhoProduto,pPrecoProduto,pDescricaoProduto);
        return ProdutoDAO.atualizarProduto(p);
        
    }
    
    public static ArrayList<String[]> getProdutos()
    {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        for(int i=0;i<produtos.size();i++)
        {
            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getIdProduto()),produtos.get(i).getModeloProduto(),produtos.get(i).getMarcaProduto(),String.valueOf(produtos.get(i).getPrecoProduto()) });
        
        }
        
        return listaProdutos;
        
    }
    
    public static ArrayList<Produto> carregarProdutos()
    {
        return ProdutoDAO.getProdutos();


    }
    
}
