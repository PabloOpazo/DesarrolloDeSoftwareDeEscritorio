package aerolinea;

public class Pasaje {

    private int numero;
    private Pasajero pasajero;
    private String destino, fecha;
    private int valor, n_asiento;
    private boolean equipaje;

    public Pasaje() {
        pasajero = new Pasajero(); //FK
    }

    public Pasaje(int numero, Pasajero pasajero, String destino, String fecha, int valor, int n_asiento, boolean equipaje) {
        this.setNumero(numero);
        this.setPasajero(pasajero);
        this.setDestino(destino);
        this.setFecha(fecha);
        this.setValor(valor);
        this.setN_asiento(n_asiento);
        this.setEquipaje(equipaje);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor >= 10000) {
            this.valor = valor;
        } else {
            this.valor = 0;
            System.out.println("Error, el pasaje no puede costar menos de $10.000");
        }

    }

    public int getN_asiento() {
        return n_asiento;
    }

    public void setN_asiento(int n_asiento) {
        if (n_asiento >= 1 && n_asiento <= 90) {
            this.n_asiento = n_asiento;
        }
        if (n_asiento == 0) {
            this.n_asiento = n_asiento;
            System.out.println("Error, numero de asiento no registrado");
        }

        if (this.n_asiento <= 0 && this.n_asiento >= 90) {
            this.n_asiento = 0;
            System.out.println("Error, el numero de asiento debe estar entre 1 y 90");
        }

    }

    public boolean isEquipaje() {
        return equipaje;
    }

    public void setEquipaje(boolean equipaje) {
        this.equipaje = equipaje;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "numero=" + numero + ", pasajero=" + pasajero + ", destino=" + destino + ", fecha=" + fecha + ", valor=" + valor + ", n_asiento=" + n_asiento + ", equipaje=" + equipaje + '}';
    }

    public int recargo() {
        int suma = 0;
        if (this.equipaje == true) {
            suma = this.valor * 20 / 100;
        }
        if (this.equipaje == false) {
            suma = 0;
        }
        return suma;
    }

    public void imprimir() {

        int recargo = recargo();

        String eqpje = "";

        if (this.equipaje == true) {
            eqpje = "SI";
        }
        if (this.equipaje == false) {
            eqpje = "NO";
        }
        System.out.println("-----------------------------------");
        System.out.println("PASAJE");
        //System.out.println("Numero de vuelo  : " + this.numero);
        System.out.println("Destino          : " + this.destino);
        System.out.println("Pasajero         : " + this.pasajero);
        //System.out.println("Fecha            : " + this.fecha);
        System.out.println("Valor            : $" + this.valor);
        //System.out.println("Numero de asiento: " + this.n_asiento);
        System.out.println("Equipaje         : " + eqpje);
        System.out.println("Recargo          : $" + recargo);
        System.out.println("A pagar          : $" + (this.valor + recargo));
        if (this.valor == 0) {
            System.out.println("PASAJE INVÁLIDO");
        }
        System.out.println("-----------------------------------");

    }
}
