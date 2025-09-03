/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author giu
 */
public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado(1, "Juan", "Gerente", 1500000);
        
        Empleado emp2 = new Empleado("Ana", "Desarrollador");
        Empleado emp3 = new Empleado("Carla", "RRHH");

        emp1.actualizarSalario(10); 
        emp2.actualizarSalario(50000); 

        System.out.println(emp1.toString()); 
        System.out.println(emp2.toString()); 
        System.out.println(emp3.toString()); 

        System.out.println(" ");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
    }
}