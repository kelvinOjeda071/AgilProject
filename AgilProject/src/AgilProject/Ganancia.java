package AgilProject;

import java.io.*;
import java.util.ArrayList;

public class Ganancia {

    public float calcularGanancia(float precioDeVenta, float precioCompraEmpresa, String modelo, ArrayList<Celular> celularesVendidos) {
        generarFicheroGanancia(modelo, precioCompraEmpresa, precioDeVenta, celularesVendidos);
        float ganancia = precioDeVenta - precioCompraEmpresa;
        return ganancia;
    }

    public float porcentajeGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = calcularGanancia(precioDeVenta, precioCompraEmpresa);
        return (ganancia / precioCompraEmpresa) * 100;

    }

    private float calcularGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = precioDeVenta - precioCompraEmpresa;
        return ganancia;
    }

    private void generarFicheroGanancia(String modelo, float precioCompraEmpresa, float precioDeVenta, ArrayList<Celular> celularesVendidos) {
        File fichero = new File("ganancias.txt");
        float ganancia = precioDeVenta - precioCompraEmpresa;
        try {
            FileWriter w = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            //wr.write("La ganancia del modelo " + modelo + " es: " + ganancia);
            for (Celular c : celularesVendidos) {
                wr.append("La ganancia del modelo " + c.getModelo() + " es: " + ganancia + "\n");
            }
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
