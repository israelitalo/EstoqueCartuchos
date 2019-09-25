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
public class Setor {
    
    private Integer idSetor;
    private String setor;
    
    public Setor(){
    }

    public Setor(Integer idSetor, String setor) {
        this.idSetor = idSetor;
        this.setor = setor;
    }

    public Setor(String setor) {
        this.setor = setor;
    }

    public Integer getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Integer idSetor) {
        this.idSetor = idSetor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
