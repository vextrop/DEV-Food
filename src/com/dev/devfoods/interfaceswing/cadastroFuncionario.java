package com.dev.devfoods.interfaceswing;

import com.devs.devfood.classesobjetos.clnArquivos;
import com.devs.devfood.classesobjetos.clnCadastroFuncionarios;
import com.devs.devfood.eventosbotoes.eventoCadastroFuncionarios;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo
 */
public class cadastroFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form cadastroFuncionario
     */
    private static cadastroFuncionario funcionarios;
    
    
    public static cadastroFuncionario getInstancia(){
        if(funcionarios == null){
            funcionarios = new cadastroFuncionario();
        }
        return funcionarios;
    }
    
    private Vector vetorFuncionario = new Vector();
    private eventoCadastroFuncionarios eventoFuncionarios = new eventoCadastroFuncionarios(this);
    private clnCadastroFuncionarios clnCadastro = new clnCadastroFuncionarios();
    //Instancia de classe de cadastro de log
    clnArquivos arquivos = new clnArquivos();
    
    public cadastroFuncionario() {
        initComponents();
        btnFinalizaCadastro.addActionListener(eventoFuncionarios);
        btnCancelaCadastro.addActionListener(eventoFuncionarios);
        btnDeletaCadastro.addActionListener(eventoFuncionarios);
    }
 
    public void cadastraFuncionario() throws IOException {

        if (txtBairro.getText().isEmpty() || txtCargo.getText().isEmpty() || txtCidade.getText().isEmpty() || txtCodigo.getText().isEmpty() || txtCpf.getText().isEmpty() || txtDataEnceramento.getText().isEmpty() || txtDataContratacao.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtNome.getText().isEmpty() || txtRg.getText().isEmpty() || txtUf.getText().isEmpty() || txtComissao.getText().isEmpty() || txtSalarioBase.getText().isEmpty() || txtDataNascimento.getText().isEmpty() || txtHorasSemanais.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa prencher todos os campos para validar as informacoes!!");

            //escreve log
            arquivos.escreveLog("Tentativa falha de cadastro de funcionario Algum campo esta vazio");
        } else {
            try {
                clnCadastro.setBairro(txtBairro.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo bairro");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em bairro");
                return;
            }
            try {
                clnCadastro.setCargo(txtCargo.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo cargo");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em cargo");
                return;
            }
            try {
                clnCadastro.setCidade(txtCidade.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo cidade");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em cidade");
                return;
            }
            try {
                clnCadastro.setCodigo(Integer.parseInt(txtCodigo.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Codigo precisa ser um numero");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, codigo precisa ser um numero");
                return;
            }
            try {
                clnCadastro.setCpf(txtCpf.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "CPF precisa ser um numero");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, cpf precisa ser um numero");
                return;
            }
            try {
                clnCadastro.setDataEnceramento(txtDataEnceramento.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data de encerramento precisa ser uma data");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, data de encerramento precisa ser uma data");
                return;
            }
            try {
                clnCadastro.setDataContratacao(txtDataContratacao.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data de contratação precisa ser uma data");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, data de contratação precisa ser uma data");
                return;
            }
            try {
                clnCadastro.setEndereco(txtEndereco.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo endereco");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em endereco");
                return;
            }
            try {
                clnCadastro.setNomeCompleto(txtNome.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo nome");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em nome");
                return;
            }
            try {
                clnCadastro.setRg(Integer.parseInt(txtRg.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "RG precisa ser uma sequencia de 9 numeros");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, RG precisa ser um sequencia de numeros");
                return;
            }
            try {
                clnCadastro.setSexo(comboSexo.getSelectedItem().toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo sexo");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em sexo");
                return;
            }
            try {
                clnCadastro.setUf(txtUf.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique o campo de UF");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em UF");
                return;
            }
            try {
                clnCadastro.setValorComissao(Float.parseFloat(txtComissao.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor da comisão precisa ser um numero");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, valor da comicao precisa ser um numero");
                return;
            }
            try {
                clnCadastro.setValorSalario(Float.parseFloat(txtSalarioBase.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Salario base precisa ser um numero");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, salario base precisa ser um numero");
                return;
            }
            try {
                clnCadastro.setDataNascimento(txtDataNascimento.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data de nascimento precisa ser uma data");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, data de nascimento precisa ser um data");
                return;
            }
            try {
                clnCadastro.setHorasSemanais(Integer.parseInt(txtHorasSemanais.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Horas semanais deve ser um numero");
                arquivos.escreveLog("Tentativa falha de cadastro de Funcionario, erro em horas semanais");
                return;
            }
            clnCadastro.imprimirCadastro();
            JOptionPane.showMessageDialog(null, "Usuario " + txtNome.getText() + "Cadastrado com sucesso!");
            
            //chama funcao capas de salvar dados no banco
            clnCadastro.salvarCadastro();
            
            //escreve no log
            arquivos.escreveLog("Funcionario Cadastrado com sucesso");
            //atualiza lista com novo cadastro
            carregaListaFuncionarios();
        }

        
    }
    
    public void deletaCadastro(){
        
        //chama funcao capas de deletar funcionari
        clnCadastro.deletarCadastro();
        
    }
    
    public void carregaListaFuncionarios(){
        //receber dados de select e carregar no vetor
        //carregar vetor na lista e pronto
        
        
        
        String funionario = "121212|Eduardo Spillere Anzolin";
        vetorFuncionario.add(funionario);
        listaFuncionarios.setListData(vetorFuncionario);
        
        //configurando evento de selecao na lista
        listaFuncionarios.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(e);
                if(listaFuncionarios.getSelectedValue() != null){
                    //chama funcao que carrega os dados nos campos respectivos
                    carregaCamposVisual();
                }
            }
        });
        
    }
    
    private void carregaCamposVisual(){
        //funcao para carregar os campos
    }
    
    public void cancelaCadastro() throws IOException{
        cadastroFuncionario.this.dispose();
        //escreve no log
        arquivos.escreveLog("Cadastro de funcionario Cancelado");
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtHorasSemanais = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtComissao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDataContratacao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDataEnceramento = new javax.swing.JTextField();
        btnCancelaCadastro = new javax.swing.JButton();
        btnFinalizaCadastro = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFuncionarios = new javax.swing.JList<>();
        btnDeletaCadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Funcionário");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel3.setText("CPF");

        jLabel4.setText("Nome Completo");

        jLabel5.setText("RG");

        jLabel6.setText("Data de Nascimento");

        jLabel7.setText("Codigo");

        jLabel8.setText("Sexo");

        jLabel9.setText("Endereço");

        jLabel10.setText("Uf");

        jLabel11.setText("Bairro");

        jLabel12.setText("Cidade");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(comboSexo, 0, 157, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtCidade)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados para profissionais"));

        jLabel13.setText("Cargo");

        jLabel14.setText("Horas semanais");

        jLabel15.setText("Valor Comissão");

        jLabel16.setText("Salário Base");

        jLabel17.setText("Data Contratação");

        jLabel18.setText("Data Encerramento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHorasSemanais, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataContratacao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtDataEnceramento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasSemanais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataContratacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataEnceramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnCancelaCadastro.setText("Cancelar");
        btnCancelaCadastro.setActionCommand("cancelarCadastro");
        btnCancelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaCadastroActionPerformed(evt);
            }
        });

        btnFinalizaCadastro.setText("Salvar");
        btnFinalizaCadastro.setActionCommand("finalizaCadastro");
        btnFinalizaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaCadastroActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        jScrollPane1.setViewportView(listaFuncionarios);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnDeletaCadastro.setText("Deletar");
        btnFinalizaCadastro.setActionCommand("deletarCadastro");
        btnDeletaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFinalizaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFinalizaCadastro)
                        .addComponent(btnDeletaCadastro))
                    .addComponent(btnCancelaCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(220, 220, 220));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel1.setText("Cadastros / Funcionários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizaCadastroActionPerformed

    private void btnCancelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelaCadastroActionPerformed

    private void btnDeletaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletaCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelaCadastro;
    private javax.swing.JButton btnDeletaCadastro;
    private javax.swing.JButton btnFinalizaCadastro;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaFuncionarios;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComissao;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataContratacao;
    private javax.swing.JTextField txtDataEnceramento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtHorasSemanais;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
