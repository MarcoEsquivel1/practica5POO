/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presidente presi = new Presidente("Saul",3000.00);
        presi.gerente1 = new Gerente("Ana", 2000.00);
        presi.gerente2 = new Gerente("Raul", 2000.00);
        presi.gerente1.empleado1 = new Empleado("Jose",1000.00);
        presi.gerente1.empleado2 = new Empleado("Maria",1000.00);
        presi.gerente1.empleado3 = new Empleado("Laura",1000.00);
        presi.gerente2.empleado1 = new Empleado("Ernesto",1000.00);
        presi.gerente2.empleado1 = new Empleado("Rita",1000.00);
        presi.gerente2.empleado2 = new Empleado("Pedro",1000.00);
        presi.gerente2.empleado3 = new Empleado("Paula",1000.00);
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("[1]Ver  \n[2]Salir"));
            if (op == 1) {
                op = Integer.parseInt(JOptionPane.showInputDialog("Nombre del Presidente: "+presi.nombre+
                        "\nSueldo: $"+presi.sueldo+"\n[1]Gerente 1 \n[2]Gerente 2"));
                switch(op){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Nombre: "+presi.gerente1.nombre+"\nSalario: $"+presi.gerente1.sueldo+"\nEmpleado 1: "+presi.gerente1.empleado1.nombre+"\nEmpleado 2: "+presi.gerente1.empleado2.nombre+"\nEmpleado 3: "+presi.gerente1.empleado3.nombre+"\nSueldo de empleados: $"+presi.gerente1.empleado1.sueldo);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Nombre: "+presi.gerente2.nombre+"\nSalario: $"+presi.gerente2.sueldo+"\nEmpleado 1: "+presi.gerente2.empleado1.nombre+"\nEmpleado 2: "+presi.gerente2.empleado2.nombre+"\nEmpleado 3: "+presi.gerente2.empleado3.nombre+"\nSueldo de empleados: $"+presi.gerente2.empleado1.sueldo);
                        op = 10;
                        break;
                }
            }
        } while (op !=2);
        
    }
    
}
