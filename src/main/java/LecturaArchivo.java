import java.io.BufferedReader;
import java.io.FileReader;
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





}
