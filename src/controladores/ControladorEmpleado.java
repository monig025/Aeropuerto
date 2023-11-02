/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelos.Empleado;

/**
 *
 * @author gonza
 */
public class ControladorEmpleado {
    
    private ArrayList<Empleado> ListaEmpleados;
    
    public ControladorEmpleado(){
    ListaEmpleados = new ArrayList<>();
}
    public boolean guardarListaEmpleados(Empleado empleado) {
        Empleado aux = buscarListaEmpleados(empleado.getId());
       if(ListaEmpleados.size() >= 0 && ListaEmpleados.size() < 10){
       if (aux == null) {
            ListaEmpleados.add(empleado);
            return true;
        }
       }
        return false;
    }
    
     public Empleado buscarListaEmpleados(int id) {
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            if (id == ListaEmpleados.get(i).getId()) {
                return ListaEmpleados.get(i);
            }
        }
        return null;
    }
     
      public boolean eliminarListaEmpleados(int id) {
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            if (id == ListaEmpleados.get(i).getid()) {
                ListaEmpleados.remove(i);
                return true;
            }
        }
        return false;
    }

}
