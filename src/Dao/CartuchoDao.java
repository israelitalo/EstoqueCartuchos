/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Cartucho;
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
 * @author Israel
 */
public class CartuchoDao {
    
    private Connection con = null;
    
    public CartuchoDao(){
        
        con = ConexaoJdbc.getConnection();
        
        //System.out.println("CartuchoDao: conexão iniciada!");
        
    }
    
    public boolean editar (Cartucho cartucho, Integer intId){
        
        String sql = "UPDATE cartucho SET tipo=?, modelo=?, id_impressora=?, cor=? WHERE id_cartucho = '" + intId + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cartucho.getTipo());
            stmt.setString(2, cartucho.getModelo());
            stmt.setInt(3, cartucho.getImpressora());//foi mudado para int.
            stmt.setString(4, cartucho.getCor());
            
            if(cartucho.getModelo().equals("") || cartucho.getImpressora().equals("") || cartucho.getCor().equals("Cor")){
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
    
    public boolean salvar (Cartucho cartucho){
        
        String sql = "INSERT INTO cartucho (tipo, modelo, id_impressora, cor, quantidade) VALUES (?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cartucho.getTipo());
            stmt.setString(2, cartucho.getModelo());
            stmt.setInt(3, cartucho.getImpressora());
            stmt.setString(4, cartucho.getCor());
            stmt.setInt(5, cartucho.getQuantidade());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        
    }
    
    /*public List<Cartucho> selectCartuchoAlterar(){
        
        String sql = "SELECT c.id_cartucho, c.tipo, c.modelo, i.modelo, c.cor FROM cartucho c, impressora i WHERE c.id_impressora = i.id_impressora";
        
        List<Cartucho> listaCartucho = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cartucho cartucho = new Cartucho();
                cartucho.setIdCartucho(rs.getInt("id_cartucho"));
                cartucho.setTipo(rs.getString("tipo"));
                cartucho.setModelo(rs.getString("modelo"));
                cartucho.setModeloImpressora(rs.getString("i.modelo"));
                cartucho.setCor(rs.getString("cor"));
                
                listaCartucho.add(cartucho);
            }
            ConexaoJdbc.closeConnection(con, stmt, rs);
            return listaCartucho;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }*/
    
    public List<Cartucho> selectCartuchoMovEstoque(){
        
        String sql = "SELECT id_cartucho, modelo, cor, quantidade FROM cartucho";
     
        List<Cartucho> listarCartucho = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Cartucho cartucho = new Cartucho();
                cartucho.setIdCartucho(rs.getInt("id_cartucho"));
                cartucho.setModelo(rs.getString("modelo"));
                cartucho.setCor(rs.getString("cor"));
                cartucho.setQuantidade(rs.getInt("quantidade"));
                listarCartucho.add(cartucho);
            }
            ConexaoJdbc.closeConnection(con, stmt);
            return listarCartucho;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public List<Cartucho> selectCartucho (){
        String sql = "SELECT c.id_cartucho, c.tipo, c.modelo, i.modelo, i.id_setor, c.cor, c.quantidade FROM cartucho c, impressora i WHERE c.id_impressora = i.id_impressora";
        
        List<Cartucho> cartuchos = new ArrayList<Cartucho>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Cartucho cartucho = new Cartucho();
                cartucho.setIdCartucho(rs.getInt("id_cartucho"));
                cartucho.setTipo(rs.getString("tipo"));
                cartucho.setModelo(rs.getString("modelo"));
                cartucho.setModeloImpressora(rs.getString("i.modelo"));//mudou para getInt
                cartucho.setSetor(getSetorCartucho(rs.getInt("i.id_setor")));
                cartucho.setCor(rs.getString("cor"));
                cartucho.setQuantidade(rs.getInt("quantidade"));
                
                cartuchos.add(cartucho);
            }
            //ConexaoJdbc.closeConnection(con, stmt);
            //System.out.println("Conexão completamente encerrada!");
            return cartuchos;
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    //Método para coletar o valor do atributo quantidade no banco de dados e retorná-lo na tela TelaEstoque.
    public Integer getEstoque (Integer idInt){
        
       String sql = "SELECT quantidade FROM cartucho WHERE id_cartucho = " + idInt;
       
       PreparedStatement stmt = null;
       
       try{
           //System.out.println("Iniciando coleção do estoque...");
           stmt = con.prepareStatement(sql);           
           ResultSet rs = stmt.executeQuery();
           rs.next();
           int estoque = rs.getInt("quantidade");
           stmt.execute();
           
           //ConexaoJdbc.closeConnection(con, stmt, rs);
           ConexaoJdbc.closeConnection(rs);
           //System.out.println("Conexão com ResultSet encerrada.");
           return estoque;
           
       } catch (SQLException ex) {
           //System.out.println("falha ao coletar quantidade!");
           System.err.println("Erro!" + ex);
           return null;
        }
    }
    
    //Método para alterar o valor do atributo quantidade no banco de dados, através da aplicação.
    public boolean atualizarQuantidade(Cartucho cartucho, Integer idInt){
        
        String sql = "UPDATE cartucho SET quantidade =? WHERE id_cartucho =" + idInt;
        
        PreparedStatement stmt = null;
    
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cartucho.getQuantidade());
            
            stmt.executeUpdate();
            
            //ConexaoJdbc.closeConnection(con, stmt);
            //System.out.println("Conexão encerrada com o BD.");
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        
    }
    
