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
public class TestTarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tarjeta c = new Tarjeta();
       c.setNombre("");
       System.out.println(c.getNombre());
       c.setNumero(3453);
       System.out.println(c.getNumero());
       
    }
    
}
