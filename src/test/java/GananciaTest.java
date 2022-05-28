import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GananciaTest {
    Ganancia g = null;
    private static final double DELTA = 1e-15;
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
