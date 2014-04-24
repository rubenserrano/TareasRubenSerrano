/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarearubenserrano;

/**
 *
 * @author Rubén
 */
public class test {
    public static void main(String[] args) throws Exception {
      /*  direc contact = new direc("Ruben", "Serrano");
        Serial serial = new Serial();
        serial.Escribir(contact);
        */
        direc contacto = null;
                Serial serial = new Serial();
contacto = (direc) serial.leer("hola.txt");
        System.out.println(contacto.getNombre());
        System.out.println(contacto.getApellido());
    }
}
