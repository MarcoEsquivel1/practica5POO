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
public class Heladeria extends Empresa{
    public int cantHelados;
    public double costoH = 2.00;
    public void venderHelado(){
        JOptionPane.showMessageDialog(null, "Se ha vendido un helado");
        this.presupuesto += this.costoH;
    }
    
    Heladeria(int emple, double presu, int cant){
        this.empleados = emple;
        this.presupuesto = presu;
        this.cantHelados = cant;
    }
}
