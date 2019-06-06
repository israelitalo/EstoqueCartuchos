/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HJP_TI-CPD2
 */
public class ConexaoJdbc {
    
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc.mysql://127.0.0.1:3306/cartuchoshjp?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Connection getConnection() throws SQLException{
        
        try {
            
            Class.forName(Driver);
            
            System.out.println("Conexão realizada com sucesso!");
            
            return DriverManager.getConnection(URL, USER, PASS);
            
            } catch (ClassNotFoundException ex) {
            
            throw new RuntimeException("Erro na conexao", ex);  
        }
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try{
                con.close();
            } catch (SQLException ex) {
               System.err.println("Erro!" + ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement ps){
        
        if(ps != null){
            try{
                ps.close();
            } catch (SQLException ex) {
                System.err.println("Erro!" + ex);
            }
        }
        
        closeConnection(con);
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs){
        
        if(rs != null){
            try{
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro!" + ex);
            }
        }
        
        closeConnection(con, ps);
        
    }
    
}