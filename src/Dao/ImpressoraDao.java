/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Impressora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class ImpressoraDao {
    
    private Connection con = null;
    
    public ImpressoraDao(){
        con = ConexaoJdbc.getConnection();
        System.out.println("ImpressoraDao conectado!");
    }
    
    public List<Impressora> selectImpressora(){
        
        String sql = "SELECT i.id_impressora, i.modelo, i.serie, f.nome, s.setor FROM impressora i, fabricante f, setor s WHERE i.id_fabricante = f.id_fabricante and i.id_setor = s.id_setor";
        
        List<Impressora> listaImpressora = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Impressora impressora = new Impressora();
                impressora.setId_impressora(rs.getInt("id_impressora"));
                impressora.setModelo(rs.getString("modelo"));
                impressora.setSerie(rs.getString("serie"));
                impressora.setFabricante(rs.getString("nome"));
                impressora.setSetor(rs.getString("setor"));
                listaImpressora.add(impressora);
            }
            ConexaoJdbc.closeConnection(con, stmt);
            return listaImpressora;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void carregarJcomboBoxFabricante(JComboBox comboBox){
        
        String sql = "SELECT nome from fabricante";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String fabricante = rs.getString("nome");
                comboBox.addItem(fabricante);
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Ocorreu erro ao carregar a Combo Box", "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void carregarJComboBoxSetor(JComboBox comboBox){
        
        String sql = "SELECT setor FROM setor";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String setor = rs.getString("setor");
                comboBox.addItem(setor);
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Ocorreu erro ao carregar a Combo Box", "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
