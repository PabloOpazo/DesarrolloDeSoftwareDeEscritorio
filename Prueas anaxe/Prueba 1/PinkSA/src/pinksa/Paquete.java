package pinksa;

public final class Paquete extends Encomienda {
    private double peso;

    public Paquete() {
    }

    public Paquete(double peso, String destinatario, int cantidad, String destino, boolean prioritario, String tipo_pago) {
        super(destinatario, cantidad, destino, prioritario, tipo_pago);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int precioEncomienda() {
        double precio = peso * 1500;
        
        if (prioritario) {
            precio = precio * 1.1;
        }
        return (super.cantidad * (int) precio);
    }
    
    @Override
    public int valorTotal() {
        int descuento = (int) (precioEncomienda() * DESCUENTO_PAQUETE);
        int total = precioEncomienda() - descuento;
        int descuentoEfectivo = (int) (total * DESCUENTO_EFECTIVO);
        
        if (tipo_pago.equalsIgnoreCase("efectivo")) {
            total = total - descuentoEfectivo;
        }
        
        return total;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("     DETALLES ENCOMIENDA");
        System.out.println("DESTINATARIO: " + destinatario);
        System.out.println("CANTIDAD: " + cantidad);
        System.out.println("CIUDAD DE DESTINO: "+ destino);
        if (prioritario) {
            System.out.println("PRIORITARIO: SI");
        } else {
            System.out.println("PRIORITARIO: NO");
        }
        System.out.println("     PAQUETE");
        System.out.println("PESO: " + peso + " kg");
        System.out.println("--------------------------------");
        System.out.println("total encomienda: $" + precioEncomienda());
        System.out.println("Total a pagar: $" + valorTotal());
    }

    
}
