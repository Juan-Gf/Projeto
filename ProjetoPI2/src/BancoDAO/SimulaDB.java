/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import Model.Pedido;
import java.util.ArrayList;
import Model.Produto;
import Model.Vendas;

/**
 *
 * @author raphael.ldalmeida
 */
public class SimulaDB {
    
    private static SimulaDB mockdb;

    public static synchronized SimulaDB getInstance(){
        if(mockdb == null)
            mockdb = new SimulaDB();
        
        return mockdb;
    }
    
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    private ArrayList<Pedido> listaPedidos; //Simulo a tabela do pedido
    private ArrayList<Vendas> listaVendas;
    
    
    private SimulaDB(){
    
        listaProdutos = new ArrayList<Produto>();
    }
    
    public boolean SalvarProduto(Produto c)
    {
        listaProdutos.add(c);
        
        return true;
    }
    
    public ArrayList<Produto> getProdutos()
    {
        return this.listaProdutos;
    }
    
    
    public boolean AtualizarProduto(Produto p)
    {
        for(Produto item: listaProdutos)
        {
            if(item.getIdProduto()== p.getIdProduto())
            {
                item.setNomeProduto(p.getNomeProduto());
                item.setModeloProduto(p.getModeloProduto());
                item.setQuantidadeProduto(p.getQuantidadeProduto());
                item.setMarcaProduto(p.getMarcaProduto());
                item.setCategoriaProduto(p.getCategoriaProduto());
                item.setGeneroProduto(p.getGeneroProduto());
                item.setTamanhoProduto(p.getTamanhoProduto());
                item.setPrecoProduto(p.getPrecoProduto());
                item.setDescricaoProduto(p.getDescricaoProduto());
            }
        }
            
        return true;
    }
    
    public boolean ExcluirProduto(int i)
    {
        Produto ProdutoExcluir = new Produto();
        boolean existeNaLista2 = false;
        for (Produto c : listaProdutos) {
        
            if(c.getIdProduto()==i){
                ProdutoExcluir = c;
                existeNaLista2 = true;
            }
        }
        
        if(existeNaLista2)
            listaProdutos.remove(ProdutoExcluir);
        
        return true;
    
    }
    
    public boolean SalvarPedido(Pedido c)
    {
        listaPedidos.add(c);
        
        return true;
    }
    
    public ArrayList<Pedido> getPedidos()
    {
        return this.listaPedidos;
    }
    
    public boolean SalvarVendas(Vendas c)
    {
        listaVendas.add(c);
        
        return true;
    }
    
    public ArrayList<Vendas> getVendas()
    {
        return this.listaVendas;
    }
    
}
