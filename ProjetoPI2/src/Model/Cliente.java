/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author juan.gferreira
 */
public class Cliente {

    private static int clientesCriados;

    private int id;
    private String nome;
    private String cpf;
    private String data;
    private String sexo;
    private String telefone;
    private String celular;
    private String email;
    private int salvaID;

    public Cliente() {
        // ligar array;
        clientesCriados++;
        this.id = clientesCriados;
    }
    public Cliente(String nome, String cpf, String data, String sexo, String telefone, String celular, String email,
            String rua, String numero, String complemento, String cep, String bairro, String referencia, String pais,
            String cidade, String uf) {

        clientesCriados++;
        this.id = clientesCriados;
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.referencia = referencia;
        this.pais = pais;
        this.cidade = cidade;
        this.uf = uf;

    }
    
    public Cliente(int id,String pNome, String pCPF, String pData, String pSexo, String pTelefone, String pCelular, String pEmail,
            String pRua, String pNumero, String pComplemento, String pCep, String pBairro, String pReferencia, String pPais,
            String pCidade, String pUf) {
        
        this.id=id;
        this.nome = pNome;
        this.cpf = pCPF;
        this.data = pData;
        this.sexo = pSexo;
        this.telefone = pTelefone;
        this.celular = pCelular;
        this.email = pEmail;
        this.rua= pRua;
        this.numero=pNumero;
        this.complemento=pComplemento;
        this.cep=pCep;
        this.bairro=pBairro;
        this.referencia=pReferencia;
        this.pais=pPais;
        this.cidade=pCidade;
        this.uf=pUf;
                
        

    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String pData) {
        this.data = pData;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String pSexo) {
        this.sexo = pSexo;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String pTelefone) {
        this.telefone=pTelefone;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String pCelular) {
        this.celular = pCelular;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String pEmail) {
        this.email=pEmail;
    }
    
    
    // Endereço
    
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String referencia;
    private String pais;
    private String cidade;
    private String uf;
    
    public String getRua() {
        return rua;
    }
    
    public void setRua(String pRua) {
        this.rua = pRua;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String pNumero) {
        this.numero= pNumero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String pComplemento) {
        this.complemento=pComplemento;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String pCep) {
        this.cep = pCep;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String pBairro) {
        this.bairro = pBairro;
    }
    
    public String getReferencia() {
        return referencia;
    }
    
    public void setReferencia(String pReferencia) {
        this.referencia = pReferencia;
    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pPais) {
        this.pais = pPais;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String pCidade) {
        this.cidade = pCidade;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String pUf) {
        this.uf = pUf;
    }
    
}

    

