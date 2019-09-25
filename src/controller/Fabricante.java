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
public class Fabricante {
    
    private Integer idFabricante;
    private String nome;

    public Fabricante() {
    }

    public Fabricante(Integer idFabricante, String nome) {
        this.idFabricante = idFabricante;
        this.nome = nome;
    }

    public Fabricante(String nome) {
        this.nome = nome;
    }

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
