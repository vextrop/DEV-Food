/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosBotoes;

import interfaceSwing.cadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author eduardo
 */
public class eventoCadastroFuncionarios implements ActionListener{
    
    cadastroFuncionario cadastrofuncionario;

    public eventoCadastroFuncionarios(cadastroFuncionario cadastroFunc) {
        this.cadastrofuncionario = cadastroFunc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("finalizaCadastro".equals(e.getActionCommand())){
            cadastrofuncionario.cadastraFuncionario();
        }
        if("cancelarCadastro".equals(e.getActionCommand())){
            cadastrofuncionario.cancelaCadastro();
        }
    }
    
}
