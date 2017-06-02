/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devs.devfood.classesgerais;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author eduardo
 */
public class gerenciadorJanelas {
    
    private static JDesktopPane jDesktopPane;
    
    public gerenciadorJanelas(JDesktopPane jDesktopPane){
        gerenciadorJanelas.jDesktopPane = jDesktopPane;
    }
    
    public void validaAbreJanelas(JInternalFrame jinternalFrame){
        if(jinternalFrame.isVisible()){
            //se ja estiver aberta colcoa para frente
            //setando o focus para a janela
            jinternalFrame.toFront();
            jinternalFrame.requestFocus();
        }
        else{
            jDesktopPane.add(jinternalFrame);
            centralizaForm(jinternalFrame);
            jinternalFrame.setVisible(true);
        }
    }
    
    //Função que centraliza internaljframe
     private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
}
