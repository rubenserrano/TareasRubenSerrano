/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoforma3;

import java.io.Serializable;

/**
 *
 * @author campitos
 */
public class Usuario implements Serializable{
String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

   
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre +  '}';
    }
    public Usuario(String nombre) {
        this.nombre = nombre;
        
    }
    
}
