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
public class Fontaneria extends Empresa{
    public double costoReparacion = 30.00;
    public void arreglarTuberia(){
        JOptionPane.showMessageDialog(null, "Se ha arregladola tuberia");
        this.presupuesto += this.costoReparacion;
    }
    
    Fontaneria(int emple, double presu){
        this.empleados = emple;
        this.presupuesto = presu;
    }
}
