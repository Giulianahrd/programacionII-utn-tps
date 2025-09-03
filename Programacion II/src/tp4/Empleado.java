/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author giu
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800000; 
    }

    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario = this.salario * (1 + porcentaje / 100);
        }
    }

    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
        }
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: $" +  this.salario;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
