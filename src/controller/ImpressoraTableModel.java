/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author israe
 */
public class ImpressoraTableModel extends AbstractTableModel {
    
    private List<Impressora> dados = new ArrayList<>(); 
    private String[] colunas = {"ID", "MODELO", "SERIE", "FABRICANTE", "SETOR"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();//pegando as linhas da tabela.
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            
            case 0:
                return dados.get(linha).getId_impressora();
            case 1:
                return dados.get(linha).getModelo();
            case 2:
                return dados.get(linha).getSerie();
            case 3:
                return dados.get(linha).getFabricante();
            case 4:
                return dados.get(linha).getSetor();
        }
        
        return null;
        
    }

    //Método para alterar a tabela de Impressoras.
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            
            /*case 0:
                dados.get(linha).setId_impressora((Integer) valor);*/
            case 1:
                dados.get(linha).setModelo((String) valor);
                break;
            case 2:
                dados.get(linha).setSerie((String) valor);
                break;
            case 3:
                dados.get(linha).setFabricante((String) valor);
                break;
            case 4:
                dados.get(linha).setSetor((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
        
    }
    
    public void addRow(Impressora impressora){
        this.dados.add(impressora);
        this.fireTableDataChanged();//método que atualiza a tabela após qualquer alteração.
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
