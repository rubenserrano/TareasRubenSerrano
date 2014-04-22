/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoforma3;

import java.io.Serializable;
import java.io.File;

/**
 *
 * @author campitos
 */
public class Usuario implements Serializable{
private String nombre;
private File archivo;

    public Usuario(String nombre, File archivo) {
        this.nombre = nombre;
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", archivo=" + archivo + '}';
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public File getArchivo() {
        return archivo;
    }
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }   
         
}
