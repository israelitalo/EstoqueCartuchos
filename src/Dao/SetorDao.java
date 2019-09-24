/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Setor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author israe
 */
public class SetorDao {
    
    private Connection con = null;
    
    public SetorDao(){
        con = ConexaoJdbc.getConnection();
        System.out.println("SetorDao conectado.");
    }
    
    public boolean salvar(Setor setor){
        String sql = "INSERT INTO setor (setor) VALUES (?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, setor.getSetor());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SetorDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean alterar(Setor setor, Integer idSetor){
        String sql = "UPDADE setor SET nome = ? WHERE id_setor = '" + idSetor + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, setor.getSetor());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SetorDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean excluir(Integer idSetor){
        String sql = "DELETE FROM excluir WHERE id_setor = '" + idSetor + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SetorDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean verSeSetorCadastrado(String setor){
        String sql = "SELECT FROM setor WHERE setor = '" + setor + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs.next() == false){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SetorDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
