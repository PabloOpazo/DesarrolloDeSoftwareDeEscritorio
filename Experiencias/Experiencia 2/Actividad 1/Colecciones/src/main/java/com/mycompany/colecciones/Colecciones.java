/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colecciones;

import java.util.ArrayList;

/**
 *
 * @author CETECOM
 */
public class Colecciones {

    public static void main(String[] args) {
        ArrayList<String> coleccion = new ArrayList<>();
        
        coleccion.add("0 Anashe");
        coleccion.add("1 insano");
        coleccion.add("2 eso tilin");
        coleccion.add("3 el pepe");
        coleccion.add("4 aaaaaa");
        coleccion.add("5 NOSEEEEEE");
        coleccion.add("gohan");
        
        System.out.println(coleccion);
        
        //Insertar en la 2da posicion
        coleccion.add(2, "2 cachorro chupetaaao");
        
        System.out.println(coleccion);
        
        //Eliminar un valor (Objeto)
        String eliminao = coleccion.remove(2);
        
        coleccion.remove("2 eso tilin");
        
        //Eliminar valor (Index)
        coleccion.remove(2);
        
        System.out.println("eliminao: " + eliminao);
        System.out.println(coleccion);
        coleccion.add(eliminao);
        System.out.println(coleccion);
        
        //buscar
        System.out.println("contiene a piccolo: " + coleccion.contains("gohan")); //true o false
     
        System.out.println("Indice gohan: "+ coleccion.indexOf("gohan")); //numero de posicion
        System.out.println("Indice vacio: " + coleccion.indexOf("anasheiii"));// -1 = no se encuentra
        
        
        //mostrar el indice 1
        System.out.println("indice 1: " + coleccion.get(1));
        
        //borrar todo y ver q pasa jeje
        coleccion.clear();
        System.out.println(coleccion);
        
                
        
    }
    
}
