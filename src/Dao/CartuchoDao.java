/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Cartucho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Israel
 */
public class CartuchoDao {
    
    private Connection con = null;
    
    public CartuchoDao(){
        
        con = ConexaoJdbc.getConnection();
        
        System.out.println("CartuchoDao: conexão iniciada!");
        
    }
    
    public boolean salvar (Cartucho cartucho){
        
        String sql = "INSERT INTO cartucho (tipo, modelo, cor, quantidade) VALUES (?,?,?,?)";
        
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cartucho.getTipo());
            stmt.setString(2, cartucho.getModelo());
            stmt.setString(3, cartucho.getCor());
            stmt.setInt(4, cartucho.getQuantidade());
            
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        finally
        {
            ConexaoJdbc.closeConnection(con, stmt);
            System.out.println("Conexão encerrada com o DB!");
        }
    }
    
    
    
    
    
}
