/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosBotoes;

import classesObjetos.clnArquivos;
import interfaceSwing.cadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class eventoCadastroFuncionarios implements ActionListener{
    
    //Instancia a classe de escrita de log
    clnArquivos arquivo = new clnArquivos();
    
    cadastroFuncionario cadastrofuncionario;

    public eventoCadastroFuncionarios(cadastroFuncionario cadastroFunc) {
        this.cadastrofuncionario = cadastroFunc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("finalizaCadastro".equals(e.getActionCommand())){
            try {
                cadastrofuncionario.cadastraFuncionario();
            } catch (IOException ex) {
                Logger.getLogger(eventoCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                arquivo.escreveLog("Tentativa de cadastro de cliente lancada");
            } catch (IOException ex) {
                Logger.getLogger(eventoCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if("cancelarCadastro".equals(e.getActionCommand())){
            try {
                cadastrofuncionario.cancelaCadastro();
            } catch (IOException ex) {
                Logger.getLogger(eventoCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
