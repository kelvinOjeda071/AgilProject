package AgilProject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Celular> listaCelularesEmpresa = new ArrayList<>();
        String opcionMenuCompra;
        String imeiDeCelular;
        Celular c1 = new Celular("Redmi note 8", "Xiaomi", "1234567889", 
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 180);
        Celular c2 = new Celular("Redmi note 9", "Xiaomi", "1234567810", 
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 100);
        Celular c3 = new Celular("Redmi note 10", "Xiaomi", "1234567811", 
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 210);
        listaCelularesEmpresa.add(c1);
        listaCelularesEmpresa.add(c2);
        listaCelularesEmpresa.add(c3);
        Empresa empresa = new Empresa("MERCADOCELL.SA", listaCelularesEmpresa);
        System.out.println(mostrarMenuDeCompra());
        System.out.print("\nIngrese la opcion: ");
        Scanner sc= new Scanner(System.in);
        opcionMenuCompra = sc.next();
        do {
            switch (opcionMenuCompra) {
                case "1":
                    System.out.println(empresa.mostrarCelulares());
                    System.out.println("Seleccione el celular que desea por su codigo IMEI: ");
                    imeiDeCelular = sc.next();
                    if (empresa.verificarExistenciaCelular(imeiDeCelular)) {
                        if (empresa.verificarDisponibilidadCelular(imeiDeCelular)) {
                            System.out.println(empresa.generarFactura(imeiDeCelular));
                            System.exit(0);

                        } else {
                            System.out.println("El celular no se encuentra disponible");
                        }
                    } else {
                        System.out.println("El celular no existe");
                    }
                    break;
                case "2":
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opcion no existe intentelo de nuevo");
                    System.out.println(mostrarMenuDeCompra());
                    opcionMenuCompra = sc.next();
            }
        }while(opcionMenuCompra.equals("1"));
        
        
        
        
        
    }
    //Menú que permite visualizar las opciones de compra hacia el comprador
    public static String mostrarMenuDeCompra(){
        return "\n\nSeleccione una de las siguientes opciones: "
                + "\n1. Comprar celular"
                + "\n2. Salir";
    }
    
    
    
    
}
