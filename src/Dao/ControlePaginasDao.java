/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
        String sql = "SELECT i.modelo FROM impressora i";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String modelo = rs.getString("modelo");
                comboBox.addItem(modelo);
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Ocorreu erro ao carregar a Combo Box", "Erro",
                JOptionPane.ERROR_MESSAGE);
            }
        
    }
    
}
