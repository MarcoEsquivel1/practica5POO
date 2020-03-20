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
public class Trompeta extends InstrumentoMusical{
    public String afinacion;
    
    public void melodia(){
        JOptionPane.showMessageDialog(null,"Inserte melodia aqui");
    }
    
    Trompeta(String afinacion, double pre){
        this.afinacion = afinacion;
        this.precio = pre;
    }
}
