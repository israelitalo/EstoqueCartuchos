/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.ControleUsuarioDao;
import Dao.NotificacaoDao;
import Dao.UsuarioDao;
import controller.Notificacao;
import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class TelaInserirNotificacao extends javax.swing.JDialog {

    /**
     * Creates new form TelaInserirNotificacao
     */
    public TelaInserirNotificacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTxtUsuario(getUsuarioLogado());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar notificação");
        setPreferredSize(new java.awt.Dimension(958, 745));

        jLabel1.setText("Usuário:");

        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "tipo", "cartucho", "impressora" }));

        jLabel2.setText("Tipo de notificação:");

        jScrollPane1.setViewportView(txtDescricao);

        jLabel3.setText("Descrição:");

        btnSalvar.setText("CADASTRAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnSalvar)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Notificacao ntf = new Notificacao();
        NotificacaoDao ntfd = new NotificacaoDao();
        UsuarioDao ud = new UsuarioDao();
        
        String usuario = getUsuarioLogado();
        String tipo = (String)comboBoxTipo.getSelectedItem();
        String descricao = txtDescricao.getText().toUpperCase();
        
        //verificando se tipo é diferente de tipo e se o campo descrição não está vazio.
        if(tipo != "tipo" && !descricao.equals("")){
                     
            ntf.setIdUsuario(ud.getIdUsuarioLogado(usuario));
            ntf.setTipoNotificacao(tipo);
            ntf.setDescricao(descricao);
            
            if(ntfd.cadastrar(ntf)){
                JOptionPane.showMessageDialog(null, "Solicitação cadastrada com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar solicitação.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um tipo e preencha o campo descrição!");
            txtDescricao.setText("");
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    public String getUsuarioLogado(){
        UsuarioDao ud = new UsuarioDao();
        ControleUsuarioDao cud = new ControleUsuarioDao();
        String usuarioLogado = ud.getUsuarioLogado();
        return usuarioLogado;
    }
    
    public void setTxtUsuario(String usuarioLogado){
        txtusuario.setText(usuarioLogado);
        txtusuario.disable();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInserirNotificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInserirNotificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInserirNotificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInserirNotificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInserirNotificacao dialog = new TelaInserirNotificacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}