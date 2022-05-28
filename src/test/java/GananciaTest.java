import org.junit.Test;

import static org.junit.Assert.*;

public class GananciaTest {
    private static final double DELTA = 1e-15;

    @Test
    public void given_two_prices_float_when_calcularGanancia_then_ok() {
        System.out.println("Prueba N:. 1");
        Ganancia g = new Ganancia();
        float expected = 50;
        float actual = g.calcularGanancia(250, 200);
        assertEquals(expected, actual, DELTA);

    }
}