package pinksa;

import java.util.ArrayList;

public class Almacen{
    private  ArrayList<Encomienda> Bodega = new ArrayList<>();
    
    public boolean almacenar(Encomienda nueva){
            Bodega.add(nueva);
            return true;
    }
    
    public String lista() {
        String salida = "";
        for (Encomienda encomienda : Bodega) {
            salida += encomienda.toString();
        }
        return salida;
    }
    

    
    
    
    
    
    
}
