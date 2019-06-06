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
public class Fabricante {
    
    private Integer id_fabricante;
    private String nome;
    private String cnpj;

    public Fabricante(Integer id_fabricante, String nome, String cnpj) {
        this.id_fabricante = id_fabricante;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Fabricante() {
    }

    public Integer getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(Integer id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
