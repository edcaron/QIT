package visao;

import controle.ControleDependência;
import controle.ControleSamba;
import controle.ITela;
import controle.ControleScript;
import controle.ControleTipo;
import controle.ProxyTelas;
import controle.Util;
import dao.DependenciaDAO;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Dependencia;
import modelo.Script;
import modelo.Tela;
import modelo.Tipo;
import modelo.Usuario;

public class JfScript extends javax.swing.JFrame implements ITela {

    protected Usuario usuario;
    protected Tela tela;
    protected Script script;
    protected ProxyTelas proxy;
    protected ControleScript controleScript;
    protected Tipo tipo;
    protected File[] listaAdicionarArquivos;

    public JfScript(Usuario usuario) {
        initComponents();
        this.setTitle("Scripts");
        this.usuario = usuario;
        this.tela = new Tela();
        this.script = new Script();
        this.listaAdicionarArquivos = new File[0];
        tipo = new Tipo();
        tipo.setId(1);
        tela.setId(10);
        controleScript = new ControleScript();

        qftfIdTipo.setEditable(false);
        jftTipo.setEditable(false);
        jftTipo.setFocusable(false);

        qftfIdTipo.setDataType("integer");
        qftfIdTipo.setMaxLenght(100);
        qftfIdTipo.setNotNull(true);

        qftfNome.setDataType("text");
        qftfNome.setMaxLenght(100);
        qftfNome.setNotNull(true);

        proxy = new ProxyTelas(this, this.usuario, this.tela);
//        Verificar permissao da operacao ler
        this.ler();

        controle.Util.definePadroesJFrame(this);
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
        jpCadastro = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();
        qftfNome = new qitjftf.QITJFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtScript = new javax.swing.JTextArea();
        btBuscarPredio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qftfIdTipo = new qitjftf.QITJFormattedTextField();
        jftTipo = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jtNomeArquivos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtDependencias = new javax.swing.JTable();
        jpConsulta = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        qftfConsultaNome = new qitjftf.QITJFormattedTextField();
        btConsultarTabela = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtResultados = new javax.swing.JTable();
        btInativar = new javax.swing.JButton();
        btVerEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jtpMain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtpMainFocusGained(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Script:");

        jtScript.setColumns(20);
        jtScript.setRows(5);
        jScrollPane1.setViewportView(jtScript);

        btBuscarPredio.setText("Buscar");
        btBuscarPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPredioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("*Campos obrigatórios");

        qftfIdTipo.setText("1");
        qftfIdTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qftfIdTipoActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtNomeArquivos.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Arquivos:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Adicionar arquivos:");

        jtDependencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jtDependencias.getTableHeader().setReorderingAllowed(false);
        jtDependencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDependenciasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtDependencias);
        if (jtDependencias.getColumnModel().getColumnCount() > 0) {
            jtDependencias.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtDependencias.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jpCadastroLayout = new javax.swing.GroupLayout(jpCadastro);
        jpCadastro.setLayout(jpCadastroLayout);
        jpCadastroLayout.setHorizontalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpCadastroLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addComponent(jtNomeArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpCadastroLayout.createSequentialGroup()
                            .addComponent(qftfIdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jftTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btBuscarPredio))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCadastroLayout.setVerticalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscarPredio)
                    .addComponent(jLabel3)
                    .addComponent(qftfIdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNomeArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jtpMain.addTab("Cadastro", jpCadastro);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nome:");

        btConsultarTabela.setText("Buscar");
        btConsultarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarTabelaActionPerformed(evt);
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

        btInativar.setText("Ativar/Inativar selecionado");
        btInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInativarActionPerformed(evt);
            }
        });

        btVerEditar.setText("Ver/Editar selecionado");
        btVerEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qftfConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultarTabela)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultaLayout.createSequentialGroup()
                                .addComponent(btVerEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btInativar)))))
                .addContainerGap())
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qftfConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInativar)
                    .addComponent(btVerEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addContainerGap())
        );

        jtpMain.addTab("Consulta", jpConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Deseja cancelar esta operação?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            this.dispose();
        } else {
            System.out.println("i" + i);
        }
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btCancelar1ActionPerformed(evt);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jtResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtResultadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtResultadosMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (controle.Formatacao.verificarNulos(jpCadastro)) {
            boolean retornoInsercao;
            Set<Dependencia> listaDependecias = new HashSet<>();
            boolean vetorValido = false;

            script.setAtivo(true);
            script.setDtCriacao(Util.getCurrentTimestamp());
            script.setNome(qftfNome.getText());
            script.setTexto(jtScript.getText());
            script.setTipo(tipo); //
            script.setUsuario(usuario);

//          verificar  se vetor esta iniciado
            try {
                listaAdicionarArquivos[0].canExecute();
                vetorValido = true;
            } catch (Exception e) {
            }

            if (vetorValido) {
                for (File arquivo : listaAdicionarArquivos) {
                    Dependencia d = new Dependencia();
                    d.setNome(arquivo.getName());
                    d.setMd5(controle.Util.md5(arquivo));
                    d.setDiretorio("");
                    d.setScript(script);
                    listaDependecias.add(d);
                    script.setDependencias(listaDependecias);
                }
            }

            if (script.getId() == 0) {
                retornoInsercao = this.inserir();
            } else {
                retornoInsercao = this.editar();
            }

//            enviar arquivos para o samba
            System.out.println("Retorno da isnercao:" + retornoInsercao);

            boolean retorno = false;
            if (retornoInsercao == true) {
                if (vetorValido) {
                    for (File arquivo : listaAdicionarArquivos) {
                        ControleSamba cs = new ControleSamba();
                        byte[] arquivoEmBytes = cs.fileToByteArray(arquivo);

//                    salvar dependencias no samba
                        retorno = cs.save(arquivo.getName(), arquivoEmBytes, 2, script.getId());

                        //                        salvar dependencias no bd
                        if (retorno) {
                            for (Dependencia d : script.getDependencias()) {
                                retorno = new ControleDependência().salvar(d);
                            }
                        }
                    }
                } else {
                    retorno = true;
                }
                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Operação Realizada com sucesso");
                    this.limparCampos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btConsultarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarTabelaActionPerformed
        Script s = new Script();
        s.setNome(qftfConsultaNome.getText());
        controleScript.popularTabela(jtResultados, s, false);
    }//GEN-LAST:event_btConsultarTabelaActionPerformed

    private void btVerEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerEditarActionPerformed
        try {
            limparCampos();

            if (jtResultados.getSelectedRowCount() != 0) {
                int idRegistroSelecionado = (int) jtResultados.getValueAt(jtResultados.getSelectedRow(), 0);
                script.setId(idRegistroSelecionado);
                popularCampos();
                jtpMain.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um registro da tabela");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao selecionar!\nMensagem técnica:\n" + e);
            System.out.println("" + e);
        }
    }//GEN-LAST:event_btVerEditarActionPerformed

    private void btInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInativarActionPerformed
        if (jtResultados.getSelectedRowCount() != 0) { //verifica se tem 1 linha selecionada
            int i = JOptionPane.showConfirmDialog(null, "Deseja alterar o status desde registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) { //confirma se o usuario realmente quer inativar
                this.inativar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro da tabela");
        }
    }//GEN-LAST:event_btInativarActionPerformed

    private void jtpMainFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtpMainFocusGained
        Script s = new Script();
        s.setNome(qftfConsultaNome.getText());
        controleScript.popularTabela(jtResultados, s, false);
    }//GEN-LAST:event_jtpMainFocusGained

    private void btBuscarPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPredioActionPerformed
        try {
            Tipo predioPModal = new Tipo();
            ControleTipo cPPModal = new ControleTipo();
            new JdlgGenerico(this, cPPModal, predioPModal, 1).setVisible(true);
        } catch (Exception e) {
            System.err.println("Erro em btBuscarPredioActionPerformed " + e);
        }
    }//GEN-LAST:event_btBuscarPredioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileInputStream fis;
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setDialogTitle("Escolha os arquivos");
            chooser.setMultiSelectionEnabled(true);
            if (chooser.showOpenDialog(this) == JFileChooser.OPEN_DIALOG) {
                jtNomeArquivos.setText("");
                listaAdicionarArquivos = null;
                listaAdicionarArquivos = chooser.getSelectedFiles();
                for (File file : listaAdicionarArquivos) {
                    jtNomeArquivos.setText(jtNomeArquivos.getText() + file.getName() + ", ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qftfIdTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qftfIdTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qftfIdTipoActionPerformed

    private void jtDependenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDependenciasMouseClicked
        boolean retorno = false;
        if (evt.getClickCount() == 2) {
            if (jtDependencias.getSelectedRowCount() != 0) {
                int retornoMsg = JOptionPane.showConfirmDialog(rootPane, "Deseja remover este arquivo do scrip? \n Não será possível desfazer ");
                if (retornoMsg == 0) {
                    int idRemover = (int) jtDependencias.getValueAt(jtDependencias.getSelectedRow(), 0);
                    String nomeRemover = (String) jtDependencias.getValueAt(jtDependencias.getSelectedRow(), 1);
                    Dependencia d = new Dependencia();
                    d.setId(idRemover);
                    d.setNome(nomeRemover);

//                    apaga no bd
                    retorno = new DependenciaDAO().apagar(d);

//                    apaga no samba
                    retorno = new ControleSamba().delete(d.getNome(), 2, script.getId());

                    popularCampos();
                    if (retorno) {
                        JOptionPane.showMessageDialog(rootPane, "Arquivo apagado");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
                    }
                }
            }
        }
    }//GEN-LAST:event_jtDependenciasMouseClicked

    @Override
    public boolean inserir() {
        boolean permissaoUser = proxy.inserir();
        boolean retorno = false;
        System.out.println("Permisssao desse cara: " + permissaoUser);
        if (permissaoUser) {
            retorno = controleScript.salvar(script);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para realizar essa operação");
        }
        return retorno;
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
        boolean retorno = false;
        System.out.println("Permisssao desse cara: " + permissaoUser);
        if (permissaoUser) {

            retorno = controleScript.salvar(script);
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
//                boolean retorno = controleSala.inativar(id);
//                if (retorno) {
//                    JOptionPane.showMessageDialog(rootPane, "Operação Realizada com sucesso");
//                    btConsultarTabelaActionPerformed(null);
//                } else {
//                    JOptionPane.showMessageDialog(rootPane, "Não foi posssíel realizar esta operação, consulte o log de erros");
//                }
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
        this.script = new Script();
        qftfNome.setText("");
        jtScript.setText("");
        qftfIdTipo.setText("");
        jftTipo.setText("");
        listaAdicionarArquivos = null;
        DefaultTableModel dtm = (DefaultTableModel) jtDependencias.getModel();
        dtm.setNumRows(0);
        new controle.Formatacao().limparCampos(jpCadastro);
    }

    @Override
    public void popularCampos() {
        try {
            script = controleScript.consultar(script);
            qftfNome.setText(script.getNome());
            jtScript.setText(script.getTexto());
            qftfIdTipo.setText("" + script.getTipo().getId());
            jftTipo.setText("" + script.getTipo().getNome());
            popularTabela();
        } catch (Exception e) {
            System.err.println("Erro em popular campos da sala \n" + e);
            e.printStackTrace();
        }
    }

    /**
     * Metodo para alterar os atributos do relacionamento Predio, no objeto sala
     *
     * @param id do predio
     * @param nome do predio
     */
    @Override
    public void setRelacionado1(String id, String nome) {
        try {
            qftfIdTipo.setText(id);
            jftTipo.setText(nome);
            tipo.setId(Integer.parseInt(id));
            tipo.setNome(nome);
        } catch (Exception e) {
            System.err.println("Erro em setRelacionado1: " + e);
        }
    }

    @Override
    public void setRelacionado2(String id, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRelacionado3(String id, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected void popularTabela() {
        Object[][] dadosTabela = null;
        //   System.out.println("populando tabela");
        try {
            int colunasTabela = 2;

            Object[] cabecalho = new Object[colunasTabela];

            cabecalho[0] = "Código.";
            cabecalho[1] = "Nome";

            // cria matriz de acordo com n de registros da tabela
            dadosTabela = new Object[script.getDependencias().size()][colunasTabela];

            int i = 0;
            for (Dependencia obj : script.getDependencias()) {
                dadosTabela[i][0] = obj.getId();
                dadosTabela[i][1] = obj.getNome();
                i++;
            }

            // configuracoes adicionais no componente tabela
            jtDependencias.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
                @Override
                // quando retorno for FALSE, a tabela nao é editavel
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

                @Override
                public Class getColumnClass(int column) {
                    return Object.class;
                }
            });

//             permite seleção de apenas uma linha da tabela
            jtDependencias.setSelectionMode(0);
//Desabilitar arrastar e soltar
            jtDependencias.getTableHeader().setReorderingAllowed(false);

            //alinha valores da coluna de valores para a direita 
            DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

            esquerda.setHorizontalAlignment(SwingConstants.LEFT);
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            direita.setHorizontalAlignment(SwingConstants.RIGHT);

            jtDependencias.getColumnModel().getColumn(0).setCellRenderer(direita);
            jtDependencias.getColumnModel().getColumn(1).setCellRenderer(esquerda);
            jtDependencias.getTableHeader().setResizingAllowed(true);

            // redimensiona as colunas de uma tabela
            TableColumn column = null;
        } catch (Exception e) {
            System.err.println("Erro ao popular tabela: " + e + "\n" + e.getCause());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarPredio;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btConsultarTabela;
    private javax.swing.JButton btInativar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVerEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JFormattedTextField jftTipo;
    private javax.swing.JPanel jpCadastro;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JTable jtDependencias;
    private javax.swing.JTextField jtNomeArquivos;
    private javax.swing.JTable jtResultados;
    private javax.swing.JTextArea jtScript;
    private javax.swing.JTabbedPane jtpMain;
    private qitjftf.QITJFormattedTextField qftfConsultaNome;
    private qitjftf.QITJFormattedTextField qftfIdTipo;
    private qitjftf.QITJFormattedTextField qftfNome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setRelacionado4(String id, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
