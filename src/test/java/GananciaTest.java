import org.junit.*;

import javax.swing.filechooser.FileSystemView;

import java.io.FileNotFoundException;

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
        System.out.println("Prueba N:. 4");
    }

    @Test (expected = AssertionError.class)
    public void given_AfileDirectorythatDoesNotExist_when_cargarArchivos_then_ok(){
        System.out.println("Prueba N:. 5");
        LecturaArchivo lecturaDeArchivo = new LecturaArchivo();
        int expect = 3;
        int actual = lecturaDeArchivo.cargarCelulares(FileSystemView.
                getFileSystemView().getDefaultDirectory().getPath()+"\\celulares.txt").size();
        assertEquals(actual, expect);
    }

    @Before
    public void setUp(){
        g = new Ganancia();
        System.out.println("Prueba N:. 3");
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
        System.out.println("Prueba N:. 2");
        float expected = (float) ((100f)*((50f)/(110f)));
        float actual = g.porcentajeGanacia(160, 110);
        assertEquals(expected, actual, DELTA);
    }

    @Ignore
    public void give_two_pricesAreFloatAndOneOfTheIsZero_when_porcentajeGanacia_then_ok(){
        System.out.println("Prueba N:. 6");
        float expected = (100f)*((50f)/(110f));
        float actual = g.porcentajeGanacia(160, 0);
        assertEquals(expected, actual, 0.0);
    }

    @AfterClass
    public static void given_twoNumbersAndModel_when_generarFicheroGanancia(){
        System.out.println("Prueba N:. 7");
        LecturaArchivo lecturaDeArchivo = new LecturaArchivo();
        boolean NoExisteError = lecturaDeArchivo.generarFicheroGanancia("Redmi note 9",
                160,110);
        assertTrue(NoExisteError);
    }




}
