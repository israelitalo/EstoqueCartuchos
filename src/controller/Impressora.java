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
public class Impressora {
    
    private Integer id_impressora;
    private String modelo;
    private String serie;
    private String proprietario;
    private Integer id_fabricante;
    private Integer id_setor;
    private Integer id_cartucho;

    public Impressora(Integer id_impressora, String modelo, String serie, String proprietario, Integer id_fabricante, Integer id_setor, Integer id_cartucho) {
        this.id_impressora = id_impressora;
        this.modelo = modelo;
        this.serie = serie;
        this.proprietario = proprietario;
        this.id_fabricante = id_fabricante;
        this.id_setor = id_setor;
        this.id_cartucho = id_cartucho;
    }

    public Impressora() {
    }

    public Integer getId_impressora() {
        return id_impressora;
    }

    public void setId_impressora(Integer id_impressora) {
        this.id_impressora = id_impressora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(Integer id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public Integer getId_setor() {
        return id_setor;
    }

    public void setId_setor(Integer id_setor) {
        this.id_setor = id_setor;
    }

    public Integer getId_cartucho() {
        return id_cartucho;
    }

    public void setId_cartucho(Integer id_cartucho) {
        this.id_cartucho = id_cartucho;
    }
    
}