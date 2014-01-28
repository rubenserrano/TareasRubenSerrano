/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase1;

/**
 *
 * @author ruben
 */
public class TestUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario ruben= new Usuario();
        ruben.setNombre("ruben");
        System.out.println(ruben.getNombre());
        ruben.setEdad(15);
        System.out.println(ruben.getEdad());
    }
    
}
