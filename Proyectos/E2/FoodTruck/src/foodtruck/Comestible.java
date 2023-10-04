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
    public String toString() {
        return "Comestible{" + "papas=" + papas + '}';
    }
    
    @Override
    public int descontar(String formaPago, int unidades){
        int compra = super.obtenerCompra(unidades);
        int descto = (int) (compra * IDescontable.DESCUENTO_COMESTIBLE);
        if (formaPago.equalsIgnoreCase("efectivo")) {
            descto += (int) (compra* IDescontable.DESCUENTO_EFECTIVO);
        }
        return descto;
    }

    @Override
    public String imprimirBoleta(String fpago, int unidades) {
        int total = super.calcularTotal(fpago, unidades);
        String msg = "COMESTIBLE: " + descripcion + " $" + total;
        if (papas) {
            msg += "\n #### INCLUYE PAPITAS ####";
        }
        return msg;
    }
    
    
}
