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

    private List<Cartucho> lista = new ArrayList<>();
    private String[] colunas = {"CÓDIGO", "TIPO", "MODELO", "IMPRESSORA", "COR"};
    //teste
    private ArrayList dados = null;
    
    //teste
    public CartuchoTableModel(ArrayList dados, String[] colunas){
        setLinhas(dados);
        setColunas(colunas);
    }
    //teste
    public CartuchoTableModel(){
    }
    //teste
    public ArrayList getLinhas(){
        return dados;
    }
    //teste
    public void setLinhas(ArrayList dados){
        this.dados = dados;
    }
    //teste
    public String[] getColunas(){
        return colunas;
    }
    //teste
    public void setColunas(String[] colunas){
        colunas = this.colunas;
    }
    
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
    public Object getValueAt(int linhas, int colunas) {
        Object[] linha = (Object[])getLinhas().get(linhas);//teste
        //não teste
        switch(colunas){
            
            case 0:
                return lista.get(linhas).getIdCartucho();
            case 1:
                return lista.get(linhas).getTipo();
            case 2:
                return lista.get(linhas).getModelo();
            case 3:
                return lista.get(linhas).getImpressora();
            case 4:    
                return lista.get(linhas).getCor();
        }  
        
        return linha[colunas];
        
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            
            case 0:
                lista.get(linha).setIdCartucho((Integer) valor);
                break;
            case 1:
                lista.get(linha).setTipo((String) valor);
                break;
            case 2:
                lista.get(linha).setModelo((String) valor);
                break;
            case 3:
                lista.get(linha).setModeloImpressora((String) valor);
                break;
            case 4:    
                lista.get(linha).setCor((String) valor);
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
    
    public void atualizarAdd(){
        this.fireTableDataChanged();
    }
    
}
