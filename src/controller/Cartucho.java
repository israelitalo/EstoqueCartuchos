/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author HJP_TI-CPD2
 */
public class Cartucho {
    
   private Integer idCartucho;
   private String tipo;
   private String modelo;
   private Integer idImpressora;
   private String cor;
   private Integer quantidade;
   private String modeloImpressora;//para utilização da String nas listas de Arrays.

    public Cartucho(Integer idCartucho, String tipo, String modelo, Integer idImpressora, String cor, Integer quantidade) {
        this.idCartucho = idCartucho;
        this.tipo = tipo;
        this.modelo = modelo;
        this.idImpressora = idImpressora;
        this.cor = cor;
        this.quantidade = quantidade;
    }

    public Cartucho(Integer idCartucho, String tipo, String modelo, String modeloImpressora, String cor, Integer quantidade) {
    this.idCartucho = idCartucho;
    this.tipo = tipo;
    this.modelo = modelo;
    this.modeloImpressora = modeloImpressora;
    this.cor = cor;
    this.quantidade = quantidade;
    }
    
    public Cartucho(String tipo, String modelo, Integer idImpressora, String cor, Integer quantidade) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.idImpressora = idImpressora;
        this.cor = cor;
        this.quantidade = quantidade;
    }
    
    public Cartucho(String tipo, String modelo, String modeloImpressora, String cor, Integer quantidade) {
    this.tipo = tipo;
    this.modelo = modelo;
    this.modeloImpressora = modeloImpressora;
    this.cor = cor;
    this.quantidade = quantidade;
    }
    
   public Cartucho(){
   }

    public Integer getIdCartucho() {
        return idCartucho;
    }

    public void setIdCartucho(Integer idCartucho) {
        this.idCartucho = idCartucho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getImpressora() {
        return idImpressora;
    }

    public void setImpressora(Integer idImpressora) {
        this.idImpressora = idImpressora;
    }
    
    public String getModeloImpressora(){
        return modeloImpressora;
    }
    
    public void setModeloImpressora(String modeloImpressora){
        this.modeloImpressora = modeloImpressora;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public Integer somaQuantidade(Integer quantidadeBD, Integer quantidade){
        return quantidadeBD + quantidade;        
    }
    
    public Integer subtrairQuantidade(Integer quantidadeBD, Integer quantidade){
        return quantidadeBD - quantidade;
    }
    
}
