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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    //Retornar todas as impressoras num vetor String[].
    public void todasImpressoras(String[] vetorImpressora){
        String sql = "SELECT i.modelo FROM impressora i ORDER BY i.modelo";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            int i = 0;
            while(rs.next()){
                String impressora = rs.getString("modelo");
                vetorImpressora[i] = impressora;
                i++;
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
    }
    
    public void carregarComboBoxImpressora(JComboBox comboBox){
        
        String sql = "SELECT modelo FROM impressora ORDER BY modelo";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String modelo = rs.getString("modelo");
                comboBox.addItem(modelo);
            }
            //ConexaoJdbc.closeConnection(con, stmt);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Ocorreu erro ao carregar a Combo Box", "Erro",
                JOptionPane.ERROR_MESSAGE);
            }
        
    }
    
    public String getLastDateOfImpressora(Integer idImpressora){
        
        String sql = "SELECT data FROM controlepaginas WHERE id_impressora = '" + idImpressora + "' ORDER BY data DESC LIMIT 1";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareCall(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                String ultimaData = rs.getString("data");
                
                if(ultimaData != null){
                    ultimaData = dataToJava(ultimaData);
                    return ultimaData;
                }
                else
                {
                    String semRegistro = "Não há registros.";
                    return semRegistro;
                }    
                
            }
            //ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String semRegistro = "Não há registros.";
        return semRegistro;
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
            //ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            System.err.println("Erro:" + ex);;
        }
        return null;
    }
    
    public Integer getQtdPaginas(Integer idImpressora, String data){
        
        String sql = "SELECT pagina_total FROM controlepaginas WHERE id_impressora = '" + idImpressora + "' AND data = '" + data + "' ORDER BY pagina_total DESC LIMIT 1";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                int paginaTotal = rs.getInt("pagina_total");
                return paginaTotal;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int paginaTotal = 0;
        return paginaTotal;
    }
    
    public boolean salvar(ControlePaginas cp){
        
        String sql = "INSERT INTO controlepaginas (id_impressora, data, pagina_total) VALUES (?, ?, ?)";// novo select
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
    
    public boolean alterar(Integer idControle, ControlePaginas controle){
        String sql = "UPDATE controlepaginas SET id_impressora=?, data=?, pagina_total=? WHERE id_controle = '" + idControle + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, controle.getIdImpressora());
            stmt.setString(2, controle.getData());
            stmt.setInt(3, controle.getPaginaFinal());
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean excluir(Integer idControle){
        String sql = "DELETE FROM controlepaginas WHERE id_controle = '" + idControle + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Método para salvar itens na tabela recebervetores, quando o botao radio Buscar Todos, na tela TelaControlPaginasRel, estiver selecionado.
    public boolean salvarRelatorioVetores(ControlePaginas cp){
        
        String sql = "INSERT INTO recebervetores (impressora, setor, datarelatorio, soma) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cp.getImpressora());
            stmt.setString(2, cp.getSetor());
            stmt.setString(3, cp.getData());
            stmt.setInt(4, cp.getSoma());
            stmt.executeUpdate();
            //ConexaoJdbc.closeConnection(con, stmt);
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }
    }
    
    //Método para listar itens da tabela recebervetores, na tabela da tela TelaControlPaginasRel, quando o botão radio Buscar Todos estiver selecionado.
    public List<ControlePaginas> listarRelatorioVetores(){
        String sql = "SELECT * FROM recebervetores ORDER BY impressora";
        
        List<ControlePaginas> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                ControlePaginas cp = new ControlePaginas();
                cp.setIdReceberVetores(rs.getInt("id"));
                cp.setImpressora(rs.getString("impressora"));
                cp.setSetor(rs.getString("setor"));
                String data = dataToJava(rs.getString("datarelatorio"));
                cp.setData(data);
                cp.setSoma(rs.getInt("soma"));
                lista.add(cp);
            }
            
            return lista;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        return null;
    }
        //teste
        public void zerarIdTabelaReceberVetores(){
            String sql = "ALTER TABLE recebervetores AUTO_INCREMENT = 0 ";
            PreparedStatement stmt = null;
            try{
                stmt = con.prepareStatement(sql);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
    
        public void deletarRelatorioVetores(){
        String sql = "DELETE FROM recebervetores";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            //ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para inserir itens à tabela relatorioperiodo, quando o botão radio Buscar Todos, na tela TelaControlPaginasRel estiver desmarcado e o usuário clicar no botão Adc. Impressora ao Relatório.
    public boolean relatorioFinal(ControlePaginas cp){
        
        String sql = "INSERT INTO relatorioperiodo (impressora, data_inicial, data_final, pagina_total) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cp.getImpressora());
            stmt.setString(2, cp.getDataInicial());
            stmt.setString(3, cp.getDataFinal());
            stmt.setInt(4, cp.getPaginaTotal());
            
            stmt.executeUpdate();
            
            ConexaoJdbc.closeConnection(con, stmt);
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }
    }
    
    //Método para lançar a tabela controlepaginas à tabela da TelaControlePaginas.
    public List<ControlePaginas> listarControlePaginas(Integer idImpressora){
        
        String sql = "SELECT c.id_controle, i.modelo, c.data, c.pagina_total FROM controlepaginas c, impressora i WHERE c.id_impressora = '" + idImpressora +  "' and i.id_impressora = '" + idImpressora + "'";
        
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
                    String data = dataToJava(rs.getString("data"));
                cp.setData(data);
                cp.setPaginaTotal(rs.getInt("pagina_total"));
                lista.add(cp);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Método usado na tela que contém a tabela dos dados da tabela relatorioperiodo.
    public List<ControlePaginas> listarRelatorioFinal(){
        String sql = "SELECT * FROM relatorioperiodo";
        
        List<ControlePaginas> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                ControlePaginas cp = new ControlePaginas();
                cp.setIdControle(rs.getInt("id_controle"));
                cp.setImpressora(rs.getString("impressora"));
                    String dataInicial = dataToJava(rs.getString("data_inicial"));
                    String dataFinal = dataToJava(rs.getString("data_final"));
                cp.setDataInicial(dataInicial);
                cp.setDataFinal(dataFinal);
                cp.setPaginaTotal(rs.getInt("pagina_total"));
                lista.add(cp);
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }
    }
    
    public void deletarRelatorioFinal(){
        String sql = "DELETE FROM relatorioperiodo";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            ConexaoJdbc.closeConnection(con, stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaginasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ControlePaginas> listar(Integer idImpressora, String dataInicial, String dataFinal){
        //teste tentando inserir o setor nessa tabela.
        String sql = "SELECT c.id_controle, i.modelo, s.setor, c.data, c.pagina_total FROM controlepaginas c, impressora i, setor s WHERE s.id_setor = i.id_setor AND c.id_impressora = '" + idImpressora + "' AND c.id_impressora = i.id_impressora AND data >= '" + dataInicial + "' AND data <= '" + dataFinal + "' ORDER BY data"; // novo select.

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
                cp.setSetor(rs.getString("s.setor"));
                String data = rs.getString("data");//Converter data 1991-10-05 para 05/10/1991 antes de jogar para a tabela.
                data = dataToJava(data);//Converter data 1991-10-05 para 05/10/1991 antes de jogar para a tabela.
                cp.setData(data);//Converter data 1991-10-05 para 05/10/1991 antes de jogar para a tabela.
                cp.setPaginaTotal(rs.getInt("pagina_total"));
                lista.add(cp);
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }
    
    //teste para o relatório final.Relatório de páginas impressas por período.
    public List<ControlePaginas> listarSoma(Integer idImpressora, String dataInicial, String dataFinal){
        
        String sql = "SELECT c.id_controle, i.modelo, c.data, c.pagina_total FROM controlepaginas c, impressora i WHERE c.id_impressora = '" + idImpressora + "' AND c.id_impressora = i.id_impressora AND data >= '" + dataInicial + "' AND data <= '" + dataFinal + "' ORDER BY data"; // novo select.

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
                cp.setPaginaTotal(rs.getInt("pagina_total"));
                lista.add(cp);
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }
    
    public Integer getIdSetor(String impressora){
        String sql = "SELECT i.id_setor FROM impressora i WHERE i.modelo = '" + impressora + "'";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Integer idSetor = rs.getInt("i.id_setor");
                return idSetor;
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
        return null;
    }
    
    public String getSetor(Integer idSetor){
        String sql = "SELECT s.setor FROM setor s WHERE s.id_setor = '" + idSetor + "'";
        
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
            System.err.println("Erro: " + ex);
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
