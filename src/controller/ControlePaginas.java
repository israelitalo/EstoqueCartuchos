/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author israe
 */
public class ControlePaginas {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//Datas devem ser inseridas dessa forma, no banco de dados.
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");//Como deve ser mostrada na tabela.
    
    private Integer idControle;
    private Integer idImpressora;
    private String data;
    private Integer paginaInicial;
    private Integer paginaFinal;
    private Integer paginaTotal;
    private String impressora;

    public ControlePaginas(Integer idControle, Integer idImpressora, String data, Date datafinal, Integer paginaInicial, Integer paginaFinal, Integer paginaTotal) {
        this.idControle = idControle;
        this.idImpressora = idImpressora;
        this.data = data;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.paginaTotal = paginaTotal;
    }

    public ControlePaginas(Integer idImpressora, String data, Date datafinal, Integer paginaInicial, Integer paginaFinal, Integer paginaTotal) {
        this.idImpressora = idImpressora;
        this.data = data;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.paginaTotal = paginaTotal;
    }

    public ControlePaginas(Integer idControle, String data, Integer paginaInicial, Integer paginaFinal, Integer paginaTotal, String impressora) {
        this.idControle = idControle;
        this.data = data;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.paginaTotal = paginaTotal;
        this.impressora = impressora;
    }

    public ControlePaginas(Integer idControle, Integer idImpressora, String data, Integer paginaTotal, String impressora) {
        this.idControle = idControle;
        this.idImpressora = idImpressora;
        this.data = data;
        this.paginaTotal = paginaTotal;
        this.impressora = impressora;
    }

    public ControlePaginas(Integer idControle, Integer idImpressora, String data, Integer paginaTotal) {
        this.idControle = idControle;
        this.idImpressora = idImpressora;
        this.data = data;
        this.paginaTotal = paginaTotal;
    }
    
    public ControlePaginas(){
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }
    
    public Integer getIdControle() {
        return idControle;
    }

    public void setIdControle(Integer idControle) {
        this.idControle = idControle;
    }    
    
    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        ControlePaginas.sdf = sdf;
    }

    public static SimpleDateFormat getSdf1() {
        return sdf1;
    }

    public static void setSdf1(SimpleDateFormat sdf1) {
        ControlePaginas.sdf1 = sdf1;
    }

    public Integer getIdImpressora() {
        return idImpressora;
    }

    public void setIdImpressora(Integer idImpressora) {
        this.idImpressora = idImpressora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(Integer paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public Integer getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(Integer paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public Integer getPaginaTotal() {
        return paginaTotal;
    }

    public void setPaginaTotal(Integer paginaTotal) {
        this.paginaTotal = paginaTotal;
    }
    
    public Integer diminuirPaginas(Integer paginaInicial, Integer paginaFinal){
        this.paginaTotal = paginaFinal - paginaInicial;
        return this.paginaTotal;
    }
    
    public Integer somarPaginas(Integer paginaInicial, Integer paginaFinal){
        this.paginaTotal = paginaFinal + paginaInicial;
        return this.paginaTotal;
    }
}