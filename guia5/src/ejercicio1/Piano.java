/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Esquivel
 */
public class Piano extends InstrumentoMusical{
    public String tipoPiano;
    
    public void melodia(){
        JOptionPane.showMessageDialog(null,"Esta sonando una melodia");
    }
    
    Piano(String tipo, double pre){
        this.tipoPiano = tipo;
        this.precio = pre;
    }
}
