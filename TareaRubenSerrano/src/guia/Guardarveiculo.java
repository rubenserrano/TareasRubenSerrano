/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia;

/**
 *
 * @author Rubén
 */
import java.util.ArrayList;
import java.io.*;
public class Guardarveiculo {
    
 public static void  guardar(veiculo u) throws Exception{
     ArrayList<veiculo> garage = new ArrayList<veiculo>();
     File file= new File("hola.txxt");
     if(file.exists()){
         garage = leer();
     }
     FileOutputStream fis = new FileOutputStream(file);
     ObjectOutputStream io =new  ObjectOutputStream(fis);
     garage.add(u);
     io.writeObject(garage);
     io.close();
      }
 
 public synchronized static ArrayList<veiculo> leer() throws Exception{
     File file= new File("hola.txxt");
     FileInputStream fil= new FileInputStream(file);
     ObjectInputStream io = new ObjectInputStream(fil);
     ArrayList<veiculo> garage= (ArrayList<veiculo>) io.readObject();
     io.close();
     
     return garage;
 } 
    
}
