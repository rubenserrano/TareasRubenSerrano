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
public class Imagen {
    private Integer alto;
    private Integer ancho;
    
    public void setAlto(Integer alto){
    if(alto<0)alto=alto*-1;
    this.alto = alto;
    
}
    public Integer getAlto(){
        return alto;
    }
 public void setAncho(Integer ancho){
     if(ancho<0)ancho=ancho*-1;
     this.ancho=ancho;
 }
 public Integer getAncho(){
     return ancho;
 }

    }

