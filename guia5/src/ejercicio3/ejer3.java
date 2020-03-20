/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Esquivel
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Heladeria heladeria = new Heladeria(3, 200.00, 10);
        Ferreteria ferreteria = new Ferreteria(4, 300.00, 20);
        Fontaneria fontaneria = new Fontaneria(10, 100.00);
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("[1]Heladeria \n[2]Ferreteria \n[3]Fontaneria \n[4]Salir"));
            switch (op) {
                case 1:
                    op = Integer.parseInt(JOptionPane.showInputDialog("Empleados: "+ heladeria.empleados +"\n[1]Para comprar un producto"));
                    if (op == 1) {
                        heladeria.venderHelado();
                    }
                    break;
                case 2:
                    op = Integer.parseInt(JOptionPane.showInputDialog("Empleados: "+ ferreteria.empleados +"\n[1]Para comprar un producto"));
                    if (op == 1) {
                        ferreteria.venderProducto();
                    }
                    break;
                case 3:
                    op = Integer.parseInt(JOptionPane.showInputDialog("Empleados: "+ fontaneria.empleados +"\n[1]Para comprar un producto"));
                    if (op == 1) {
                        fontaneria.arreglarTuberia();
                    }
                    break;
                default:
                    break;
            }
        } while (op != 4);
        
        
    }
    
}
