package pinksa;

public final class Sobre extends Encomienda {
    private String tamaño;

    public Sobre() {
    }

    public Sobre(String tamaño, String destinatario, int cantidad, String destino, boolean prioritario, String tipo_pago) {
        super(destinatario, cantidad, destino, prioritario, tipo_pago);
        this.setTamaño(tamaño);
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    @Override
    public int precioEncomienda() {
        double precio = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            precio = 1200;
        }
        if (tamaño.equalsIgnoreCase("mediano")) {
            precio = 2000;
        }
        if (tamaño.equalsIgnoreCase("grande")) {
            precio = 4500;
        }
        
        if (prioritario) {
            precio = precio *1.1;
        }
        
        return (super.cantidad * (int) precio);
    }
    
    @Override
    public int valorTotal() {
        int descuento = (int) (precioEncomienda() * DESCUENTO_SOBRE);
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
        System.out.println("TAMAÑO: " + tamaño.toUpperCase());
        System.out.println("--------------------------------");
        System.out.println("total encomienda: $" + precioEncomienda());
        System.out.println("Total a pagar: $" + valorTotal());
    }

    
}
