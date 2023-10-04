package foodtruck;

public final class Comestible extends Producto {
    private boolean papas;

    public Comestible() {
    }

    public Comestible(boolean papas, int codigo, String descripcion, int precio) {
        super(codigo, descripcion, precio);
        this.setPapas(papas);
    }

    public boolean isPapas() {
        return papas;
    }

    public void setPapas(boolean papas) {
        this.papas = papas;
    }

    @Override
    public double obtenerCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double descontar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimirBoleta() {
        System.out.println("BOLETA");
    }

    @Override
    public String toString() {
        return "Comestible{" + "papas=" + papas + '}';
    }
    
}
