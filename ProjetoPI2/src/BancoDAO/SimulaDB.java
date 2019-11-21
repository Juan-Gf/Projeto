/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import Model.Cliente;
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

    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }

        return mockdb;
    }
    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    private ArrayList<Pedido> listaPedidos; //Simulo a tabela do pedido
    private ArrayList<Vendas> listaVendas;

    private SimulaDB() {

        listaProdutos = new ArrayList<Produto>();
        listaClientes = new ArrayList<Cliente>();
        
    }
    
    

    public boolean SalvarProduto(Produto c) {
        listaProdutos.add(c);

        return true;
    }

    public ArrayList<Produto> getProdutos() {
        return this.listaProdutos;
    }

    public boolean AtualizarProduto(Produto p) {
        for (Produto item : listaProdutos) {
            if (item.getIdProduto() == p.getIdProduto()) {
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

    public boolean ExcluirProduto(int i) {
        Produto ProdutoExcluir = new Produto();
        boolean existeNaLista2 = false;
        for (Produto c : listaProdutos) {

            if (c.getIdProduto() == i) {
                ProdutoExcluir = c;
                existeNaLista2 = true;
            }
        }

        if (existeNaLista2) {
            listaProdutos.remove(ProdutoExcluir);
        }

        return true;

    }

    public boolean SalvarCliente(Cliente c) {
        listaClientes.add(c);

        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return this.listaClientes;
    }

    public boolean AtualizarCliente(Cliente p) {
        for (Cliente item : listaClientes) {
            if (item.getId() == p.getId()) {
                item.setNome(p.getNome());
                item.setCPF(p.getCPF());
                item.setData(p.getData());
                item.setSexo(p.getSexo());
                item.setTelefone(p.getTelefone());
                item.setCelular(p.getCelular());
                item.setEmail(p.getEmail());
                item.setRua(p.getRua());
                item.setNumero(p.getNumero());
                item.setComplemento(p.getComplemento());
                item.setCep(p.getCep());
                item.setBairro(p.getBairro());
                item.setReferencia(p.getReferencia());
                item.setPais(p.getPais());
                item.setCidade(p.getCidade());
                item.setUf(p.getUf());

            }
        }

        return true;
    }

    public boolean ExcluirCliente(int i) {
        Cliente clienteExcluir = new Cliente();
        boolean existeNaLista = false;
        for (Cliente c : listaClientes) {

            if (c.getId() == i) {
                clienteExcluir = c;
                existeNaLista = true;
            }
        }

        if (existeNaLista) {
            listaClientes.remove(clienteExcluir);
        }

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
