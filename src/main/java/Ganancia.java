public class Ganancia {

    public float porcentajeGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = calcularGanancia(precioDeVenta, precioCompraEmpresa);
        return (ganancia / precioCompraEmpresa)*100;

    }

    public float calcularGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = precioDeVenta - precioCompraEmpresa;
        return ganancia;
    }


}
