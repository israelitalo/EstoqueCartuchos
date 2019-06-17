/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author israe
 */
public class Impressora {
    
    private Integer id_impressora;
    private String modelo;
    private String serie;
    private Integer id_fabricante;
    private Integer id_setor; //chave estrangeira no banco de dados.

    public Impressora(Integer id_impressora, String modelo, String serie, Integer id_fabricante, Integer id_setor) {
        this.id_impressora = id_impressora;
        this.modelo = modelo;
        this.serie = serie;
        this.id_fabricante = id_fabricante;
        this.id_setor = id_setor;
    }
 
    public Impressora(){
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

    public Integer getFabricante() {
        return id_fabricante;
    }

    public void setFabricante(Integer id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public Integer getId_setor() {
        return id_setor;
    }

    public void setId_setor(Integer id_setor) {
        this.id_setor = id_setor;
    }
    
}
