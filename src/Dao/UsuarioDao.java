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
        //System.out.println("Conexão UsuarioDao iniciada.");   
    }
    
    //método para inserir usuário logado.
    public boolean setUsuarioLogado(Usuario usuario){
        
        String sql = "INSERT INTO usuariologado(usuariologado) VALUES (?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.executeUpdate();
            //ConexaoJdbc.closeConnection(con, stmt);
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
    
    //método para pegar id do usuario logado.
    public Integer getIdUsuarioLogado(String usuario){
        
        String sql = "SELECT usuario.id_usuario FROM usuario WHERE usuario.login = '" + usuario +  "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idUsuarioLogado = rs.getInt("id_usuario");
                return idUsuarioLogado;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    //Verificação de login.
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
    
    //Método para verificar na tabela controledeusuario se o usuario tem acesso de adm ou nao.
    public String verSeUsuarioEadm(Integer id){
        
        String sql = "SELECT c.adm FROM controledeusuario c WHERE c.idusuario = '" + id + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                String adm = rs.getString("adm");
                return adm;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    //Método para verificar se o usuario está ativo ou inativo, para poder liberar o login
    public String usuarioAtivoOuInativo(Integer id){
        
        String sql = "SELECT c.ativo FROM controledeusuario c WHERE c.idusuario = '" + id + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                String ativo = rs.getString("ativo");
                return ativo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public boolean salvarUsuario(Usuario usuario){
        
        String sql = "INSERT INTO usuario (nome, login, senha) VALUES (?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Integer getIdUsuario(String login){
        
        String sql = "SELECT id_usuario FROM usuario WHERE login = '" + login + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                return idUsuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public boolean alterar(Usuario usuario, Integer idUsuario){
        String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE id_usuario = '" + idUsuario + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public String loginDisponivel(String login){
        String sql = "SELECT login FROM usuario WHERE login = '" + login + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs.next() == false){
                String loginBD = "disponivel";
                return loginBD;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
 
    public boolean excluir(Integer idUsuario){
        String sql = "DELETE FROM usuario WHERE id_usuario = '" + idUsuario + "'";
        
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
    
}
