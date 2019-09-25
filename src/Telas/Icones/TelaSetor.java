/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.SetorDao;
import controller.Setor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class TelaSetor extends javax.swing.JDialog {

    /**
     * Creates new form TelaSetor
     */
    public TelaSetor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarSetor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSetor = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(958, 745));

        jPanel1.setPreferredSize(new java.awt.Dimension(958, 745));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "SETOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("Clique com o botão Direito para desmarcar uma linha selecionada");
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Cadastrar");
        btnSalvar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setPreferredSize(new java.awt.Dimension(90, 30));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("Remover");
        btnExcluir.setPreferredSize(new java.awt.Dimension(90, 30));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Setor:");

        txtSetor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 469, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = getLinhaTable();
        if(linha > -1){
            int idSetor = Integer.parseInt(getValorLinhaTable(linha, 0));
            String nomeSetorTabela = getValorLinhaTable(linha, 1);
            String setorTxt = txtSetor.getText().toUpperCase();
            if(!nomeSetorTabela.equals(setorTxt)){//verificação para poder liberar a alteração.
                Setor setor = new Setor();
                setor.setSetor(txtSetor.getText().toUpperCase());
                SetorDao std = new SetorDao();
                boolean alterar = std.alterar(setor, idSetor);
                if(alterar == true){
                    std.alterar(setor, idSetor);
                    listarSetor();
                    limparCampos();
                    JOptionPane.showMessageDialog(null, "Setor alterado com sucesso.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro ao alterar setor.");
                    limparCampos();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite um setor diferente para poder alterar um já existente.");
                txtSetor.requestFocus();
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Setor setor = new Setor();
        SetorDao std = new SetorDao();
        String nomeSetor = txtSetor.getText().toUpperCase();
        boolean setorNaoCadastrado = std.verSeSetorCadastrado(nomeSetor);
        if(!nomeSetor.equals("")){
            if(setorNaoCadastrado == true){
                setor.setSetor(nomeSetor);
                if(std.salvar(setor) == true){
                    JOptionPane.showMessageDialog(null, "Setor cadastrado com sucesso!");
                    listarSetor();
                    limparCampos();
                    txtSetor.requestFocus();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro: setor não cadastrado.");
                    txtSetor.requestFocus();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Setor já cadastrado!");
                limparCampos();
                txtSetor.requestFocus();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha o campo setor.");
            txtSetor.requestFocus();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if(evt.getClickCount() == 2){
            int linha = getLinhaTable();
            if(linha > -1){
                btnSalvar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                String setor = getValorLinhaTable(linha, 1);
                txtSetor.setText(setor);
                txtSetor.requestFocus();
            }
        }
        else if(evt.getButton() == 3){
            tabela.getSelectionModel().clearSelection();
            btnSalvar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            limparCampos();
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = getLinhaTable();
        if(linha > -1){
            int idSetor = Integer.parseInt(getValorLinhaTable(linha, 0));
            String setorTabela = getValorLinhaTable(linha, 1);
            String nomeSetor = txtSetor.getText();
            if(setorTabela.equals(nomeSetor)){
                SetorDao std = new SetorDao();
                boolean excluir = std.excluir(idSetor);
                if(excluir == true){
                    JOptionPane.showMessageDialog(null, "Setor excluído com sucesso.");
                    listarSetor();
                    limparCampos();
                    btnSalvar.setEnabled(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro ao excluir setor.");
                    txtSetor.requestFocus();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "O campo setor e o setor da tabela devem estar iguais \n para realizar a exclusão.");
                limparCampos();
                txtSetor.requestFocus();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void listarSetor(){
        SetorDao std = new SetorDao();
        List<Setor>lista = std.listaSetor();
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        model.setNumRows(0);
        
        for(Setor setor: std.listaSetor()){
            model.addRow(new Object[]{
                setor.getIdSetor(),
                setor.getSetor()
            });
        }
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    public Integer getLinhaTable(){
        int linha = tabela.getSelectedRow();
        return linha;
    }
    
    public String getValorLinhaTable(int linha, int coluna){
        String valorLinhaTable = tabela.getModel().getValueAt(linha, coluna).toString();
        return valorLinhaTable;
    }
    
    public void limparCampos(){
        txtSetor.setText("");
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
            java.util.logging.Logger.getLogger(TelaSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaSetor dialog = new TelaSetor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtSetor;
    // End of variables declaration//GEN-END:variables
}
