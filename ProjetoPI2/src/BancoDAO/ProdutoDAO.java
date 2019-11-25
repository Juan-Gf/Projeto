/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;

import java.util.ArrayList;
import Model.Produto;
import Utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raphael.ldalmeida
 */
public class ProdutoDAO {

    public static boolean salvarProduto(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (nomeProduto,quantidadeProduto,marcaProduto,categoriaProduto,generoProduto,tamanhoProduto,precoProduto,descricaoProduto)VALUES(?,?,?,?,?,?,?,?)"
            ,Statement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setString(1, p.getModeloProduto());
            instrucaoSQL.setInt(2, p.getQuantidadeProduto());
            instrucaoSQL.setString(3, p.getMarcaProduto());
            instrucaoSQL.setString(4, p.getCategoriaProduto());
            instrucaoSQL.setString(5, p.getGeneroProduto());
            instrucaoSQL.setString(6, p.getTamanhoProduto());
            instrucaoSQL.setDouble(7, p.getPrecoProduto());
            instrucaoSQL.setString(8, p.getDescricaoProduto());//Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    p.setIdProduto(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do produto");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean atualizarProduto(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("UPDATE Produto SET nomeProduto=?,quantidadeProduto=?,marcaProduto=?,categoriaProduto=?,generoProduto=?,tamanhoProduto=?,precoProduto=?,descricaoProduto=? WHERE (idProduto = ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            
            instrucaoSQL.setString(1, p.getModeloProduto());
            instrucaoSQL.setInt(2, p.getQuantidadeProduto());
            instrucaoSQL.setString(3, p.getMarcaProduto());
            instrucaoSQL.setString(4, p.getCategoriaProduto());
            instrucaoSQL.setString(5, p.getGeneroProduto());
            instrucaoSQL.setString(6, p.getTamanhoProduto());
            instrucaoSQL.setDouble(7, p.getPrecoProduto());
            instrucaoSQL.setString(8, p.getDescricaoProduto());
            instrucaoSQL.setInt(9, p.getIdProduto());
            
                        
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIdProduto(generatedKeys.getInt(1));
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

    public static boolean excluirProduto(int pID) 
    {
      boolean retorno = false;
      Connection conexao = null;
      PreparedStatement instrucaoSQL = null;
        
      try{
          
          conexao=GerenciadorConexao.abrirConexao();
          
          instrucaoSQL= conexao.prepareStatement("DELETE FROM produto WHERE (idProduto=?)", Statement.RETURN_GENERATED_KEYS);
          
          instrucaoSQL.setInt(1, pID);
          
          int linhasAfetdadas = instrucaoSQL.executeUpdate();
      } catch(SQLException | ClassNotFoundException ex){
          System.out.println(ex.getMessage());
          retorno = false;
      }finally{
          try{
              if(instrucaoSQL!=null)
                  instrucaoSQL.close();
              GerenciadorConexao.fecharConexao();
          }catch(SQLException ex){
              
          }
      }return retorno;
    }

    public static ArrayList<Produto> getProdutos() {
        {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto;");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setModeloProduto(rs.getString("nomeProduto"));
                p.setMarcaProduto(rs.getString("marcaProduto"));
                p.setPrecoProduto(rs.getDouble("precoProduto"));
                p.setDescricaoProduto(rs.getString("descricaoProduto"));
                p.setGeneroProduto(rs.getString("generoProduto"));
                p.setTamanhoProduto(rs.getString("tamanhoProduto"));
                p.setCategoriaProduto(rs.getString("categoriaProduto"));
                p.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                
                

                listaProdutos.add(p);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaProdutos;
    }
    }
    
   
        
    }