    public boolean excluir (Cartucho cartucho, Integer idInt){
        
        String sql = "DELETE FROM cartucho WHERE id_cartucho =" + idInt;
        
        PreparedStatement stmt = null;
        //Não encerrei a conexão neste método, porque o método listarCartuchos já encerra a conexão com o BD.
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
    }
    
    public void cleanAutoIncrementTableCartucho(){
        String sql = "ALTER TABLE cartucho AUTO_INCREMENT = 0";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CartuchoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void carregarJcomboBox(JComboBox comboBox){
        
        String sql = "SELECT impressora.modelo FROM impressora ORDER BY modelo";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                String modelo = (rs.getString("modelo"));
                comboBox.addItem(modelo);
            }
            ConexaoJdbc.closeConnection(con, stmt);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,
            "Ocorreu erro ao carregar a Combo Box de Impressoras", "Erro",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public Integer getIdJcomboBoxImpressora(String modelo){
        
        String sql = "SELECT id_impressora FROM impressora WHERE impressora.modelo = '" + modelo + "'";
        
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
            System.err.println("Erro!" + ex);
        }
        return null;
    }
    
    //Método para pegar o setor da tabela da Tela Estoque.
    public String getSetorCartucho(Integer idSetor){
        
        String sql = "SELECT s.setor FROM setor s, impressora i WHERE s.id_setor = '" + idSetor + "' AND i.id_setor = '" + idSetor + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                String setor = rs.getString("s.setor");
                return setor;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartuchoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public Integer getIdSetorImpressora(Integer idImpressora){
        
        String sql = "SELECT i.id_setor FROM impressora i WHERE i.id_impressora = '" + idImpressora + "'";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                int setor = rs.getInt("i.id_setor");
                return setor;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartuchoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public List<Cartucho> listaCartuchoTelaTableComLike(String busca){
        String sql = "SELECT c.id_cartucho, c.modelo, c.tipo, i.modelo, c.cor FROM cartucho c INNER JOIN impressora i ON c.id_impressora = i.id_impressora WHERE c.modelo LIKE '%" + busca + "%' OR c.tipo LIKE '%" + busca + "%' OR i.modelo LIKE '%" + busca + "%' OR c.cor LIKE '%" + busca + "%'";
    
        List<Cartucho> lista = new ArrayList<Cartucho>();
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Cartucho cart = new Cartucho();
                cart.setIdCartucho(rs.getInt("c.id_cartucho"));
                cart.setModelo(rs.getString("c.modelo"));
                cart.setTipo(rs.getString("c.tipo"));
                cart.setModeloImpressora(rs.getString("i.modelo"));
                cart.setCor(rs.getString("c.cor"));
                lista.add(cart);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CartuchoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
