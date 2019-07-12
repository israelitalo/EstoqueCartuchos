/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.ControlePaginas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author HJP_TI-CPD2
 */
public class ControlePaginasDao {
    
    private Connection con = null;
    
    public ControlePaginasDao(){
        con = ConexaoJdbc.getConnection();
        System.out.println("ControlePaginasDao conectado com sucesso!");
    }
    
    public void carregarComboBoxImpressora(JComboBox comboBox){
        
        String sql = "SELECT modelo FROM impressora";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String modelo = rs.getString("modelo");
                comboBox.addItem(modelo);
            }
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Ocorreu erro ao carregar a Combo Box", "Erro",
                JOptionPane.ERROR_MESSAGE);
            }
        
    }
    
    public Integer getIdJcomboBoxImpressora(String impressora){
        
        String sql = "SELECT i.id_impressora FROM impressora i WHERE i.modelo = '" + impressora + "'";
        
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
            System.err.println("Erro:" + ex);;
        }
        return null;
    }
    
    public boolean salvar(ControlePaginas cp){
        
        String sql = "INSERT INTO controlepaginas (id_impressora, data, pagina_total) VALUES (?, ?, ?,)";// novo select
                     //"INSERT INTO controlepaginas (id_impressora, data, pagina_inicial, pagina_final, pagina_total) VALUES (?, ?, ?, ?, ?)" // select antigo
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cp.getIdImpressora());
            stmt.setString(2, cp.getData());
            /*stmt.setInt(3, cp.getPaginaInicial());
            stmt.setInt(4, cp.getPaginaFinal());*/
            stmt.setInt(3, cp.getPaginaTotal());
            stmt.executeUpdate();
            
            ConexaoJdbc.closeConnection(con, stmt);
            
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }
    }
    
    public List<ControlePaginas> listar(Integer idImpressora, String dataInicial, String dataFinal){
        
        String sql = "SELECT c.id_controle, i.modelo, c.data, c.pagina_total  FROM controlepaginas c, impressora i WHERE c.id_impressora = '" + idImpressora + "' AND c.id_impressora = i.id_impressora AND data >= '" + dataInicial + "' AND data <= '" + dataFinal + "' ORDER BY data"; // novo select.
                    //"SELECT c.id_controle, i.modelo, c.data, c.pagina_inicial, c.pagina_final, c.pagina_total  FROM controlepaginas c, impressora i WHERE c.id_impressora = '" + idImpressora + "' AND c.id_impressora = i.id_impressora AND data >= '" + dataInicial + "' AND data <= '" + dataFinal + "' ORDER BY data" // select antigo.
        List<ControlePaginas> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                ControlePaginas cp = new ControlePaginas();
                cp.setIdControle(rs.getInt("id_controle"));
                cp.setImpressora(rs.getString("i.modelo"));
                String data = rs.getString("data");//Converter data 1991-10-05 para 05/10/1991 antes de jogar para a tabela.
                data = dataToJava(data);//Converter data 1991-10-05 para 05/10/1991 antes de jogar para a tabela.
                cp.setData(data);//Converter data 1991-10-05 para 05/10/1991 antes de jogar para a tabela.
                /*cp.setPaginaInicial(rs.getInt("pagina_inicial"));
                cp.setPaginaFinal(rs.getInt("pagina_final"));*/
                cp.setPaginaTotal(rs.getInt("pagina_total"));
                lista.add(cp);
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }
    
        public String dataToSql(String data){
        
        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6,10);
        
        data = ano + "-" + mes + "-" + dia;
        
        return data;
    }
    
    public String dataToJava(String data){
        // 2019-11-05
        String ano = data.substring(0,4);
        String mes = data.substring(5,7);
        String dia = data.substring(8,10);
        
        data = dia + "/" + mes + "/" + ano;
        
        return data;
    }
}
