import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.filechooser.FileSystemView;

import static org.junit.Assert.*;

public class GananciaTest {
    Ganancia g = null;
    private static final double DELTA = 1e-15;


    @BeforeClass
    public static void given_AfileDirectory_when_cargarArchivos_then_ok(){
        LecturaArchivo lecturaDeArchivo = new LecturaArchivo();
        int expect = 3;
        int actual = lecturaDeArchivo.cargarCelulares(FileSystemView.
                getFileSystemView().getDefaultDirectory().getPath()+"\\AgilProject\\celulares.txt").size();
        assertEquals(actual, expect);
        System.out.println("Lectura de archivos exitosa");
    }
    @Before
    public void setUp(){
        g = new Ganancia();
        System.out.println("Setup");
    }



    @Test
    public void given_two_prices_float_when_calcularGanancia_then_ok() {
        System.out.println("Prueba N:. 1");
        float expected = 50;
        float actual = g.calcularGanancia(250, 200);
        assertEquals(expected, actual, DELTA);

    }
    @After
    public void give_two_prices_float_when_porcentajeGanacia_then_ok(){
        System.out.println("Prueba N:.2");
        float expected = Math.round(45.45*100d)/100;
        float actual = g.porcentajeGanacia(160, 110);
        assertEquals(expected, actual, DELTA);
    }
}
