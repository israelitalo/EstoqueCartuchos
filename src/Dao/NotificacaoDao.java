/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import controller.Notificacao;
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
 * @author israe
 */
public class NotificacaoDao {
    
    private Connection con = null;

    public NotificacaoDao() {
        con = ConexaoJdbc.getConnection();
        System.out.println("NotificacaoDao conectada!");
    }
    
    public boolean cadastrar(Notificacao notificacao){
        
        String sql = "INSERT INTO notificacao (id_usuario, tipo_notificacao, descricao) VALUES (?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, notificacao.getIdUsuario());
            stmt.setString(2, notificacao.getTipoNotificacao());
            stmt.setString(3, notificacao.getDescricao());
            stmt.executeUpdate();
            ConexaoJdbc.closeConnection(con, stmt);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public List<Notificacao> listarNotificacoes(){
        
        String sql = " SELECT n.id_notificacao, u.login, n.tipo_notificacao, n.descricao FROM notificacao n, usuario u WHERE u.id_usuario = n.id_usuario ";
        
        List<Notificacao> lista = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Notificacao ntf = new Notificacao();
                ntf.setIdNotificacao(rs.getInt("n.id_notificacao"));
                ntf.setUsuario(rs.getString("u.login"));
                ntf.setTipoNotificacao(rs.getString("n.tipo_notificacao"));
                ntf.setDescricao(rs.getString("n.descricao"));
                lista.add(ntf);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Saber o count da tabela notificacao. Nao pode haver espeço entre o COUNT e os parenteses.
    public String countNotificacao(){
        
        String sql = "SELECT COUNT(id_notificacao) FROM notificacao";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            rs.next();
            String count = rs.getString(1);
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean excluir(Integer idNotificacao){
        String sql = "DELETE FROM notificacao WHERE id_notificacao = '" + idNotificacao + "'";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
