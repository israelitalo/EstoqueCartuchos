/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author israel
 */
public class UsuarioDao {
    
    private Connection con = null;
    
    public UsuarioDao (){
        con = ConexaoJdbc.getConnection();
        System.out.println("Conexão UsuarioDao iniciada.");   
    }
    
    //método para inserir usuário logado.
    public boolean setUsuarioLogado(Usuario usuario){
        
        String sql = "INSERT INTO usuariologado(usuariologado) VALUES (?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.executeUpdate();
            ConexaoJdbc.closeConnection(con, stmt);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //método para coletar o usuário logado.
    public String getUsuarioLogado(){
        
        String sql = "SELECT u.usuariologado FROM usuariologado u";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            if(rs.getString("usuariologado") != null){
                String usuario = rs.getString("usuariologado");
                return usuario;
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean limparTabelaUsuarioLogado(){
        
        String sql = "DELETE FROM usuariologado";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean login(String login, String senha){
        
        String sql = "SELECT * FROM usuario WHERE login = '" + login + "' AND senha = '" + senha + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String loginBD = rs.getString("login");
            String senhaBD = rs.getString("senha");
            
            //ConexaoJdbc.closeConnection(con, stmt, rs);
            
            if(loginBD.equals(login) && senhaBD.equals(senha)){
                return true;
            }
            else
            {
                return false;
            }
           
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        /*finally{
            ConexaoJdbc.closeConnection(con, stmt);
        }*/
    }
    
}
