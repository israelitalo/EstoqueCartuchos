/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.FabricanteDao;
import controller.Fabricante;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class TelaFabricante extends javax.swing.JDialog {

    /**
     * Creates new form TelaFabricante
     */
    public TelaFabricante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //listarFabricante();
        botoesEstadoInicial();
        desativarCampos();
        btnBuscar.requestFocus(true);
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
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        radioBuscarTodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fabricantes");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "FABRICANTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("Clique duas vezes em um item na tabela para selecioná-lo");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Fabricante");

        txtFabricante.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Id Fabricante");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/Logout_37127.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/magnifier.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        radioBuscarTodos.setSelected(true);
        radioBuscarTodos.setText("Buscar Todos");
        radioBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBuscarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBuscarTodos)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(radioBuscarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void botoesEstadoInicial(){
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(false);
    }
    
    Integer idFabricante;
    boolean coletaDadosTabela = false;
    
    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
    if(evt.getClickCount() == 2){
        int linha = getLinhaTable();
        if(linha > -1){
            btnAlterar.setEnabled(true);
            //btnExcluir.setEnabled(true);
            //btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
            //btnSalvar.setEnabled(false);
            this.idFabricante = Integer.parseInt(getValorLinhaTable(linha, 0));
            String fabricante = getValorLinhaTable(linha, 1);
            txtFabricante.setText(fabricante);
            txtId.setText(idFabricante.toString());
            coletaDadosTabela=true;
        }
    }
    else if(evt.getButton() == 3){
        tabela.getSelectionModel().clearSelection();
        botoesEstadoInicial();
        limparCampos();
        desativarCampos();
        coletaDadosTabela = false;
    }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(!btnAlterar.isEnabled() && !btnExcluir.isEnabled()){
            Fabricante fabricante = new Fabricante();
            FabricanteDao fd = new FabricanteDao();
            String nomeFabricante = txtFabricante.getText().toUpperCase();
            boolean fabricanteNaoCadastrado = fd.verSeFabricanteCadastrado(nomeFabricante);
            if(!nomeFabricante.equals("")){
                if(fabricanteNaoCadastrado == true){
                    fabricante.setNome(nomeFabricante);
                    if(fd.salvar(fabricante) == true){
                        JOptionPane.showMessageDialog(null, "Fabricante cadastrado com sucesso!".toUpperCase());
                        listarFabricante();
                        limparCampos();
                        btnNovo.requestFocus(true);
                        botoesEstadoInicial();
                        desativarCampos();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro: Fabricante não cadastrado.".toUpperCase());
                        txtFabricante.requestFocus();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fabricante já cadastrado!".toUpperCase());
                    limparCampos();
                    txtFabricante.requestFocus();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Preencha o campo fabricante.".toUpperCase());
                txtFabricante.requestFocus();
            }
        }
        else if(btnAlterar.isEnabled()==true && btnExcluir.isEnabled()==false){
            int linha = getLinhaTable();
            if(linha > -1){
                int idFabricante = Integer.parseInt(getValorLinhaTable(linha, 0));
                String nomeFabricanteTabela = getValorLinhaTable(linha, 1);
                String fabricanterTxt = txtFabricante.getText().toUpperCase();
                if(!nomeFabricanteTabela.equals(fabricanterTxt)){//verificação para poder liberar a alteração.
                    Fabricante fabricante = new Fabricante();
                    fabricante.setNome(txtFabricante.getText().toUpperCase());
                    FabricanteDao fd = new FabricanteDao();
                    boolean alterar = fd.alterar(fabricante, idFabricante);
                    if(alterar == true){
                        fd.alterar(fabricante, idFabricante);
                        listarFabricante();
                        limparCampos();
                        JOptionPane.showMessageDialog(null, "Fabricante alterado com sucesso.");
                        btnSalvar.setEnabled(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao alterar fabricante.");
                        limparCampos();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite um fabricante diferente para poder alterar um já existente.");
                    txtFabricante.requestFocus();
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Clique no botão novo e tente novamente.".toUpperCase());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = getLinhaTable();
        if(linha > -1 && this.coletaDadosTabela == true){
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnSalvar.setEnabled(true);
            this.idFabricante= Integer.parseInt(getValorLinhaTable(linha, 0));
            String idFabricanteString = Integer.toString(idFabricante);
            String nomeFabricante = getValorLinhaTable(linha, 1);

            txtFabricante.setText(nomeFabricante);
            txtId.setText(idFabricanteString);
            ativarCampos();  
            txtFabricante.requestFocus(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Escolha um item da lista para alterá-lo.".toUpperCase());
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnNovo.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = getLinhaTable();
        if(linha > -1 && coletaDadosTabela == true){
            btnNovo.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnSalvar.setEnabled(true);
            btnCancelar.setEnabled(true);
            int idFabricante = Integer.parseInt(getValorLinhaTable(linha, 0));
            String fabricanteTabela = getValorLinhaTable(linha, 1);
            String nomeFabricante = txtFabricante.getText();
            if(fabricanteTabela.equals(nomeFabricante)){
                
                int teste = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o item selecionado?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

                if(teste == JOptionPane.YES_OPTION){
                    FabricanteDao fd = new FabricanteDao();
                    boolean excluir = fd.excluir(idFabricante);
                    if(excluir == true){
                        JOptionPane.showMessageDialog(null, "Fabricante excluído com sucesso.");
                        listarFabricante();
                        limparCampos();
                        btnSalvar.setEnabled(true);
                        botoesEstadoInicial();
                        desativarCampos();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao excluir fabricante.");
                        txtFabricante.requestFocus();
                    }
                }
                else if(teste == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operação não realizada.", "Exclusão cancelada", JOptionPane.INFORMATION_MESSAGE);
                    btnCancelar.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    btnNovo.setEnabled(true);
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                    coletaDadosTabela = false;
                    limparCampos();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "O campo de texto fabricante e o fabricante da tabela devem estar iguais \n para realizar a exclusão.");
                limparCampos();
                txtFabricante.requestFocus();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um dos itens da tabela acima para excluí-lo.".toUpperCase());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        botoesEstadoInicial();
        tabela.getSelectionModel().clearSelection();
        btnNovo.requestFocus(true);
        desativarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
        this.coletaDadosTabela = false;
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        txtFabricante.requestFocus();
        txtFabricante.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void radioBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBuscarTodosActionPerformed
        if(radioBuscarTodos.isSelected()== true){
            btnBuscar.requestFocus(true);
        }else if(radioBuscarTodos.isSelected()== false){
            txtBuscar.requestFocus(true);
        }
    }//GEN-LAST:event_radioBuscarTodosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(radioBuscarTodos.isSelected()==true){
            listarFabricante();
            txtBuscar.requestFocus(true);
        }
        else{
            String buscar = txtBuscar.getText().toUpperCase();
        
            if(!buscar.equals("")){
                listarFabricanteLike(buscar);
                txtBuscar.setText("");
                txtBuscar.requestFocus(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite um termo para pesquisa.".toUpperCase());
                txtBuscar.requestFocus(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        if(radioBuscarTodos.isSelected()== false){
            btnBuscar.requestFocus(true);
        }
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(radioBuscarTodos.isSelected()==true){
                listarFabricante();
                txtBuscar.requestFocus(true);
            }
            else{
                String buscar = txtBuscar.getText().toUpperCase();
        
                if(!buscar.equals("")){
                    listarFabricanteLike(buscar);
                    txtBuscar.setText("");
                    txtBuscar.requestFocus(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite um termo para pesquisa.".toUpperCase());
                    txtBuscar.requestFocus(true);
                }
            }
        }
    }//GEN-LAST:event_btnBuscarKeyPressed

    public void listarFabricante(){
        FabricanteDao fd = new FabricanteDao();
        List<Fabricante>lista = fd.listarFabricante();
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        model.setNumRows(0);
        
        for(Fabricante fabricante: fd.listarFabricante()){
            model.addRow(new Object[]{
                fabricante.getIdFabricante(),
                fabricante.getNome()
            });
        }
        /*btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);*/
    }
    
    public void listarFabricanteLike(String busca){
        FabricanteDao fd = new FabricanteDao();
        List<Fabricante>lista = fd.listarFabricanteLike(busca);
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        model.setNumRows(0);
        
        for(Fabricante fabricante: fd.listarFabricanteLike(busca)){
            model.addRow(new Object[]{
                fabricante.getIdFabricante(),
                fabricante.getNome()
            });
        }
    }
    
    public Integer getLinhaTable(){
        int linha = tabela.getSelectedRow();
        return linha;
    }
    
    public String getValorLinhaTable(int linha, int coluna){
        String valorLinhaTable = tabela.getModel().getValueAt(linha, coluna).toString();
        return valorLinhaTable;
    }
    
    public void ativarCampos(){
        txtFabricante.setEnabled(true);
    }
    
    public void desativarCampos(){
        txtId.setEnabled(false);
        txtFabricante.setEnabled(false);
    }
    
    public void limparCampos(){
        txtFabricante.setText("");
        txtId.setText("");
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
            java.util.logging.Logger.getLogger(TelaFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaFabricante dialog = new TelaFabricante(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBuscarTodos;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
