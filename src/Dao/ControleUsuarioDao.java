/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.ControleDeUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HJP_TI-CPD2
 */
public class ControleUsuarioDao {
    
    private Connection con = null;
    
    public ControleUsuarioDao (){
        con = ConexaoJdbc.getConnection();
    }
    
    //Método para listar os usuários cadastrados na tabela da TelaControleUsuario.
    public List<ControleDeUsuario> listarUsuarios(){
        
        String sql = "SELECT c.idusuario, u.nome, u.login, c.adm, c.ativo FROM usuario u, controledeusuario c WHERE u.id_usuario = c.idusuario";
        
        List<ControleDeUsuario> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                ControleDeUsuario cdu = new ControleDeUsuario();
                cdu.setIdUsuario(rs.getInt("c.idusuario"));
                cdu.setNome(rs.getString("u.nome"));
                cdu.setLogin(rs.getString("u.login"));
                cdu.setAdm(rs.getString("c.adm"));
                cdu.setAtivo(rs.getString("c.ativo"));
                lista.add(cdu);
            }
            //ConexaoJdbc.closeConnection(con, stmt, rs);
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ControleUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String getPasswordUsuario(Integer idUsuario){
        
        String sql = "SELECT u.senha FROM usuario u, controledeusuario c WHERE u.id_usuario = '" + idUsuario + "' AND c.idusuario = '" + idUsuario + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                String senha = rs.getString("u.senha");
                return senha;
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ControleUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public boolean salvar(ControleDeUsuario cdu){
        
        String sql = "INSERT INTO controledeusuario (idusuario, adm, ativo) VALUES (?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cdu.getIdUsuario());
            stmt.setString(2, cdu.getAdm());
            stmt.setString(3, cdu.getAtivo());
            stmt.executeUpdate();
            //ConexaoJdbc.closeConnection(con, stmt);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControleUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
