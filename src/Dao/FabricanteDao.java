/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Fabricante;
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
public class FabricanteDao {
    
    private Connection con = null;
    
    public FabricanteDao(){
        con = ConexaoJdbc.getConnection();
    }
    
    public boolean salvar(Fabricante fabricante){
        String sql = "INSERT INTO fabricante (nome) VALUES (?)";
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fabricante.getNome());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FabricanteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean alterar(Fabricante fabricante, Integer idFabricante){
        String sql = "UPDATE fabricante SET nome = ? WHERE id_fabricante = '" + idFabricante + "'";
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fabricante.getNome());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FabricanteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean excluir(Integer idFabricante){
        String sql = "DELETE FROM fabricante WHERE id_fabricante = '" + idFabricante + "'";
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FabricanteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean verSeFabricanteCadastrado(String nome){
        String sql = "SELECT f.nome FROM fabricante f WHERE f.nome = '" + nome + "'";
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
            Logger.getLogger(FabricanteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public List<Fabricante> listarFabricante(){
        String sql = "SELECT * FROM fabricante";
        
        List<Fabricante> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Fabricante fabricante = new Fabricante();
                fabricante.setIdFabricante(rs.getInt("id_fabricante"));
                fabricante.setNome(rs.getString("nome"));
                lista.add(fabricante);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(FabricanteDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Fabricante> listarFabricanteLike(String busca){
        String sql = "SELECT f.id_fabricante, f.nome FROM fabricante f WHERE f.id_fabricante like '%" + busca + "%' OR f.nome LIKE '%" + busca + "%'";
        
        List<Fabricante> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Fabricante fabricante = new Fabricante();
                fabricante.setIdFabricante(rs.getInt("f.id_fabricante"));
                fabricante.setNome(rs.getString("f.nome"));
                lista.add(fabricante);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(SetorDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
