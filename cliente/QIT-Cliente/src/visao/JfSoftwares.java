/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleMaquina;
import controle.ControleSala;
import controle.ControleSoftware;
import controle.ITela;
import controle.ProxyTelas;
import dao.MaquinaDAO;
import javax.swing.JOptionPane;
import modelo.Maquina;
import modelo.Sala;
import modelo.Software;
import modelo.Tela;
import modelo.Usuario;

/**
 *
 * @author Tiago
 */
public class JfSoftwares extends javax.swing.JFrame implements ITela {

    protected Usuario usuario;
    protected Tela tela;
    protected Maquina maquina;
    protected ProxyTelas proxy;
    protected ControleMaquina controleMaquina;
    protected ControleSoftware controleSoftware;

    public JfSoftwares(Usuario usuario) {
        initComponents();
        this.setTitle("Maquinas e Softwares");
        this.usuario = usuario;
        this.tela = new Tela();
        controleMaquina = new ControleMaquina();
        controleSoftware = new ControleSoftware();

        maquina = new Maquina();
        tela.setId(7);
        
        jTFIdsoftware.setEditable(false);
        jTFNome.setEditable(false);
        jTFVersao.setEditable(false);
        jTFDesenvolvedor.setEditable(false);;
        jTFComandoRemocao.setEditable(false);
        jTFSitedesenvolvedore.setEditable(false);
        jTFSitesoftware.setEditable(false);
        jTFCriadomanualmente.setEditable(false);
        jTFDiretorioinstalado.setEditable(false);
        jftfNomePredio1.setEditable(false);
        

        proxy = new ProxyTelas(this, this.usuario, this.tela);
//        Verificar permissao da operacao ler
        this.ler();

        controle.Util.definePadroesJFrame(this);

        jtpMain.setEnabledAt(1, false);
        jtpMain.setEnabledAt(2, false);
        
        atualizarTabela();

    }

