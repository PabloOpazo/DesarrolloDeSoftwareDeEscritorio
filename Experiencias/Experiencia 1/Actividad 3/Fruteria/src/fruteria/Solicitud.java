package fruteria;

public class Solicitud {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private int total;
    private Producto producto;

    public Solicitud() {
        cliente = new Cliente();
        producto = new Producto();
    }

    public Solicitud(int numero, String fecha, Cliente cliente, int total, Producto producto) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.producto = producto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void comprar(){
        
    }
    
    @Override
    public String toString() {
        return "Solicitud{" + "numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total + ", producto=" + producto + '}';
    }
    
    
}
