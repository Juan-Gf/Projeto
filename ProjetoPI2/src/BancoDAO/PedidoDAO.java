/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import Model.Pedido;
import Model.Produto;
import Utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author raphael.ldalmeida
 */
public class PedidoDAO {
    
    public static boolean salvarPedido(Pedido p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO pedido (idPedido,idProduto,idCliente,quantidadeItens,valorPedido) VALUES(?, ?, ?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            
            instrucaoSQL.setString(1, p.getIdPedido());
            instrucaoSQL.setInt(2, p.getIdProduto());
            instrucaoSQL.setInt(3, p.getIdCliente());
            instrucaoSQL.setInt(4, p.getQuantidadeItens());
            instrucaoSQL.setDouble(5, p.getValorPedido());
            
                        
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do pedido
                if (generatedKeys.next()) {
                        p.setId(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Falha ao obter o ID do pedido.");
                    }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static ArrayList<Pedido> getPedidos()
    {
        return SimulaDB.getInstance().getPedidos();
    }
    
}
