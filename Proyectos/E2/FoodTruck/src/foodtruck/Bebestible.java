package foodtruck;

public class Bebestible extends Producto {
    private double gradosAlcohol;

    public Bebestible() {
    }

    public Bebestible(double gradosAlcohol, int codigo, String descripcion, int precio) {
        super(codigo, descripcion, precio);
        this.setGradosAlcohol(gradosAlcohol);
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    @Override
    public String toString() {
        return "Bebestible{" + "gradosAlcohol=" + gradosAlcohol + '}';
    }
    
    @Override
    public int descontar(String formaPago, int unidades){
        int compra = super.obtenerCompra(unidades);
        int descto = (int) (compra * IDescontable.DESCUENTO_BEBESTIBLE);
        if (formaPago.equalsIgnoreCase("efectivo")) {
            descto += (int) (compra* IDescontable.DESCUENTO_EFECTIVO);
        }
        return descto;
    }

    @Override
    public String imprimirBoleta(String fpago, int unidades) {
        int total = super.calcularTotal(fpago, unidades);
        String msg = "BEBESTIBLE: " + descripcion + " $" + total;
        msg += ", " + gradosAlcohol + "% de alcohol";
        return msg;
    }
    
}
