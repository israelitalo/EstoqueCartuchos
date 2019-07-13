/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.ImpressoraDao;
import controller.Impressora;
import controller.ImpressoraTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class TelaImpressora2 extends javax.swing.JDialog {

    /**
     * Creates new form TelaImpressora2
     */
    
    private String busca;
    
    public String getBusca(){
        return this.busca;
    }
    
    public void setBusca(String busca){
        this.busca = busca;
    }
    
    
    
    private Date data = new Date();

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    ImpressoraTableModel tableModel = new ImpressoraTableModel();
    
    public TelaImpressora2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JComboBoxFabricante();
        JComboBoxSetor();
        jrbTodos.setSelected(true);
        //jTableImpressora.setModel(tableModel);//É nessa linha que os nomes das colunas são resgatadas do modelo, para a tabela.
        //listarImpressora();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableImpressora = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxFabricante = new javax.swing.JComboBox<>();
        jComboBoxSetor = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jrbTodos = new javax.swing.JRadioButton();
        RelatorioImpressoras = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 700));

        jTableImpressora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MODELO", "SERIE", "FABRICANTE", "SETOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableImpressora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableImpressoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableImpressora);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabelModelo.setText("Modelo");

        jLabel1.setText("Serie");

        jLabel2.setText("Fabricante");

        jLabel3.setText("Setor");

        jComboBoxFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fabricante" }));
        jComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteActionPerformed(evt);
            }
        });

        jComboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setor" }));
        jComboBoxSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSetorActionPerformed(evt);
            }
        });

        txtBusca.setToolTipText("Este campo tem a prioridade de busca");
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/magnifier.png"))); // NOI18N
        btnBuscar.setPreferredSize(new java.awt.Dimension(65, 41));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jrbTodos.setText("Buscar todos");
        jrbTodos.setToolTipText("Marque para consultar todas as impressoras");

        RelatorioImpressoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/relatorio.png"))); // NOI18N
        RelatorioImpressoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RelatorioImpressoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelatorioImpressorasMouseClicked(evt);
            }
        });

        jLabel4.setText("Páginas impressas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbTodos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtSerie))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(RelatorioImpressoras))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RelatorioImpressoras)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnAlterar)
                        .addComponent(btnExcluir)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ImpressoraDao impDao = new ImpressoraDao();
        
        String fabricante = jComboBoxFabricante.getSelectedItem().toString();
        
        Integer idFabricante = impDao.getIdFabricanteJcomboBox(fabricante);
        
        String setor = jComboBoxSetor.getSelectedItem().toString();
        
        Integer idSetor = impDao.getIdSetorJComboBox(setor);
        
        Impressora impressora = new Impressora();
        
        impressora.setModelo(txtModelo.getText());
        impressora.setSerie(txtSerie.getText());
        impressora.setId_fabricante(idFabricante);
        impressora.setId_setor(idSetor);

        if(txtModelo.getText().equals("") || txtSerie.getText().equals("") || jComboBoxFabricante.getSelectedItem().equals("Fabricante") || jComboBoxSetor.getSelectedItem().equals("Setor")){
            JOptionPane.showMessageDialog(null, "Operação não realizada!");
            listarImpressora();
        }
        else
        {
            if(impDao.salvar(impressora) == true){
                JOptionPane.showMessageDialog(null, "Impressora salva com sucesso!");
                listarImpressora();
            }

        }
            
        tableModel.addRow(impressora);
        
        limparCampos();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int linha = jTableImpressora.getSelectedRow();
        
        String idString = jTableImpressora.getModel().getValueAt(linha, 0).toString();
        
        int idInt = Integer.parseInt(idString);
        
        if(linha != -1){
            
            int teste = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o item selecionado?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            if(teste == JOptionPane.YES_OPTION){
                ImpressoraDao impDao = new ImpressoraDao();
                if(impDao.excluir(idInt) == true){
                impDao.excluir(idInt);
                JOptionPane.showMessageDialog(null, "Operação realizada.", "Exclusão confirmada", JOptionPane.INFORMATION_MESSAGE);
                listarImpressora();
                }
            }
            else if (teste == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Operação não realizada.", "Exclusão cancelada", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluí-lo!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed
        
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        int linha = jTableImpressora.getSelectedRow();
        
        if(linha != -1){
            
            int idImpressora = getIdLinha();
            
            Impressora impressora = new Impressora();
            ImpressoraDao impDao = new ImpressoraDao();
            
            String fabricante = (String)jComboBoxFabricante.getSelectedItem();
            String setor = (String)jComboBoxSetor.getSelectedItem();
            
            int idFabricante = impDao.getIdFabricanteJcomboBox(fabricante);
            int idSetor = impDao.getIdSetorJComboBox(setor);
            
            impressora.setModelo(txtModelo.getText());
            impressora.setSerie(txtSerie.getText());
            impressora.setId_fabricante(idFabricante);
            impressora.setId_setor(idSetor);
            
            if(impDao.editar(impressora, idImpressora) == true){
                impDao.editar(impressora, idImpressora);
                JOptionPane.showMessageDialog(null, "Impressora alterada com sucesso!");
                listarImpressora();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operação não realizada!");
                listarImpressora();
            }
            /*jTableImpressora.setValueAt(txtModelo.getText(), linha, 1);
            jTableImpressora.setValueAt(txtSerie.getText(), linha, 2);
            jTableImpressora.setValueAt(jComboBoxFabricante.getSelectedItem(), linha, 3);
            jTableImpressora.setValueAt(jComboBoxSetor.getSelectedItem(), linha, 4);*/
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione um item para alterá-lo!");
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jTableImpressoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableImpressoraMouseClicked
        int linha = jTableImpressora.getSelectedRow();
        
        txtModelo.setText(jTableImpressora.getValueAt(linha, 1).toString());
        txtSerie.setText(jTableImpressora.getValueAt(linha, 2).toString());
        jComboBoxFabricante.setSelectedItem(jTableImpressora.getValueAt(linha, 3).toString());
        jComboBoxSetor.setSelectedItem(jTableImpressora.getValueAt(linha, 4).toString());
    }//GEN-LAST:event_jTableImpressoraMouseClicked
 
    //Método para adquirir o id da impressora correspondente à linha a qual o usuário clicar.
    public Integer getIdLinha(){
        int linha = jTableImpressora.getSelectedRow();
        String idLinha = jTableImpressora.getModel().getValueAt(linha, 0).toString();
        int idLinhaInt = Integer.parseInt(idLinha);
        return idLinhaInt;
    }
    
    public void listarImpressora(){
        ImpressoraDao impDao = new ImpressoraDao();
        
        List<Impressora> listaImpressoras = impDao.selectImpressora();
        
        DefaultTableModel model = (DefaultTableModel) jTableImpressora.getModel();
        
        model.setNumRows(0);
        
        for(Impressora impressora: impDao.selectImpressora()){
            
            model.addRow(new Object[]{
                impressora.getId_impressora(),
                impressora.getModelo(),
                impressora.getSerie(),
                impressora.getFabricante(),
                impressora.getSetor()
            });
            
        jTableImpressora.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableImpressora.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTableImpressora.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableImpressora.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableImpressora.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        }
        
    }
    
    public void listarImpressoraLike(String busca){
        
        busca = this.busca;
        
        ImpressoraDao impDao = new ImpressoraDao();
        
        List<Impressora> listaImpressoras = impDao.listaImpressoraLike(busca);
        
        DefaultTableModel model = (DefaultTableModel) jTableImpressora.getModel();
        
        model.setNumRows(0);
        
        for(Impressora impressora: impDao.listaImpressoraLike(busca)){
            
            model.addRow(new Object[]{
                
                impressora.getId_impressora(),
                impressora.getModelo(),
                impressora.getSerie(),
                impressora.getFabricante(),
                impressora.getSetor()
            });
            
        jTableImpressora.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableImpressora.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTableImpressora.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableImpressora.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableImpressora.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        }
        
    }
    
    public void limparCampos(){
        txtModelo.setText("");
        txtSerie.setText("");
        jComboBoxFabricante.setSelectedItem("Fabricante");
        jComboBoxSetor.setSelectedItem("Setor");
    }
    
    private void jComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFabricanteActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        //Não conseguir desabilitar o select * from impressora, quando o jrbTodos estar como false.
        
        this.busca = this.txtBusca.getText();
        
        if(this.busca != null){
            listarImpressoraLike(busca);   
        }
        else
        {
            listarImpressora();   
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jComboBoxSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSetorActionPerformed

    private void RelatorioImpressorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelatorioImpressorasMouseClicked
        TelaControlePaginas controlePaginas = new TelaControlePaginas(null, rootPaneCheckingEnabled);
        controlePaginas.setVisible(true);
        
    }//GEN-LAST:event_RelatorioImpressorasMouseClicked

    public void JComboBoxFabricante(){
        ImpressoraDao impDao = new ImpressoraDao();
        impDao.carregarJcomboBoxFabricante(jComboBoxFabricante);
    }
    
    public void JComboBoxSetor(){
        ImpressoraDao impDao = new ImpressoraDao();
        impDao.carregarJComboBoxSetor(jComboBoxSetor);
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
            java.util.logging.Logger.getLogger(TelaImpressora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImpressora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImpressora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImpressora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaImpressora2 dialog = new TelaImpressora2(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel RelatorioImpressoras;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBoxFabricante;
    private javax.swing.JComboBox<String> jComboBoxSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableImpressora;
    private javax.swing.JRadioButton jrbTodos;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
