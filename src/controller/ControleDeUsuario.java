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
public class ControleDeUsuario {
    
    private Integer idUsuario;
    private String nome;
    private String login;
    private String adm;
    private String ativo;
    
    public ControleDeUsuario(){
    }

    public ControleDeUsuario(Integer idUsuario, String nome, String login, String adm, String ativo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.login = login;
        this.adm = adm;
        this.ativo = ativo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    //Não sei se funciona.
    public String getIdToString(Integer idUsuario){
        String idString = this.getIdUsuario().toString();
        return idString;
    }    
    
}
