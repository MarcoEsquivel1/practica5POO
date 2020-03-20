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
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Piano piano = new Piano("de cola", 5000.00);
        Guitarra guitarra = new Guitarra(6, 800.00);
        Trompeta trompeta = new Trompeta("do", 1200.00);
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("[1]Usar guitarra \n[2]Usar piano \n[3]Usar trompeta \n[4]Salir"));
            switch (op) {
                case 1:
                    guitarra.SoloGuitarra();
                    break;
                case 2:
                    piano.melodia();
                    break;
                case 3:             
                    trompeta.melodia();
                    break;
                default:
                    break;
            }
        } while (op != 4);
    }
    
}
