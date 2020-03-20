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
public class Presidente extends Empleado{
    public Gerente gerente1;
    public Gerente gerente2;
    
    Presidente(String pName, double pSueldo){
        this.nombre = pName;
        this.sueldo = pSueldo;
    }
}
