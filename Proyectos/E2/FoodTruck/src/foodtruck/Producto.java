package foodtruck;

public abstract class Producto implements IDescontable{
    protected int codigo;
    protected String descripcion;
    protected double precio;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio) {
        this.setCodigo(codigo);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int obtenerCompra(int unidades) {
        return (int) (precio * unidades);
    }
    
    @Override
    public int calcularTotal(String formaPago, int unidades){
        int compra = obtenerCompra(unidades);
        int descto = descontar(formaPago, unidades);
        int pago = compra - descto;
        int propina = (int) (pago * 0.1);
        return pago + propina;
    }
    
    public abstract String imprimirBoleta(String formaPago, int unidades);
}
