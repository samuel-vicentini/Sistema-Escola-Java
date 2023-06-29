/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptcSistemaEscola;

import ptcSistemaEscola.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ptcSistemaEscola.Conexao.con;

/**
 *
 * @author samue
 */
public class tNota extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form tNota
     */
    public tNota() {
        initComponents();
        Conexao.Conectar(); 
        jTable1.getColumnModel().getColumn(0).setMaxWidth(120); 
        jTable1.getColumnModel().getColumn(1).setMaxWidth(420);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(420); 
        jTable1.getColumnModel().getColumn(3).setMaxWidth(156);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(156);
        model =  (DefaultTableModel) jTable1.getModel(); 
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        CarregarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxAluno1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxAtividade2 = new javax.swing.JComboBox<>();
        cbxAluno2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        cbxAtividade1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfNota = new javax.swing.JFormattedTextField();
        tfDataE = new javax.swing.JFormattedTextField();
        lblNotaID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro das Notas das Atividades");
        setResizable(false);

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Cadastro das Notas das Atividades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Atividade:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Aluno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Data de Entrega:");

        cbxAluno1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxAluno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar, Alterar e Excluir \n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Atividade:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Aluno:");

        cbxAtividade2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxAtividade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        cbxAluno2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxAluno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGravar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                    .addComponent(cbxAtividade2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAtividade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Atividade", "Aluno", "Nota", "Data de Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(320);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(320);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(190);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(240);
        }

        btnIncluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        cbxAtividade1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxAtividade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nota:");

        tfNota.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        tfNota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            tfDataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataE.setToolTipText("");
        tfDataE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblNotaID.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        lblNotaID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfNota, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxAluno1, javax.swing.GroupLayout.Alignment.LEADING, 0, 332, Short.MAX_VALUE)
                                            .addComponent(cbxAtividade1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfDataE))
                                        .addGap(0, 0, 0)
                                        .addComponent(lblNotaID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 269, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxAtividade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNotaID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfDataE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnIncluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarregarCombo() {
        String sql;
        try
        {
            cbxAtividade1.removeAllItems();
            cbxAtividade2.removeAllItems();
            cbxAluno1.removeAllItems();
            cbxAluno2.removeAllItems();
            cbxAtividade1.addItem("Selecione...");
            cbxAtividade2.addItem("Selecione...");
            cbxAluno1.addItem("Selecione...");
            cbxAluno2.addItem("Selecione...");
                       
            sql = "select Descricao from Atividade ";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                cbxAtividade1.addItem(rs.getString("Descricao"));
                cbxAtividade2.addItem(rs.getString("Descricao"));
            }
            
            sql = "select Nome from Matricula order by Nome ASC";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next())
            {
                cbxAluno1.addItem(rs.getString("Nome"));
                cbxAluno2.addItem(rs.getString("Nome"));
            }  
                       
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao incluir os combos. "+e,"ERRO: ",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        try{
            Conexao.con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        tMenu menu = new tMenu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try
        {
            String sql;
            String atividade = "",aluno = "",nota  = "", dataEntrega = "", limpacbx = "Selecione...";
            
            sql = "select AtividadeID from Atividade where Descricao= '" + cbxAtividade1.getSelectedItem() + "'";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                atividade = rs.getString("AtividadeID");
            }
            sql = "select tabelaAluno.AlunoID from Aluno tabelaAluno inner join Matricula tabelaMatricula on tabelaMatricula.RA = tabelaAluno.RA Where  tabelaMatricula.Nome = '" + cbxAluno1.getSelectedItem() + "'";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next())
            {
                aluno = rs.getString("AlunoID");
            }
            nota = tfNota.getText();
            if (nota.contains(",")) {
                nota = nota.replace(",", ".");
            }
            double notaDecimal = Double.parseDouble(nota);
            
            String dia = tfDataE.getText().substring(0, 2);
            String mes = tfDataE.getText().substring(3, 5);
            String ano = tfDataE.getText().substring(6);
            dataEntrega = ano+"-"+mes+"-"+dia;
            
            if(atividade.equals("") || aluno.equals("") || notaDecimal == 0|| dataEntrega.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Por Favor, preencha os dados corretamente!","ERRO",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                sql="INSERT INTO Nota (AtividadeID,AlunoID,Data_Entrega,Nota) values " +
                "(" + atividade + "," + aluno + ",'" + dataEntrega + "',"+ notaDecimal +")";
                               
                stm = con.prepareStatement(sql);
                stm.execute(sql);
                cbxAtividade1.setSelectedItem(limpacbx);
                cbxAluno1.setSelectedItem(limpacbx);
                tfDataE.setText("");
                tfNota.setText("");
                CarregarCombo();
                cbxAtividade1.requestFocus();
                model.setRowCount(0);
                JOptionPane.showMessageDialog( null, "Inclusão realizada com Sucesso! ","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao incluir, tente novamente "+e,"ERRO: ",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String sql;
        String nomeAluno="",nomeAtividade = "", alunoID = "", atividadeID="";
        String limpacbx = "Selecione..."; 
        model.setRowCount(0);
        nomeAluno = cbxAluno2.getSelectedItem().toString();
        nomeAtividade = cbxAtividade2.getSelectedItem().toString();
        try
        {
            if(!nomeAluno.equals("Selecione..."))
            {
                sql = "select tabelaAluno.AlunoID from Aluno tabelaAluno inner join Matricula tabelaMatricula on  tabelaMatricula.RA = tabelaAluno.RA  where tabelaMatricula.Nome = '" + nomeAluno + "'";
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next())
                {
                    alunoID = rs.getString("AlunoID");
                }
            }
                        
            sql = "SELECT tabelaNota.*, tabelaAtividade.Descricao as NomeAtividade, tabelaAtividade.AtividadeID, tabelaAluno.AlunoID, tabelaMatricula.Nome as NomeAluno from Nota tabelaNota "
            + " left join Atividade tabelaAtividade ON tabelaAtividade.AtividadeID = tabelaNota.AtividadeID "
            + " left join Aluno tabelaAluno ON tabelaAluno.AlunoID  = tabelaNota.AlunoID "
            + " left join Matricula tabelaMatricula ON tabelaMatricula.RA = tabelaAluno.RA "       
            + " Where 1 = 1 ";
            
            
            if(!nomeAluno.equals("Selecione..."))
            {
                sql = sql + " AND tabelaAluno.AlunoID  = " + alunoID;
            }
          
            if(!nomeAtividade.equals("Selecione..."))
            {
                sql = sql + " AND tabelaAtividade.Descricao  = '" + nomeAtividade+"'";
            }
            sql = sql + " order by tabelaNota.Nota";
            
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            rs.first();
            rs.getRow();
            if(rs.getRow() > 0){
                String[] linha = new String[]{rs.getString("NotaID"),rs.getString("NomeAtividade"),rs.getString("NomeAluno"),rs.getString("Nota"),
                rs.getString("Data_Entrega")};
                model.addRow(linha);
                while(rs.next())
                {
                    linha = new String[]{rs.getString("NotaID"),rs.getString("NomeAtividade"),rs.getString("NomeAluno"),rs.getString("Nota"),
                rs.getString("Data_Entrega")};
                    model.addRow(linha);
                }
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                cbxAtividade2.setSelectedItem(limpacbx);
                cbxAluno2.setSelectedItem(limpacbx);
              
            }
            else
            {
                JOptionPane.showMessageDialog( null, "Não existe nenhum aluno com essas características","Erro",JOptionPane.INFORMATION_MESSAGE);
                cbxAtividade2.setSelectedItem(limpacbx);
                cbxAluno2.setSelectedItem(limpacbx);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar, tente novamente "+e,"ERRO:",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String atividade, aluno, dataEntrega, nota;
        int linha = jTable1.getSelectedRow();
        if (linha==-1)
        {
            JOptionPane.showMessageDialog(null,"Você deve selecionar uma linha.");
        }
        else{
            lblNotaID.setText((String) jTable1.getValueAt(linha, 0));
            atividade = ((String) jTable1.getValueAt(linha, 1));
            cbxAtividade1.setSelectedItem(atividade);
            aluno = ((String) jTable1.getValueAt(linha, 2));
            cbxAluno1.setSelectedItem(aluno);
            nota = ((String) jTable1.getValueAt(linha, 3));
            if (nota.contains(".")) {
                nota = nota.replace(".", ",");
            }
            tfNota.setText(nota);
            dataEntrega = (String) jTable1.getValueAt(linha, 4);
            String dia = dataEntrega.substring(8, 10);
            String mes = dataEntrega.substring(5, 7);
            String ano = dataEntrega.substring(0,4);
            dataEntrega = dia+mes+ano;
            tfDataE.setText(dataEntrega);
            cbxAtividade1.requestFocus();
            btnGravar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnConsultar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try
        {
            String sql;
            String atividade = "",aluno = "",nota  = "", dataEntrega = "", limpacbx = "Selecione...";
            
            sql = "select AtividadeID from Atividade where Descricao= '" + cbxAtividade1.getSelectedItem() + "'";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                atividade = rs.getString("AtividadeID");
            }
            sql = "select tabelaAluno.AlunoID from Aluno tabelaAluno inner join Matricula tabelaMatricula on  tabelaMatricula.RA = tabelaAluno.RA Where tabelaMatricula.Nome = '" + cbxAluno1.getSelectedItem() + "'";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next())
            {
                aluno = rs.getString("AlunoID");
            }
            nota = tfNota.getText();
            if (nota.contains(",")) {
                nota = nota.replace(",", ".");
            }
            float notaDecimal = Float.parseFloat(nota);
            System.out.println(notaDecimal);
            
            String dia = tfDataE.getText().substring(0, 2);
            String mes = tfDataE.getText().substring(3, 5);
            String ano = tfDataE.getText().substring(6);
            dataEntrega = ano+"-"+mes+"-"+dia;
            
            if(atividade.equals("") || aluno.equals("") || notaDecimal == 0 || dataEntrega.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Por Favor, preencha os dados corretamente!","ERRO",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                sql="UPDATE Nota set AtividadeID = '" +atividade+"',AlunoID = "+aluno+",Data_Entrega = '"+dataEntrega+"',Nota = "+notaDecimal+""
                + " where NotaID = "+lblNotaID.getText(); 
                
                
                stm = con.prepareStatement(sql);
                stm.execute(sql);
                cbxAtividade1.setSelectedItem(limpacbx);
                cbxAluno1.setSelectedItem(limpacbx);
                tfDataE.setText("");
                tfNota.setText("");
                CarregarCombo();
                cbxAtividade1.requestFocus();
                model.setRowCount(0);
                btnIncluir.setEnabled(true);
                btnConsultar.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnGravar.setEnabled(false);
                JOptionPane.showMessageDialog( null, "Alteração realizada com Sucesso! ","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao alterar, tente novamente "+e,"ERRO: ",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = jTable1.getSelectedRow();
        if (linha==-1)
        {
            JOptionPane.showMessageDialog(null,"Você deve selecionar uma linha.");
        }
        else
        {
            int opcao = JOptionPane.showConfirmDialog(null,"Confirma exclusão","Excluindo...", JOptionPane.YES_NO_OPTION);
            String sql, codigo;
            codigo = (String) jTable1.getValueAt(linha, 0);
            if (opcao==0)
            {
                try
                {
                    sql="delete from Nota where NotaID= " + codigo;
                    Statement stm = con.prepareStatement(sql);
                    stm.execute(sql);
                    btnIncluir.setEnabled(true);
                    btnConsultar.setEnabled(true);
                    btnAlterar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    cbxAtividade1.requestFocus();
                    CarregarCombo();
                    JOptionPane.showMessageDialog(null, "Exclusão feita com Sucesso! ","Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir, tente novamente " +e,"ERRO: ",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                cbxAtividade1.requestFocus();
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
            model.setRowCount(0);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(tNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxAluno1;
    private javax.swing.JComboBox<String> cbxAluno2;
    private javax.swing.JComboBox<String> cbxAtividade1;
    private javax.swing.JComboBox<String> cbxAtividade2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNotaID;
    private javax.swing.JFormattedTextField tfDataE;
    private javax.swing.JFormattedTextField tfNota;
    // End of variables declaration//GEN-END:variables
}
