package AgilProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Empresa {
    private String nombre;
    private ArrayList <Celular> listaCelularesEmpresa;

    public Empresa(String nombre, ArrayList<Celular> listaCelularesEmpresa) {
        this.nombre = nombre;
        this.listaCelularesEmpresa = listaCelularesEmpresa;
    }
    
    public void agregarListaCelularEmpresa(Celular celular){
        this.listaCelularesEmpresa.add(celular);
    }
    
    public String mostrarCelulares(){
        String salida = "";
        salida += "Bienvenido a la empresa " + this.nombre
                + "\nA continuacion te ofrecemos nuestra lista de telefonos "
                + "celulares";
        for( int i = 0; i < listaCelularesEmpresa.size(); i++){
            if(this.listaCelularesEmpresa.get(i).getEstado().equals("Disponible")){
                salida += this.listaCelularesEmpresa.get(i)+"\n";
            }
            
        }
        return salida;
    }
    
    public boolean verificarExistenciaCelular(String codigoImei){
        boolean encontroImei = false;
        for (int i = 0; i < listaCelularesEmpresa.size(); i++) {
            if (listaCelularesEmpresa.get(i).getCodigoImei().equals(codigoImei)){
                encontroImei = true;
            }
        }
        return encontroImei;
    }
    
    public boolean verificarDisponibilidadCelular(String codigoImei){
        boolean  estaDisponible= false;
        for (int i = 0; i < listaCelularesEmpresa.size(); i++) {
            if (listaCelularesEmpresa.get(i).getCodigoImei().equals(codigoImei)){
               if(listaCelularesEmpresa.get(i).getEstado().equalsIgnoreCase("Disponible")){
                   estaDisponible = true;
               }
            }
        }
        return estaDisponible;
    }
    
    public void cambiarEstadoNoDisponible(String codigoImei){
        for (int i = 0; i < listaCelularesEmpresa.size(); i++) {
            if (listaCelularesEmpresa.get(i).getCodigoImei().equals(codigoImei)){
                this.listaCelularesEmpresa.get(i).setEstado("No disponible");
            }
        }
    }
    
    public int retornarNumeroCelular(String codigoImei){
        int numeroCelular = -1;
        for (int i = 0; i < listaCelularesEmpresa.size(); i++) {
            if (listaCelularesEmpresa.get(i).getCodigoImei().equals(codigoImei)){
                numeroCelular = i;
            }
        }
        return numeroCelular;
    }
    
    public String generarFactura(String codigoImei){
        String salida="";
        salida += ("Se ha realizado la compra con exito");
        salida += ("A continuacion se presenta su factura");
        Factura factura = new Factura("1", "Compra de celular", listaCelularesEmpresa.get(retornarNumeroCelular(codigoImei)));
        factura.agregarListaCelulares(listaCelularesEmpresa.get(retornarNumeroCelular(codigoImei)));
        salida += factura;
        return salida;
    }

    
    
    
}
