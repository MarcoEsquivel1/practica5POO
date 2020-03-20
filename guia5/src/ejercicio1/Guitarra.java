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
public class Guitarra extends InstrumentoMusical{
    public int cuerdas;
    
    public void SoloGuitarra(){
        JOptionPane.showMessageDialog(null,"Inserte sonido de solo de guitarra aqui");
    }
    
    Guitarra(int cuerdas, double pre){
        this.cuerdas = cuerdas;
        this.precio = pre;
    }
}
