import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LecturaArchivo {


    public ArrayList cargarCelulares(String direccionDelArchivo) {
        ArrayList<HashMap> celulares = new ArrayList<HashMap>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccionDelArchivo));
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                HashMap<String, String> informacionCelular = new HashMap<String, String>();
                String[] res = bfRead.split("[,]", 0);
                informacionCelular.put("modelo", res[0]);
                informacionCelular.put("nombreMarca", res[1]);
                informacionCelular.put("codigoImei", res[2]);
                informacionCelular.put("fechaCaducidad", res[3]);
                informacionCelular.put("descripcion", res[4]);
                informacionCelular.put("precio", res[5]);
                informacionCelular.put("precioCompra", res[6]);
                celulares.add((informacionCelular));
            }
            //txt = txtTemp;
        } catch (Exception e) {
            System.out.println("El archivo no existe");
        }
        return celulares;
    }

    public boolean generarFicheroGanancia(String modelo, float precioCompraEmpresa, float precioDeVenta) {
        boolean noExisteError = true;
        File fichero = new File("ganancias.txt");
        float ganancia = precioDeVenta - precioCompraEmpresa;
        try {
            FileWriter w = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            //wr.write("La ganancia del modelo " + modelo + " es: " + ganancia);
            wr.append("La ganancia del modelo " + modelo+ " es: " + ganancia);
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return noExisteError;
    }




}
