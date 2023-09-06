package empresatransporte;

public class Encomienda {
    private Cliente cliente;
    private String destino;
    private double peso;
    private boolean prioritaria;

    public Encomienda() {
        cliente = new Cliente();
    }

    public Encomienda(Cliente cliente, String destino, double peso, boolean prioritaria) {
        this.setCliente(cliente);
        this.setDestino(destino);
        this.setPeso(peso);
        this.setPrioritaria(prioritaria);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino.length() > 0) {
            this.destino = destino;
        } else {
            System.out.println("Error, el Destino no puede estar vacío");
            this.destino = null;
            
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPrioritaria() {
        return prioritaria;
    }

    public void setPrioritaria(boolean prioritaria) {
        this.prioritaria = prioritaria;
    }

    @Override
    public String toString() {
        return "Encomienda{" + "cliente=" + cliente + ", destino=" + destino + ", peso=" + peso + ", prioritaria=" + prioritaria + '}';
    }
    
    public double descuento(double precioSinDescuento) {
        double precio = precioSinDescuento;
        if (getCliente().getTipo_cliente() == 'P' || peso < 3) {
            precio = precio * 0.9;
        }
        return precio;
    }
    
    public double precioEncomienda() {
        int precio_bulto = 1500;
        double precio_final = precio_bulto * peso;
        
        if (prioritaria == true) {
            precio_final = (precio_final * 1.1);
        }
        precio_final = descuento( precio_final);
        
        return precio_final;
    }
       
    public void etiqueta() {
        System.out.println("---------------------------------------------");
        System.out.println("               ENCOMIENDA");
        System.out.println("DETALLE CLIENTE");
        System.out.println("    - RUT         : " + getCliente().getRut());
        System.out.println("    - Nombre      : " + getCliente().getNombre());
        System.out.print("    - Tipo Cliente: ");
        
        if (getCliente().getTipo_cliente() == 'P') {
            System.out.println(getCliente().getTipo_cliente() + " (Persona)");
        }
        if (getCliente().getTipo_cliente() == 'E') {
            System.out.println(getCliente().getTipo_cliente() + " (Empresa)");
        }
        
        System.out.println("    - Edad        : " + getCliente().getEdad());
        System.out.println("DETALLE ENCOMIENDA");
        System.out.println("    - Destino     : " + getDestino());
        System.out.println("    - Total       : $" + (int)precioEncomienda());
        System.out.println("---------------------------------------------");
        
        
    }
}
