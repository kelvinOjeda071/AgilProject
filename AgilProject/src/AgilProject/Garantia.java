package AgilProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Kelvin
 */
public class Garantia {

    private String fechaCaducidad;
    private String descripcion;
    // Constructor de la clase Garantía
    public Garantia(String fechaCaducidad, String descripcion) {
        this.fechaCaducidad = fechaCaducidad;
        this.descripcion = descripcion;
    }
    // Método que permite obtener la fecha de caducidad de la garantía
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    // Método qie permite settear la fecha de cadidad de la garantía
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    // Método que permite obtener la descripción de una garantía
    public String getDescripcion() {
        return descripcion;
    }
    // Método que permite settear la descripción de una determianda garantía
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // Método que permite visualizar los atributos de la clase garantía
    @Override
    public String toString() {
        return "Fecha de caducidad de la garantia = " + fechaCaducidad
                + "\nDescripcion de garantia = " + descripcion;
    }

}
