/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AgilProject;

import java.util.Scanner;

/**
 * @author Kelvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //CUANDO EL USUARIO QUIERA INICIAR SESION SE CARGARA LAS CUENTAS EXISTENTES

        ListaCelulares listaCelulares = new ListaCelulares();

        Celular c1 = new Celular("Redmi note 8", "Xiaomi", "1234567889",
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 180);
        Celular c2 = new Celular("Redmi note 9", "Xiaomi", "1234567810",
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 100);
        Celular c3 = new Celular("Redmi note 7", "Xiaomi", "1234567811",
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 210);
        Celular c4 = new Celular("Redmi note 7", "Xiaomi", "1234567811",
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 210);
        Celular c5 = new Celular("Redmi note 8", "Xiaomi", "1234567882",
                new Garantia("12/20/2030", "La garantia solo se aplica por "
                        + "defectos de fabrica"), 180);
        listaCelulares.aniadirCelular(c4);
        listaCelulares.aniadirCelular(c1);
        listaCelulares.aniadirCelular(c2);
        listaCelulares.aniadirCelular(c3);
        listaCelulares.aniadirCelular(c5);
        Empresa empresa = new Empresa("MERCADOCELL.SA", listaCelulares);
        empresa.cargarCuentas("C:\\LecturaDeArchivos\\cuentaClientes.txt");
        empresa.registrarCliente();
        empresa.realizarCompra();




    }




}
