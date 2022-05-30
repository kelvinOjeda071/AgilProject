package AgilProject;

import java.io.*;
import java.util.ArrayList;

public class Ganancia {

    public float calcularGanancia(float precioDeVenta, float precioCompraEmpresa, String modelo, ArrayList<Celular> celularesVendidos) {
        float ganancia = precioDeVenta - precioCompraEmpresa;
        return ganancia;
    }

    private float calcularGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = precioDeVenta - precioCompraEmpresa;
        return ganancia;
    }

    public float porcentajeGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = calcularGanancia(precioDeVenta, precioCompraEmpresa);
        return (ganancia / precioCompraEmpresa) * 100;

    }



    public void calcularGananciasCelularesVendidos(ArrayList<Celular> celularesVendidos) {
        Ganancia g = new Ganancia();
        for (Celular celularVendido : celularesVendidos) {
            String modelo = celularVendido.getModelo();
            float precioVenta = celularVendido.getPrecioDeVenta();
            float precioCompraEmpresa = celularVendido.getPrecioDeCompraEmpresa();
            g.calcularGanancia(precioVenta, precioCompraEmpresa, modelo, celularesVendidos);
        }
    }
}
