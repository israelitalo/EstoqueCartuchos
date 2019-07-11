/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.ControlePaginas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author HJP_TI-CPD2
 */
public class ControlePaginasDao {
    
    private Connection con = null;
    
    public ControlePaginasDao(){
        con = ConexaoJdbc.getConnection();
        System.out.println("ControlePaginasDao conectado com sucesso!");
    }
    
    public void carregarComboBoxImpressora(JComboBox comboBox){
        
        String sql = "SELECT modelo FROM impressora";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String modelo = rs.getString("modelo");
                comboBox.addItem(modelo);
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Ocorreu erro ao carregar a Combo Box", "Erro",
                JOptionPane.ERROR_MESSAGE);
            }
        
    }
    
    public Integer getIdJcomboBoxImpressora(String impressora){
        
        String sql = "SELECT i.id_impressora FROM impressora i WHERE i.modelo = '" + impressora + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idImpressora = rs.getInt("id_impressora");
                return idImpressora;
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            System.err.println("Erro:" + ex);;
        }
        return null;
    }
    
    public boolean salvar(ControlePaginas cp){
        
        String sql = "INSERT INTO controlepaginas (id_impressora, data, pagina_inicial, pagina_final, pagina_total) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cp.getIdImpressora());
            stmt.setString(2, cp.getData());
            stmt.setInt(3, cp.getPaginaInicial());
            stmt.setInt(4, cp.getPaginaFinal());
            stmt.setInt(5, cp.getPaginaTotal());
            stmt.executeUpdate();
            
            ConexaoJdbc.closeConnection(con, stmt);
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }
    }
    
}
