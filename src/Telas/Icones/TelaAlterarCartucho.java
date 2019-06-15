/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.CartuchoDao;
import controller.Cartucho;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HJP_TI-CPD2
 */
public class TelaAlterarCartucho extends javax.swing.JDialog {

    /**
     * Creates new form TelaAlterarCartucho
     */
    public TelaAlterarCartucho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarCartuchos();
        //notificarUsuario();
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipoCartucho = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtImpressora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAlterarCartucho = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar cartucho");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setText("Tipo do cartucho:");

        jComboBoxTipoCartucho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Toner", "Cartucho", "Tinta" }));

        jLabel2.setText("Impressora:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Cor:");

        btnAlterar.setText("Editar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tabelaAlterarCartucho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "TIPO", "MODELO", "IMPRESSORA", "COR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlterarCartucho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlterarCartuchoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaAlterarCartucho);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCor)
                                .addComponent(txtModelo)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxTipoCartucho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxTipoCartucho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCampos(){
        txtModelo.setText("");
        txtImpressora.setText("");
        txtCor.setText("");
        jComboBoxTipoCartucho.setSelectedItem("Toner");
    }
    
    //JOptionPane que passa 1,5 segundos na tela, antes de abrir a jenela de alterar.
    /*public void notificarUsuario(){
        
        JOptionPane notificarUsuario = new JOptionPane("Selecione um item na lista\n para alterá-lo.");//instanciando o JOptionPane
        final JDialog dialog = notificarUsuario.createDialog(null, "Notificação");//aqui uso um JDialog para manipular
                                                                    //meu JOptionPane
        dialog.setModal(true);  
        //Usando o javax.swing.Timer para poder gerar um evento em um tempo determinado
        //Veja o construtor da classe Timer para mais explicações
        Timer timer = new Timer(1500, new ActionListener() {  
            public void actionPerformed(ActionEvent ev) {  
                dialog.dispose();  //o evento(no caso fechar o meu JDialog)
            }  
        });  
        timer.start();
        dialog.setVisible(true);
        timer.stop();
    }*/
    
    private void tabelaAlterarCartuchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlterarCartuchoMouseClicked
        
        int linha = tabelaAlterarCartucho.getSelectedRow();
        
        if(linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela.");
        }
        
        //Coletando dados da linha para joga-los aos campos para o usuário alterar apenas o que desejar.
        String tipo = tabelaAlterarCartucho.getModel().getValueAt(linha, 1).toString();
        String modelo = tabelaAlterarCartucho.getModel().getValueAt(linha, 2).toString();
        String impressora = tabelaAlterarCartucho.getModel().getValueAt(linha, 3).toString();
        String cor = tabelaAlterarCartucho.getModel().getValueAt(linha, 4).toString();
        
        txtModelo.setText(modelo);
        txtImpressora.setText(impressora);
        txtCor.setText(cor);
        jComboBoxTipoCartucho.setSelectedItem(tipo);
    }//GEN-LAST:event_tabelaAlterarCartuchoMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tabelaAlterarCartucho.getSelectedRow();
        
        String id = tabelaAlterarCartucho.getModel().getValueAt(linha, 0).toString();
        
        int idInt = Integer.parseInt(id);
        
        Cartucho cartucho = new Cartucho ();
        
        cartucho.setTipo((String) jComboBoxTipoCartucho.getSelectedItem());
        cartucho.setModelo(txtModelo.getText());
        cartucho.setImpressora(txtImpressora.getText());
        cartucho.setCor(txtCor.getText());
        
        CartuchoDao cd = new CartuchoDao();
        
        if(cd.editar(cartucho, idInt) == true){
            cd.editar(cartucho, idInt);
            JOptionPane.showMessageDialog(null, "Item alterado com sucesso!");
            listarCartuchos();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação não realizada!");
            limparCampos();
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void listarCartuchos(){
        
        CartuchoDao cd = new CartuchoDao();
        
        List <Cartucho> listaCartucho = cd.selectCartuchoAlterar();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("TIPO");
        modelo.addColumn("MODELO");
        modelo.addColumn("IMPRESSORA");
        modelo.addColumn("COR");
        
        Object rowData[] = new Object[5];
        
        for(int i = 0; i<listaCartucho.size(); i++){
            
            rowData[0] = listaCartucho.get(i).getIdCartucho();
            rowData[1] = listaCartucho.get(i).getTipo();
            rowData[2] = listaCartucho.get(i).getModelo();
            rowData[3] = listaCartucho.get(i).getImpressora();
            rowData[4] = listaCartucho.get(i).getCor();
            
            modelo.addRow(rowData);
        }
        
        tabelaAlterarCartucho.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(TelaAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAlterarCartucho dialog = new TelaAlterarCartucho(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxTipoCartucho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaAlterarCartucho;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtImpressora;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
