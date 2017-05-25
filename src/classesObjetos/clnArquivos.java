/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesObjetos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class clnArquivos {
    
    public String realizaLeituraUsuario() throws FileNotFoundException, IOException{
        
        /*/home/eduardo/Documentos/Programação/GitHub/DEV-Food/src/Arquivos/usuarios.txt*/
        //metodo auxiliar utilizado verificar depois a procedencia da 
        
        InputStream is = new FileInputStream("/home/eduardo/Documentos/Programação/GitHub/DEV-Food/src/Arquivos/usuarios.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
