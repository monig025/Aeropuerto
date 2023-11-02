/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelos.Usuario;

/**
 *
 * @author gonza
 */
public class Singleton {

    private static Singleton INSTANCIA = new Singleton();

    private ArrayList<Usuario> ListaUsuario;

    private Singleton() {
        ListaUsuario = leer();
    }

    public static Singleton getInstancia() {
        return INSTANCIA;
    }

    public ArrayList<Usuario> getListaUsuario() {
        return this.ListaUsuario;
    }

    public void escribirObjeto(ArrayList<Usuario> lista) {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("personas.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(lista);
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<Usuario> leer() {
        try {
            FileInputStream archivo
                    = new FileInputStream("personas.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Usuario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    } 

}
