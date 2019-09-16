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
public class Notificacao {
    
    private Integer idNotificacao;
    private Integer idUsuario;
    private String usuario;
    private String tipoNotificacao;
    private String descricao;

    public Notificacao() {
    }

    public Notificacao(Integer idNotificacao, Integer idUsuario, String tipoNotificacao, String descricao) {
        this.idNotificacao = idNotificacao;
        this.idUsuario = idUsuario;
        this.tipoNotificacao = tipoNotificacao;
        this.descricao = descricao;
    }

    public Notificacao(Integer idNotificacao, String usuario, String tipoNotificacao, String descricao) {
        this.idNotificacao = idNotificacao;
        this.usuario = usuario;
        this.tipoNotificacao = tipoNotificacao;
        this.descricao = descricao;
    }

    public Integer getIdNotificacao() {
        return idNotificacao;
    }

    public void setIdNotificacao(Integer idNotificacao) {
        this.idNotificacao = idNotificacao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(String tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
