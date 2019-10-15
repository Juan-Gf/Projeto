/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author juan.gferreira
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String data;
    private String telefone;
    private String celular;
    private String email;
    
    
    public Cliente(String pNome, String pCpf, String pData, String pTelefone, String pCelular, String pEmail, String cEmail){
        
        this.nome = pNome;
        this.cpf = pCpf;
        this.data = pData;
        this.telefone = pTelefone;
        this.celular = pCelular;
        this.email = pEmail;
    
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String pNome){
        this.nome = pNome;
    }
}
