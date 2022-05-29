package ec.edu.epn.tdd.ganancia;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IGananciaTest {
    private static final double DELTA = 1e-15;
    @Test
    public void given_twoPrices_when_calcularGanancia_then_ok() {
        IGanancia ig = Mockito.mock(IGanancia.class);
        Mockito.when(ig.calcularGanancia(160,110)).thenReturn(50f);
        assertEquals(50, ig.calcularGanancia(160,110), DELTA);
    }
    @Test
    public void given_twoPrices_when_calcularPorcentajeGanancia_then_ok() {
        IGanancia ig = Mockito.mock(IGanancia.class);
        Mockito.when(ig.calcularPorcentajeGanancia(160,110)).thenReturn(45.45f);
        assertEquals(45.45f, ig.calcularPorcentajeGanancia(160,110), DELTA);
    }
}