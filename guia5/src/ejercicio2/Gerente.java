/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author MARCOS
 */
public class Gerente extends Empleado{
    public Empleado empleado1;
    public Empleado empleado2;
    public Empleado empleado3;
    
    Gerente(String pName, double pSueldo){
        this.nombre = pName;
        this.sueldo = pSueldo;
    }
}
