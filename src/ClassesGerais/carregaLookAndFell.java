/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesGerais;

import javax.swing.UIManager;

/**
 *
 * @author eduardo
 */
public class carregaLookAndFell 
{
    
    public void carregaVisualSistema()
    {
        {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) 
        {
            System.err.println("Erro Critico // não foi possivel carregar o look and fell");
            e.printStackTrace();
        }
    }
    }
    
}
