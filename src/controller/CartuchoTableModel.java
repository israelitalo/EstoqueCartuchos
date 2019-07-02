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
public class CartuchoTableModel extends AbstractTableModel {

    private List<Cartucho> dados = new ArrayList<>();
    private String[] colunas = {"CÓDIGO", "TIPO", "MODELO", "IMPRESSORA", "COR"};
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();//pegando linha da tabela.
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            
            case 0:
                return dados.get(linha).getIdCartucho();
            case 1:
                return dados.get(linha).getTipo();
            case 2:
                return dados.get(linha).getModelo();
            case 3:
                return dados.get(linha).getImpressora();
            case 4:    
                return dados.get(linha).getCor();
        }        
        
        return null;
        
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            
            case 0:
                dados.get(linha).setIdCartucho((Integer) valor);
                break;
            case 1:
                dados.get(linha).setTipo((String) valor);
                break;
            case 2:
                dados.get(linha).setModelo((String) valor);
                break;
            case 3:
                dados.get(linha).setModeloImpressora((String) valor);
                break;
            case 4:    
                dados.get(linha).setCor((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
        
    }
    
    public void addRow(Cartucho cartucho){
        
        this.dados.add(cartucho);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
