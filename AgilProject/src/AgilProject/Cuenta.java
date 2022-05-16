package AgilProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Kelvin
 */
public class Cuenta {
    private String usuario;
    private String contrasenia;
    // Constructor de la clase Cuenta
    public Cuenta(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    // Método para obtener el usuario de una cuenta
    public String getUsuario() {
        return usuario;
    }
    // Método para settear el usuario de una cuenta
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    // Método para obtener la contraseña de una cuenta
    public String getContrasenia() {
        return contrasenia;
    }
    // Método para settear la contraseña de una cuenta
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    // Método para mostrar por consola los atributos asociados a una cuenta.
    @Override
    public String toString() {
        return "Cuenta{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }
    
    
}
