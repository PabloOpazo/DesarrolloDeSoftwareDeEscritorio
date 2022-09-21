package jakeo;
import java.util.ArrayList;

public class Jakeo {

    public static void main(String[] args) {
        //coleccio de paises
        ArrayList<String> paises = new ArrayList<> ();
        
        paises.add("Chile");
        paises.add("Perú");
        paises.add("Agentina");
        paises.add("Bolivia");
        System.out.println("paises: "+paises);
        System.out.println("Total de paises: "+paises.size());
        
        //insertar a brasil con indice 2
        paises.add(2, "Brasil");
        System.out.println("paises: "+paises);
        System.out.println("Total de paises: "+paises.size());
        
        //eliminar a peru
        paises.remove("Perú");
        System.out.println("paises: "+paises);
        System.out.println("Total de paises: "+paises.size());
        
        //eliminar por índice
        paises.remove(1);
        System.out.println("paises: "+paises);
        System.out.println("Total de paises: "+paises.size());
        
        //mostrar 1 elemeno de la coleccion
        System.out.println("pais indice 0: " + paises.get(0));
        System.out.println("paises: "+paises);
        System.out.println("Total de paises: "+paises.size());
        
        //eliminar colección
        paises.clear();
        System.out.println("paises: "+paises);
        System.out.println("Total de paises: "+paises.size());
    }
}
