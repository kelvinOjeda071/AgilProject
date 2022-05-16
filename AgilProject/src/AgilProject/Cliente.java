package AgilProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Kelvin
 */
public class Cliente {
    private String nombre;
    private Cuenta cuenta;
    private Factura factura;
    
    // Constructor de la clase cliente
    public Cliente(String nombre, Cuenta cuenta, Factura factura) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.factura = factura;
    }
    // Método para obtener el nombre de un cliente
    public String getNombre() {
        return nombre;
    }
    // Método para settear el nombre de un cliente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método para obtener la cuenta de un cliente
    public Cuenta getCuenta() {
        return cuenta;
    }
    // Método para settear la cuenta de un cliente
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    // Método para obtener la factura de un cliente
    public Factura getFactura() {
        return factura;
    }
    // Método para settear la factura de un cliente
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    // Método para obtener los atributos asociados a un cliente.
    @Override
    public String toString() {
        return "Cliente\n" 
                + "\n Nombre =" + nombre 
                + "\n Cuenta=" + cuenta
                + "\n Factura=" + factura ;
    }
    
    
    
}
