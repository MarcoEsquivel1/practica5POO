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
public class Ferreteria extends Empresa{
    public int cantProductos;
    public double costoP = 3.50;
    public void venderProducto(){
        JOptionPane.showMessageDialog(null, "Se ha vendido un producto");
        this.presupuesto += this.costoP;
    }
    
    Ferreteria(int emple, double presu, int cant){
        this.empleados = emple;
        this.presupuesto = presu;
        this.cantProductos = cant;
    }
}
