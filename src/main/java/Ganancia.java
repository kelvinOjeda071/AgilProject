public class Ganancia {

    public float porcentajeGanacia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = calcularGanancia(precioDeVenta, precioCompraEmpresa);
        float porcentajeDeGanancia = Math.round((ganancia / precioCompraEmpresa) * 100 * 100d) / 100;
        return porcentajeDeGanancia;
    }

    public float calcularGanancia(float precioDeVenta, float precioCompraEmpresa) {
        float ganancia = precioDeVenta - precioCompraEmpresa;
        return ganancia;
    }


}
