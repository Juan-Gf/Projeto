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
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaDB.getInstance().AtualizarCliente(p);
    }
    
    public static boolean excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaDB.getInstance().ExcluirCliente(pID);
    }
    
    public static ArrayList<Cliente> getClientes()
    {
        return SimulaDB.getInstance().getClientes();
    }
    
    
    
}
