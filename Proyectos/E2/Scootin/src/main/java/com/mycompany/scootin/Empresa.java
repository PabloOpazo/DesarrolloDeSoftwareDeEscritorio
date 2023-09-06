package com.mycompany.scootin;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
         listaEmpleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado emp) {
        return listaEmpleados.add(emp);
    }
    
    public boolean buscar(int rut) {
        for (Empleado emp : listaEmpleados) {
            if (emp.getRut() == rut) {
                return true;
            }
        }
        return false;
    }
}
