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
public class TestImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imagen bonita = new Imagen();
        bonita.setAlto(-30);
        System.out.println(bonita.getAlto());
        bonita.setAncho(-35);
        System.out.println(bonita.getAncho());
    }
    
}
