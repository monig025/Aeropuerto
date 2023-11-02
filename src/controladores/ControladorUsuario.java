/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import java.util.ArrayList;
import modelos.Empleado;
import modelos.Usuario;
import singleton.Singleton;

/**
 *
 * @author gonza
 */
public class ControladorUsuario {
    
    ArrayList <Usuario> lista;

  public ControladorUsuario (){
       lista = Singleton.getInstancia().getListaUsuarios();
      Empleado AdministradorGeneral = new Empleado(1254, "AdministradorGeneral", "3163813780", "administrador@gmail.com",  "12345");
      lista.add(AdministradorGeneral);
  }
   
 
    
    
}
    