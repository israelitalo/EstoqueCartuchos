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
   private String cor;
   private Integer quantidade;

    public Cartucho(Integer idCartucho, String tipo, String modelo, String cor, Integer quantidade) {
        this.idCartucho = idCartucho;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidade = quantidade;
    }

    public Cartucho(String tipo, String modelo, String cor, Integer quantidade) {
        this.tipo = tipo;
        this.modelo = modelo;
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
    
}
