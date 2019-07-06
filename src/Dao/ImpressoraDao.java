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
    
    public boolean salvar(Impressora impressora){
        
        String sql = "INSERT INTO impressora (modelo, serie, id_fabricante, id_setor) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, impressora.getModelo());
            stmt.setString(2, impressora.getSerie());
            stmt.setInt(3, impressora.getId_fabricante());
            stmt.setInt(4, impressora.getId_setor());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);

            return false;
        }
        
    }
    
    public boolean editar(Impressora impressora, Integer idImpressora){
        
        String sql = "UPDATE impressora SET modelo=?, serie=?, id_fabricante=?, id_setor=? WHERE id_impressora = '" + idImpressora + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, impressora.getModelo());
            stmt.setString(2, impressora.getSerie());
            stmt.setInt(3, impressora.getId_fabricante());
            stmt.setInt(4, impressora.getId_setor());
            
            if(impressora.getModelo().equals("") || impressora.getSerie().equals("")){
                return false;
            }
            else
            {          
                stmt.executeUpdate();
                return true;
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }
        
    }
    
    public boolean excluir(Integer idImpressora){
        
        String sql = "DELETE FROM impressora WHERE id_impressora = '" + idImpressora + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }
    }
    
    public List<Impressora> selectImpressora(){
        
        String sql = "SELECT i.id_impressora, i.modelo, i.serie, f.nome, s.setor FROM impressora i, fabricante f, setor s WHERE i.id_fabricante = f.id_fabricante and i.id_setor = s.id_setor ORDER BY modelo";
        
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
            //ConexaoJdbc.closeConnection(con, stmt);
            return listaImpressora;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public List<Impressora>listaImpressoraLike (String busca){
        
        String sql = "SELECT i.id_impressora, i.modelo, i.serie, f.nome, s.setor FROM impressora i INNER JOIN fabricante f ON i.id_fabricante = f.id_fabricante INNER JOIN setor s ON i.id_setor = s.id_setor WHERE i.modelo LIKE '%" + busca + "%' OR i.serie LIKE '%" + busca + "%' OR f.nome LIKE '%" + busca + "%' OR s.setor LIKE '%" + busca + "%' ORDER BY modelo;";
        
        List<Impressora> listaImpressoraLike = new ArrayList<>();
        
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
                listaImpressoraLike.add(impressora);
            }
            
            return listaImpressoraLike;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        
        return null;
        
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
    
    public Integer getIdFabricanteJcomboBox(String fabricante){
        
        String sql = "SELECT f.id_fabricante FROM fabricante f WHERE f.nome = '" + fabricante + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Integer idFabricante = rs.getInt("id_fabricante");
                return idFabricante;
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        
        return null;
        
    }
    
    public Integer getIdSetorJComboBox(String setor){
        
        String sql = "SELECT s.id_setor FROM setor s WHERE s.setor = '" + setor + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idSetor = rs.getInt("id_setor");
                return idSetor;
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            System.err.println("Erro:" + ex);
        }
        
        return null;
        
    }
    
}
