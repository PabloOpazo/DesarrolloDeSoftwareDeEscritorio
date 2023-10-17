package pinksa;

public abstract class Encomienda implements IDescuentos {
    protected String destinatario;
    protected int cantidad;
    protected String destino;
    protected boolean prioritario;
    protected String tipo_pago;

    public Encomienda() {
    }

    public Encomienda(String destinatario, int cantidad, String destino, boolean prioritario, String tipo_pago) {
        this.destinatario = destinatario;
        this.cantidad = cantidad;
        this.destino = destino;
        this.prioritario = prioritario;
        this.tipo_pago = tipo_pago;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    
    public abstract int precioEncomienda();
    public abstract void mostrarDatos();
    
}
