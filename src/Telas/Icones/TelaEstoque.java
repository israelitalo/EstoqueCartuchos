/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.CartuchoDao;
import Dao.UsuarioDao;
import controller.Cartucho;
import controller.CartuchoTableModel;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Israel
 */
public class TelaEstoque extends javax.swing.JDialog {

    /**
     * Creates new form TelaEstoque
     */
    
    public TelaEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarCartuchos();
        receberUsuarioLogado();
        //CartuchoTableModel modelCartucho = new CartuchoTableModel();
        //tabelaCartuchos.setModel(modelCartucho);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCartuchos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAdd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelVoltar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelEdit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelRemove = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMovEstoque = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelImprimir = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuAtualizar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de estoque");
        setPreferredSize(new java.awt.Dimension(900, 700));

        tabelaCartuchos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        tabelaCartuchos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaCartuchos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "TIPO", "MODELO", "IMPRESSORA", "COR", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCartuchos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaCartuchos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCartuchosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCartuchos);

        jLabel1.setText("Adicionar Cartucho");

        jLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/add.png"))); // NOI18N
        jLabelAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddMouseClicked(evt);
            }
        });

        jLabel3.setText("Voltar");

        jLabelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/Logout_37127.png"))); // NOI18N
        jLabelVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseClicked(evt);
            }
        });

        jLabel4.setText("Editar Cartucho");

        jLabelEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/1486504369-change-edit-options-pencil-settings-tools-write_81307.png"))); // NOI18N
        jLabelEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditMouseClicked(evt);
            }
        });

        jLabel6.setText("Remover Cartucho");

        jLabelRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/iconfinder-trash-4341321_120557_Remover.png"))); // NOI18N
        jLabelRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRemoveMouseClicked(evt);
            }
        });

        jLabel2.setText("Movimentar Estoque");

        jLabelMovEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/clipboardplan_117816_MudancaEstoque.png"))); // NOI18N
        jLabelMovEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMovEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMovEstoqueMouseClicked(evt);
            }
        });

        jLabel10.setText("Imprimir");

        jLabelImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/Printer_35183.png"))); // NOI18N
        jLabelImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImprimirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelAdd)
                        .addGap(105, 105, 105)
                        .addComponent(jLabelEdit)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabelRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMovEstoque)
                        .addGap(100, 100, 100)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelImprimir)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVoltar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAdd)
                    .addComponent(jLabelEdit)
                    .addComponent(jLabelVoltar)
                    .addComponent(jLabelRemove)
                    .addComponent(jLabelMovEstoque)
                    .addComponent(jLabelImprimir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jMenu1.setText("Arquivos");

        jMenuItem1.setText("Adicionar Cartucho");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Editar Cartucho");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenuAtualizar.setText("Atualizar Página");
        jMenuAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAtualizarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAtualizar);

        setJMenuBar(jMenuBar1);

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
    
    public void receberUsuarioLogado(){
        UsuarioDao ud = new UsuarioDao();
        String usuario = ud.getUsuarioLogado();
        int idUsuarioLogado = ud.getIdUsuarioLogado(usuario);
        String adm = ud.verSeUsuarioEadm(idUsuarioLogado);
        
        if(adm.equals("nao")){
            jLabelAdd.setEnabled(false);   
            jLabelEdit.setEnabled(false);
            jLabelRemove.setEnabled(false);   
            jLabelMovEstoque.setEnabled(false);
            jLabelImprimir.setEnabled(false);
            jMenuItem1.setEnabled(false);
            jMenuItem2.setEnabled(false);
        } 
    }
    
    public void listarCartuchos (){
        
        CartuchoDao cd = new CartuchoDao();
        
        List<Cartucho> listarCartucho = cd.selectCartucho();
           
        DefaultTableModel modelo = (DefaultTableModel) tabelaCartuchos.getModel();
        
        modelo.setNumRows(0);
        
        for (Cartucho c : cd.selectCartucho()) {

            modelo.addRow(new Object[]{
                c.getIdCartucho(),
                c.getTipo(),
                c.getModelo(),
                c.getModeloImpressora(),
                c.getCor(),
                c.getQuantidade()
            });

        }
        
        //Definindo a largura das colunas da tabela tabelaCartuchos.
        tabelaCartuchos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaCartuchos.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaCartuchos.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabelaCartuchos.getColumnModel().getColumn(3).setPreferredWidth(300);
        tabelaCartuchos.getColumnModel().getColumn(4).setPreferredWidth(0);
        tabelaCartuchos.getColumnModel().getColumn(5).setPreferredWidth(0);
    }
    
    private void jLabelVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_jLabelVoltarMouseClicked

    private void jLabelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddMouseClicked
        if(jLabelAdd.isEnabled()){
            AdicionarCartuchoJdialog addCartucho = new AdicionarCartuchoJdialog(null, rootPaneCheckingEnabled);
            addCartucho.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem permissão de administrador.");
        }
    }//GEN-LAST:event_jLabelAddMouseClicked

    private void tabelaCartuchosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCartuchosMouseClicked
        //não utilizado.
    }//GEN-LAST:event_tabelaCartuchosMouseClicked

    private void jLabelMovEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMovEstoqueMouseClicked
        if(jLabelMovEstoque.isEnabled()){
            TelaMovimentarEstoque movimentarEstoque = new TelaMovimentarEstoque(null, rootPaneCheckingEnabled);
            movimentarEstoque.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não tem permissão de administrador.");
        }  
    }//GEN-LAST:event_jLabelMovEstoqueMouseClicked

    private void jMenuAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAtualizarMouseClicked
        listarCartuchos();
    }//GEN-LAST:event_jMenuAtualizarMouseClicked

    private void jLabelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditMouseClicked
        if(jLabelEdit.isEnabled()){
            TelaAlterarCartucho telaAlterar = new TelaAlterarCartucho(null, rootPaneCheckingEnabled);
            telaAlterar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não tem permissão de administrador.");
        }  
    }//GEN-LAST:event_jLabelEditMouseClicked

    private void jLabelRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRemoveMouseClicked
        if(jLabelRemove.isEnabled()){
            
            int linha = tabelaCartuchos.getSelectedRow();
        
            if(linha <= -1){
                JOptionPane.showMessageDialog(null, "Selecione um item na tabela abaixo para prosseguir!");
            }
            else
            {        
                String id = tabelaCartuchos.getModel().getValueAt(linha, 0).toString();

                int idInt = Integer.parseInt(id);

                Cartucho cartucho = new Cartucho();

                CartuchoDao cd = new CartuchoDao();

                int teste = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o item selecionado?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

                if(teste == JOptionPane.YES_OPTION){
                    cd.excluir(cartucho, idInt);
                    JOptionPane.showMessageDialog(null, "Operação realizada.", "Exclusão confirmada", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (teste == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Operação não realizada.", "Exclusão cancelada", JOptionPane.INFORMATION_MESSAGE);
                }
                listarCartuchos();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não tem permissão de administrador.");
        }
    }//GEN-LAST:event_jLabelRemoveMouseClicked

    private void jLabelImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImprimirMouseClicked
        
        if(jLabelImprimir.isEnabled()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                   
            Date data = new Date();
        
            MessageFormat header = new MessageFormat("Estoque de cartuchos do HJP em " + sdf.format(data) + ".");
            try {
                tabelaCartuchos.print(JTable.PrintMode.FIT_WIDTH, header, null);
            } catch (java.awt.print.PrinterException e) {
                System.err.format("Cannot print %s%n", e.getMessage());
            }   
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não tem permissão de administrador.");
        }
    }//GEN-LAST:event_jLabelImprimirMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdicionarCartuchoJdialog addCartucho = new AdicionarCartuchoJdialog(null, rootPaneCheckingEnabled);
        addCartucho.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaAlterarCartucho alterarCartucho = new TelaAlterarCartucho(null, rootPaneCheckingEnabled);
        alterarCartucho.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEstoque dialog = new TelaEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelEdit;
    private javax.swing.JLabel jLabelImprimir;
    private javax.swing.JLabel jLabelMovEstoque;
    private javax.swing.JLabel jLabelRemove;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAtualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCartuchos;
    // End of variables declaration//GEN-END:variables
}
