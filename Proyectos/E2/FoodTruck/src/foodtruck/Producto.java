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
    
    public abstract void imprimirBoleta();
}
