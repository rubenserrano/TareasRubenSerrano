/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia;

/**
 *
 * @author ruben
 */
public class Cuenta{
  
     private int id;
     private String nombre;
     private float saldo;
     public void setId(int id){
         this.id=id;
     }
     public int getIn(){
         return id; 
         
     }
     public void setNombre(String nombre){
         this.nombre=nombre;
     }
     public String  getNombre(){
         return nombre;
         
         
     }
     public void setSaldo(float saldo){
         this.saldo=saldo;
     }
     public float geSaldo(){
         return saldo;        
     }
     
    
}
