import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class GananciaParametersTest {
    private static final double DELTA = 1e-15;
    private float precioDeVenta, precioCompraEmpresa, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters_in_calcularGanancia(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{160, 110, 50});
        objects.add(new Object[]{250, 200, 50});
        objects.add(new Object[]{320, 300, 20});
        objects.add(new Object[]{240, 200, 40});
        objects.add(new Object[]{160,  90, 70});
        objects.add(new Object[]{440, 430, 10});
        objects.add(new Object[]{550, 515, 35});
        return objects;
    }
    public GananciaParametersTest (float precioDeVenta, float precioCompraEmpresa, float expected){
        this.precioDeVenta = precioDeVenta;
        this.precioCompraEmpresa = precioCompraEmpresa;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_calcularGanancia_then_ok(){
        Ganancia g = new Ganancia();
        float actual = g.calcularGanancia(precioDeVenta, precioCompraEmpresa);
        assertEquals(expected, actual, DELTA);
    }
}

