/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


/**
 *
 * @author gonza
 */
public class Empleado extends Usuario{
    
     public Empleado(int id, String nombre, String telefono, String email, String password) {
        super(id, nombre, telefono, email, password);
        }
    String cargo;

    public Empleado(String cargo, int id, String nombre, String telefono, String email, String contrasena) {
        super(id, nombre, telefono, email, contrasena);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

     @Override
    public int getId() {
        return id;
    }

     @Override
    public void setId(int id) {
        this.id = id;
    }

     @Override
    public String getNombre() {
        return nombre;
    }

     @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     @Override
    public String getTelefono() {
        return telefono;
    }

     @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

     @Override
    public String getEmail() {
        return email;
    }

     @Override
    public void setEmail(String email) {
        this.email = email;
    }

     @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
   
 
}
