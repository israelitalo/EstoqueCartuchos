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
        
        String sql = "INSERT INTO cartucho (tipo, modelo, impressora, cor, quantidade) VALUES (?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cartucho.getTipo());
            stmt.setString(2, cartucho.getModelo());
            stmt.setString(3, cartucho.getImpressora());
            stmt.setString(4, cartucho.getCor());
            stmt.setInt(5, cartucho.getQuantidade());
            
            stmt.executeUpdate();
            
            ConexaoJdbc.closeConnection(con, stmt);//Mesmo com a excessão aparecendo, este encerramento precisa ser feito,
            //pois, sem ele, o cadastro do cartucho está sendo feito em duplicidade.
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        /*finally
        {
            ConexaoJdbc.closeConnection(con, stmt);
            System.out.println("Conexão encerrada com o DB!");
        }*/
    }
    
    public List<Cartucho> selectCartucho (){
        
        String sql = "SELECT * FROM cartucho";
        
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
                cartucho.setImpressora(rs.getString("impressora"));
                cartucho.setCor(rs.getString("cor"));
                cartucho.setQuantidade(rs.getInt("quantidade"));//Talvez não funcione dessa forma, pois a quantidade é um int.
                
                cartuchos.add(cartucho);
            }
            ConexaoJdbc.closeConnection(con, stmt, rs);
            System.out.println("Conexão completamente encerrada!");
            return cartuchos;
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    //Método para coletar o valor do atributo quantidade no banco de dados e retorná-lo na tela TelaEstoque.
    public Integer getEstoque (Integer idInt){
        
       String sql = "SELECT quantidade FROM cartucho WHERE id_cartucho = " + idInt;
       
       PreparedStatement stmt = null;
       
       System.out.println(sql);
       try{
           System.out.println("Iniciando coleção do estoque...");
           stmt = con.prepareStatement(sql);           
           ResultSet rs = stmt.executeQuery();
           rs.next();
           int estoque = rs.getInt("quantidade");
           stmt.execute();
           
           //ConexaoJdbc.closeConnection(con, stmt, rs);
           ConexaoJdbc.closeConnection(rs);
           System.out.println("Conexão com ResultSet encerrada.");
           return estoque;
           
       } catch (SQLException ex) {
           System.out.println("falha ao coletar quantidade!");
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
            System.out.println("Conexão encerrada com o BD.");
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        
    }
    
}
