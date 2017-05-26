/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosBotoes;

import interfaceSwing.cadastroEstoque;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimitry
 */
public class eventoCadastroEstoque implements ActionListener{
    cadastroEstoque cadastroEstoque;

public eventoCadastroEstoque (cadastroEstoque cadaEst) {
    this.cadastroEstoque = cadaEst;
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if("cadastrarestoque".equals(e.getActionCommand())){
        try {
            cadastroEstoque.cadastrarEstoque();
        } catch (IOException ex) {
            Logger.getLogger(eventoCadastroEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    if("cancelar".equals(e.getActionCommand())){
        try {
            cadastroEstoque.cancelarCadastro();
        } catch (IOException ex) {
            Logger.getLogger(eventoCadastroEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    
}
}
