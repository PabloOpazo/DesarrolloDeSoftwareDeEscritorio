package empresatransporte;

public class EmpresaTransporte {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(20628750, "Pablo", 'P', 22);
        Encomienda e1 = new Encomienda(c1, "Santiago", 2, true);
        
        e1.etiqueta();
    }
    
}