    private JfSoftwares() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMain = new javax.swing.JTabbedPane();
        jpSoftwares = new javax.swing.JPanel();
        btCancelar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFbuscarSoftware = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jpMaquinas = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtResultados = new javax.swing.JTable();
        btVerEditar = new javax.swing.JButton();
        jftfNomePredio1 = new javax.swing.JFormattedTextField();
        btConsultarTabela1 = new javax.swing.JButton();
        jBtPesquisar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpDetalhes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFIdsoftware = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFVersao = new javax.swing.JTextField();
        jTFDesenvolvedor = new javax.swing.JTextField();
        jTFComandoRemocao = new javax.swing.JTextField();
        jTFSitedesenvolvedore = new javax.swing.JTextField();
        jTFCriadomanualmente = new javax.swing.JTextField();
        jTFSitesoftware = new javax.swing.JTextField();
        jTFDiretorioinstalado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtpMain.setMinimumSize(new java.awt.Dimension(1000, 550));
        jtpMain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtpMainFocusGained(evt);
            }
        });

        jpSoftwares.setPreferredSize(new java.awt.Dimension(0, 0));

        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("De um clique duplo no software para visualizar detalhes");

        jLabel12.setText("Buscar Software:");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSoftwaresLayout = new javax.swing.GroupLayout(jpSoftwares);
        jpSoftwares.setLayout(jpSoftwaresLayout);
        jpSoftwaresLayout.setHorizontalGroup(
            jpSoftwaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSoftwaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSoftwaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSoftwaresLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbuscarSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jpSoftwaresLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(534, 534, 534)
                        .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSoftwaresLayout.setVerticalGroup(
            jpSoftwaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSoftwaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSoftwaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFbuscarSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpSoftwaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btCancelar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpMain.addTab("Softwares:", jpSoftwares);

        jpMaquinas.setMinimumSize(new java.awt.Dimension(995, 522));
        jpMaquinas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpMaquinasFocusGained(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jtResultados.setModel(new javax.swing.table.DefaultTableModel(
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
        jtResultados.getTableHeader().setReorderingAllowed(false);
        jtResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtResultadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtResultados);

        btVerEditar.setText("Ver Detalhes");
        btVerEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerEditarActionPerformed(evt);
            }
        });

        btConsultarTabela1.setText("Buscar");
        btConsultarTabela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarTabela1ActionPerformed(evt);
            }
        });

        jBtPesquisar.setText("Pesquisar");
        jBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Máquinas onde o software está instalado:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Buscar:");

        javax.swing.GroupLayout jpMaquinasLayout = new javax.swing.GroupLayout(jpMaquinas);
        jpMaquinas.setLayout(jpMaquinasLayout);
        jpMaquinasLayout.setHorizontalGroup(
            jpMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMaquinasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpMaquinasLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfNomePredio1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultarTabela1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpMaquinasLayout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(btVerEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jpMaquinasLayout.setVerticalGroup(
            jpMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMaquinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftfNomePredio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarTabela1)
                    .addComponent(jBtPesquisar)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVerEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jtpMain.addTab("Máquinas:", jpMaquinas);

        jLabel2.setText("Id software:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Versão:");

        jLabel5.setText("Desenvolvedor:");

        jLabel6.setText("Comando remoção:");

        jLabel8.setText("Site desenvolvedor:");

        jLabel9.setText("Site software:");

        jLabel10.setText("Criado manualmente:");

        jLabel11.setText("Diretorio instalado:");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDetalhesLayout = new javax.swing.GroupLayout(jpDetalhes);
        jpDetalhes.setLayout(jpDetalhesLayout);
        jpDetalhesLayout.setHorizontalGroup(
            jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDetalhesLayout.createSequentialGroup()
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDetalhesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDetalhesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDetalhesLayout.createSequentialGroup()
                                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFSitedesenvolvedore)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpDetalhesLayout.createSequentialGroup()
                                        .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFNome)
                                            .addComponent(jTFIdsoftware)
                                            .addComponent(jTFVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTFDesenvolvedor)
                                    .addComponent(jTFComandoRemocao)))
                            .addGroup(jpDetalhesLayout.createSequentialGroup()
                                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDiretorioinstalado)
                                    .addComponent(jTFCriadomanualmente)
                                    .addComponent(jTFSitesoftware))))))
                .addGap(458, 458, 458))
        );
        jpDetalhesLayout.setVerticalGroup(
            jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalhesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDetalhesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9))
                    .addGroup(jpDetalhesLayout.createSequentialGroup()
                        .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdsoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTFDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFComandoRemocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFSitedesenvolvedore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFSitesoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFCriadomanualmente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFDiretorioinstalado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jtpMain.addTab("Detalhes:", jpDetalhes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btCancelar1ActionPerformed(evt);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jtResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtResultadosMouseClicked
        if (evt.getClickCount() > 1) {
            try {
//            limparCampos();

                if (jtResultados.getSelectedRowCount() != 0) {

                    int id = (int) jtResultados.getValueAt(jtResultados.getSelectedRow(), 0);

                    maquina.setId(id);
                    maquina = controleMaquina.consultar(maquina);

                    popularCampos();
                    jtpMain.setSelectedIndex(1);

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um registro da tabela");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas ao selecionar!\nMensagem técnica:\n" + e);

            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_jtResultadosMouseClicked

    private void btVerEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerEditarActionPerformed

        try {
//            limparCampos();

            if (jtResultados.getSelectedRowCount() != 0) {

                int id = (int) jtResultados.getValueAt(jtResultados.getSelectedRow(), 0);

                maquina.setId(id);
                maquina = controleMaquina.consultar(maquina);

                popularCampos();
                jtpMain.setSelectedIndex(1);

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um registro da tabela");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao selecionar!\nMensagem técnica:\n" + e);

        }
    }//GEN-LAST:event_btVerEditarActionPerformed

    private void jtpMainFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtpMainFocusGained
//        Predio p = new Predio();
//        p.setNome(qftfConsultaNome.getText());
//        controlePredio.popularTabela(jtResultados, p, false);

    }//GEN-LAST:event_jtpMainFocusGained

    private void btConsultarTabela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarTabela1ActionPerformed
        try {
            Sala predioPModal = new Sala();
            ControleSala cPPModal = new ControleSala();
            new JdlgGenerico(this, cPPModal, predioPModal, 2).setVisible(true);
        } catch (Exception e) {
            System.err.println("Erro em btBuscarPredioActionPerformed " + e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarTabela1ActionPerformed

    private void jBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jBtPesquisarActionPerformed

    private void jpMaquinasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpMaquinasFocusGained
        atualizarTabela();
    }//GEN-LAST:event_jpMaquinasFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jtpMain.setSelectedIndex(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        controleSoftware.popularTabelaSoftware(jTable1, maquina, jTFbuscarSoftware.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() > 1) {
            String idsoftware = (String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)));
            int id = Integer.parseInt(idsoftware);
            Software sd = new Software();
            sd.setId(id);
            Software s = controleSoftware.ConsultarSoftware(sd);
            jtpMain.setSelectedIndex(2);

            jTFIdsoftware.setText("" + s.getId());
            jTFNome.setText(s.getNome());
            jTFVersao.setText(s.getVersao());
            jTFDesenvolvedor.setText(s.getDesenvolvedor());
            jTFComandoRemocao.setText(s.getComandoDesinstalacao());
            jTFSitedesenvolvedore.setText(s.getSiteDesenvolvedor());
            jTFSitesoftware.setText(s.getSiteSoftware());
            jTFCriadomanualmente.setText("" + s.getCriadoManualmente());
            jTFDiretorioinstalado.setText(s.getDiretorioInstalacao());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Deseja cancelar esta operação?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            this.dispose();
        } else {
            System.out.println("i" + i);
        }
    }//GEN-LAST:event_btCancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JfSoftwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfSoftwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfSoftwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfSoftwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfSoftwares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btConsultarTabela1;
    private javax.swing.JButton btVerEditar;
    private javax.swing.JButton jBtPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFComandoRemocao;
    private javax.swing.JTextField jTFCriadomanualmente;
    private javax.swing.JTextField jTFDesenvolvedor;
    private javax.swing.JTextField jTFDiretorioinstalado;
    private javax.swing.JTextField jTFIdsoftware;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFSitedesenvolvedore;
    private javax.swing.JTextField jTFSitesoftware;
    private javax.swing.JTextField jTFVersao;
    private javax.swing.JTextField jTFbuscarSoftware;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jftfNomePredio1;
    private javax.swing.JPanel jpDetalhes;
    private javax.swing.JPanel jpMaquinas;
    private javax.swing.JPanel jpSoftwares;
    private javax.swing.JTable jtResultados;
    private javax.swing.JTabbedPane jtpMain;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela() {
        Maquina m = new Maquina();
        Sala s = new Sala();
        int idsala = 0;
        try {
//            idsala = Integer.parseInt(qftfIdSala.getText());
        } catch (Exception e) {
        }

        s.setId(idsala);
        m.setSala(s);
        controleMaquina.popularTabelaMaquina(jtResultados, m);

    }

    @Override
    public boolean inserir() {
        boolean permissaoUser = proxy.inserir();

        System.out.println("Permisssao desse cara: " + permissaoUser);
        if (permissaoUser) {
            boolean retorno = false;// controlePredio.salvar(predio);
            if (retorno) {
                JOptionPane.showMessageDialog(rootPane, "Operação Realizada com sucesso");
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para realizar essa operação");
        }
        return true;

    }

    @Override
    public boolean ler() {
        boolean permissaoUser = proxy.ler();

        System.out.println("Permisssao desse cara: " + permissaoUser);
        if (permissaoUser) {
            this.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar esta tela");
            this.dispose();
        }
        return true;
    }

    @Override
    public boolean editar() {
        boolean permissaoUser = proxy.editar();

        System.out.println("Permisssao desse cara: " + permissaoUser);
        if (permissaoUser) {
            boolean retorno = new MaquinaDAO().salvar(maquina);
            if (retorno) {
                JOptionPane.showMessageDialog(rootPane, "Operação Realizada com sucesso");
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para realizar essa operação");
        }
        return true;
    }

    @Override
    public boolean inativar() {
        boolean permissaoUser = proxy.inativar();
        System.out.println("Permisssao para ler: " + permissaoUser);

        if (permissaoUser) {
            int id = 0;
            try {
                id = ((int) jtResultados.getValueAt(jtResultados.getSelectedRow(), 0));
                boolean retorno = true; //controlePredio.inativar(id);
                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Operação Realizada com sucesso");
                    //    btConsultarTabelaActionPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
                }
            } catch (Exception e) {
                System.err.println("erro ao alterar status " + e.getLocalizedMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para realizar essa operação");
        }
        return true;
    }

    @Override
    public void limparCampos() {

        new controle.Formatacao().limparCampos(jpSoftwares);

    }

    @Override
    public void popularCampos() {
        try {
//            JtfMaquina.setText(jTable1.getRowCount() + " softwares instalados na maquina " + maquina.getId() + " "+ maquina.getHost());
            controleSoftware.popularTabelaSoftware(jTable1, maquina, "");            

        } catch (Exception e) {
            System.err.println("Erro em popular campos do predio \n" + e);
        }
    }

    @Override
    public void setRelacionado1(String id, String nome) {
        try {

        } catch (Exception e) {
            System.err.println("Erro em setRelacionado1: " + e);
        }
    }

    @Override
    public void setRelacionado2(String id, String nome) {
        try {
//            qftfIdSala.setText(id);
            jftfNomePredio1.setText(nome);

        } catch (Exception e) {
            System.err.println("Erro em setRelacionado1: " + e);
        }
    }

    @Override
    public void setRelacionado3(String id, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRelacionado4(String id, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
