/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDAO.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author matheus.dcosta2
 */

public class ClienteC {
    

    public static boolean salvar(String pNome, String pCPF, String pData, String pSexo, String pTelefone, String pCelular, String pEmail,
            String pRua, String pNumero, String pComplemento, String pCep, String pBairro, String pReferencia, String pPais,
            String pCidade, String pUf) {
        //Salvo na memória
        Cliente p = new Cliente(pNome, pCPF, pData, pSexo, pTelefone, pCelular, pEmail,
                pRua, pNumero, pComplemento, pCep, pBairro, pReferencia, pPais,
                pCidade, pUf);
        return ClienteDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return ClienteDAO.excluir(pID);
    }

    public static boolean atualizar(int pId, String pNome, String pCPF, String pData, String pSexo, String pTelefone, String pCelular, String pEmail,
            String pRua, String pNumero, String pComplemento, String pCep, String pBairro, String pReferencia, String pPais,
            String pCidade, String pUf) {
        Cliente p = new Cliente(pId, pNome, pCPF, pData, pSexo, pTelefone, pCelular, pEmail,
                pRua, pNumero, pComplemento, pCep, pBairro, pReferencia, pPais,
                pCidade, pUf);
        return ClienteDAO.atualizar(p);

    }
    
    public static ArrayList<String[]> getClientes()
    {
        ArrayList<Cliente> cliente = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for (int i = 0; i < cliente.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(cliente.get(i).getId()),cliente.get(i).getNome(),cliente.get(i).getCPF()});
            
        }
        
        return listaClientes;
    }
    
    public static ArrayList<Cliente> carregarClientes()
    {
        return ClienteDAO.getClientes();


    }

}
