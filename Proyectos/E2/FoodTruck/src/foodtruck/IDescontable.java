package foodtruck;

public interface IDescontable {
    double DESCUENTO_EFECTIVO = 0.2;
    double DESCUENTO_COMESTIBLE = 0.1;
    double DESCUENTO_BEBESTIBLE = 0.05;
    
    int obtenerCompra(int unidades);
    int descontar(String formaPago, int unidades);
    int calcularTotal(String formaPago, int unidades);
    
}
