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
        // Lista de celulares que simula la carga iniciar de archivos
        ArrayList <Celular> listaCelularesEmpresa = new ArrayList<>();
        
        // Variable que permite alojar las opción del menú de compra
        String opcionMenuCompra;
        
        // Variable que permitirá almacenar el modelo del celular, una 
        // vez seleccionado la compra del celular
        String modelo;
        
        // Creación de los objetos celular
        Celular c1 = new Celular("Redmi note 8", "Xiaomi", "1234567889", 
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 180);
        Celular c2 = new Celular("Redmi note 9", "Xiaomi", "1234567810", 
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 100);
        Celular c3 = new Celular("Redmi note 10", "Xiaomi", "1234567811", 
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 210);
        
        // Se incorpora a cada uno de los celulares dentro de la lista
        listaCelularesEmpresa.add(c1);
        listaCelularesEmpresa.add(c2);
        listaCelularesEmpresa.add(c3);
        Empresa empresa = new Empresa("MERCADOCELL.SA", listaCelularesEmpresa);
        
        // Menú que permite mostrar el menú de compra
        System.out.println(mostrarMenuDeCompra());
        
        // Se utiliza un objeto scanner para almacenar la opción seleccionada
        // del menú de compra
        System.out.print("\nIngrese la opcion: ");
        Scanner sc= new Scanner(System.in);
        opcionMenuCompra = sc.nextLine();
        do {
            switch (opcionMenuCompra) {
                // En caso que la opción selecionada sea compra de celulares
                case "1": 
                    
                    // Permite visualizar los celulares cuyo estado sea disponible
                    System.out.println(empresa.mostrarCelulares());
                    System.out.println("\nDigite el modelo de celular que desea obtener: ");
                    modelo = sc.nextLine();
                    
                    // Se verifica al existencia del teléfono
                    if (empresa.verificarExistenciaCelular(modelo)) {
                        
                        // Se verifica la disponibilidad del celular
                        if (empresa.verificarDisponibilidadCelular(modelo)) {
                            
                            // Imprime la factura a traves de la consola
                            System.out.println(empresa.generarFactura(modelo));
                            
                            // Termina la ejecución del programa
                            System.exit(0);

                        } else {
                            System.out.println("El celular no se encuentra disponible");
                        }
                    } else {
                        System.out.println("El celular no existe");
                    }
                    break;
                // En caso que la opci'ón seleccionada sea salir del sistema
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
