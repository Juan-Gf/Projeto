/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDAO;
   
import Model.Cliente;
import Utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


    import java.util.ArrayList;

/**
 *
 * @author matheus.dcosta2
 */
public class ClienteDAO {
    
        public static boolean salvar(Cliente p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome_cliente,cpf,data_nascimento,sexo,telefone,celular,email,rua,numero,complemento,cep,bairro,referencia,pais,cidade,uf) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getCPF());
            instrucaoSQL.setString(3, p.getData());
            instrucaoSQL.setString(4, p.getSexo());
            instrucaoSQL.setString(5, p.getTelefone());
            instrucaoSQL.setString(6, p.getCelular());
            instrucaoSQL.setString(7, p.getEmail());
            instrucaoSQL.setString(8, p.getRua());
            instrucaoSQL.setString(9, p.getNumero());
            instrucaoSQL.setString(10, p.getComplemento());
            instrucaoSQL.setString(11, p.getCep());
            instrucaoSQL.setString(12, p.getBairro());
            instrucaoSQL.setString(13, p.getReferencia());
            instrucaoSQL.setString(14, p.getPais());
            instrucaoSQL.setString(15, p.getCidade());
            instrucaoSQL.setString(16, p.getUf());
                        
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setId(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Falha ao obter o ID do cliente.");
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
        
      public static boolean atualizar(Cliente p)
    {
                boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET nome_cliente=?,cpf=?,data_nascimento=?,sexo=?,telefone=?,celular=?,email=?,rua=?,numero=?,complemento=?,cep=?,bairro=?,referencia=?,pais=?,cidade=?,uf=? WHERE id_cliente=?"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getCPF());
            instrucaoSQL.setString(3, p.getData());
            instrucaoSQL.setString(4, p.getSexo());
            instrucaoSQL.setString(5, p.getTelefone());
            instrucaoSQL.setString(6, p.getCelular());
            instrucaoSQL.setString(7, p.getEmail());
            instrucaoSQL.setString(8, p.getRua());
            instrucaoSQL.setString(9, p.getNumero());
            instrucaoSQL.setString(10, p.getComplemento());
            instrucaoSQL.setString(11, p.getCep());
            instrucaoSQL.setString(12, p.getBairro());
            instrucaoSQL.setString(13, p.getReferencia());
            instrucaoSQL.setString(14, p.getPais());
            instrucaoSQL.setString(15, p.getCidade());
            instrucaoSQL.setString(16, p.getUf());
            instrucaoSQL.setInt(17, p.getId());
                        
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setId(generatedKeys.getInt(1));
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
    
//    public static boolean atualizar(Cliente p)
//    {
//        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
//        return SimulaDB.getInstance().AtualizarCliente(p);
//    }
    
    public static boolean excluir(int pID)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM `lojacalcados`.`cliente` WHERE (`id_cliente` = ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1,pID);
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
      
            
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
    
    public static ArrayList<Cliente> getClientes()
      {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome_cliente"));
                c.setCPF(rs.getString("cpf"));
                c.setData(rs.getString("data_nascimento"));
                c.setSexo(rs.getString("sexo"));
                c.setTelefone(rs.getString("telefone"));                
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("email"));
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getString("numero"));
                c.setComplemento(rs.getString("complemento"));
                c.setCep(rs.getString("cep"));
                c.setBairro(rs.getString("bairro"));
                c.setReferencia(rs.getString("referencia"));
                c.setPais(rs.getString("pais"));
                c.setCidade(rs.getString("cidade"));
                c.setUf(rs.getString("uf"));
                 
                
                

                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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
        
        return listaClientes;
    }
    
    
    
}
