/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tarea2;

/**
 *
 * @author ruben
 */
public class Tarjeta {
    private Integer NumeroTarjeta;
    private String NombreCliente;
    
    public Integer getNumero(){
        return NumeroTarjeta;
    }
    public void setNumero(Integer numero){
        
       NumeroTarjeta=numero;
    }
    
    public String getNombre(){
        return  NombreCliente;
    }
    public void setNombre(String nombre){
        if("".equals(nombre))nombre="juan";
        NombreCliente=nombre;
    }
}
