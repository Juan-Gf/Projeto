/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author raphael.ldalmeida
 */
public class Produto {
    
    private static int qtdProdutosCriados;
    
    private int idProduto;
    private String nomeProduto;
    private String modeloProduto;
    private int quantidadeProduto;
    private String marcaProduto;
    private String categoriaProduto;
    private String generoProduto;
    private String tamanhoProduto;
    private double precoProduto;
    private String descricaoProduto;
    
    public Produto() {
         //TODO:Ao conectar-se ao banco, remover incremento pelo código
         qtdProdutosCriados++;
         this.idProduto =  qtdProdutosCriados;
    }
    
    public Produto( String modeloProduto,int quantidadeProduto, String marcaProduto, String categoriaProduto, 
            String generoProduto, String tamanhoProduto, double precoProduto, String descricaoProduto) {
        qtdProdutosCriados++;
        this.idProduto = qtdProdutosCriados;
        
        this.modeloProduto = modeloProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.marcaProduto = marcaProduto;
        this.categoriaProduto = categoriaProduto;
        this.generoProduto = generoProduto;
        this.tamanhoProduto = tamanhoProduto;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
        
    }
    
    public Produto(int idProduto,  String modeloProduto,int quantidadeProduto, String marcaProduto, String categoriaProduto, String generoProduto, String tamanhoProduto, double precoProduto, String descricaoProduto) {
        
        this.idProduto = idProduto;
        
        this.modeloProduto =modeloProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.marcaProduto = marcaProduto;
        this.categoriaProduto = categoriaProduto;
        this.generoProduto = generoProduto;
        this.tamanhoProduto = tamanhoProduto;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
        
    }

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the modeloProduto
     */
    public String getModeloProduto() {
        return modeloProduto;
    }

    /**
     * @param modeloProduto the modeloProduto to set
     */
    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }

    /**
     * @return the quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * @param quantidadeProduto the quantidadeProduto to set
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    /**
     * @return the marcaProduto
     */
    public String getMarcaProduto() {
        return marcaProduto;
    }

    /**
     * @param marcaProduto the marcaProduto to set
     */
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    /**
     * @return the categoriaProduto
     */
    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    /**
     * @param categoriaProduto the categoriaProduto to set
     */
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    /**
     * @return the generoProduto
     */
    public String getGeneroProduto() {
        return generoProduto;
    }

    /**
     * @param generoProduto the generoProduto to set
     */
    public void setGeneroProduto(String generoProduto) {
        this.generoProduto = generoProduto;
    }

    /**
     * @return the tamanhoProduto
     */
    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    /**
     * @param tamanhoProduto the tamanhoProduto to set
     */
    public void setTamanhoProduto(String tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    /**
     * @return the precoProduto
     */
    public double getPrecoProduto() {
        return precoProduto;
    }

    /**
     * @param precoProduto the precoProduto to set
     */
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    
    
}
