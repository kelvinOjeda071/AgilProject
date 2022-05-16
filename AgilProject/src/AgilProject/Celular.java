package AgilProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Kelvin
 */
public class Celular {
    private String modelo;
    private String nombreMarca;
    private String codigoImei;
    private Garantia garantia;
    private double precio;
    private String estado;
    // Contructor de la clase celular
    public Celular(String modelo, String nombreMarca, String codigoImei, Garantia garantia, double precio) {
        this.modelo = modelo;
        this.nombreMarca = nombreMarca;
        this.codigoImei = codigoImei;
        this.garantia = garantia;
        this.precio = precio;
        this.estado = "Disponible";
    }

    
    // Método para obtener el modelo desde otras clases
    public String getModelo() {
        return modelo;
    }
    // Método para settear el modelo de un teléfono
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // Método para obtener el nombre de marca de un celular
    public String getNombreMarca() {
        return nombreMarca;
    }
    // Método para settear el nombre de marca de un celular
    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
    // Método para obtener el código IMEI de un celular
    public String getCodigoImei() {
        return codigoImei;
    }
    // Método para settear el código IMEI de un celular
    public void setCodigoImei(String codigoImei) {
        this.codigoImei = codigoImei;
    }
    // Método para establecer la garantía de un teléfono
    public Garantia getGarantia() {
        return garantia;
    }
    // Método para settear la garantía de un teléfono
    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }
    // Método para obtener el precio de un teléfono
    public double getPrecio() {
        return precio;
    }
    // Método para referenciar el precio de un teléfono
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Método para obtener el estado de un teléfono
    // El estado de un teléfono solamente puede ser, entre disponible y 
    // no disponible
    public String getEstado() {
        return estado;
    }
    // Método para settear el estado de un teléfono
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    // Método para imprimir por consola los atributos asociados a un teléfono
    @Override
    public String toString() {
        return "Modelo = " + modelo 
                + "\nMarca = " + nombreMarca 
                + "\nCodigo Imei = " + codigoImei
                + "\n" + garantia 
                + "\nPrecio = $" + precio 
                + "\nEstado = " + estado +"\n";
    }

    
    
    
}
