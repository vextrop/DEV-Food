/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosBotoes;

import interfaceSwing.cadastroEstoque;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    if("adicionarPedido".equals(e.getActionCommand())){
           cadastroEstoque.cadastrarEstoque();
        }
    if("removerPedido".equals(e.getActionCommand())){
          cadastroEstoque.cancelarCadastro();
        }
        
    
}
}
