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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Serial {
    
    public  void Escribir(Object s) throws Exception{
        File file= new File("hola.txt");
        FileOutputStream fes= new FileOutputStream(file);
        ObjectOutputStream ac= new ObjectOutputStream(fes);
            
            ac.writeObject(s);
            ac.close();
  System.out.println("Guardado");
            
                
                }
    public Object leer(String nombredelarchivo) throws Exception{
        Object objeto = null;
        File file=new File(nombredelarchivo);
        FileInputStream fs = new FileInputStream(file);
        ObjectInputStream es= new ObjectInputStream(fs);
       
            objeto = es.readObject();
        return objeto;
        }
                
        
    }

    
    
            
    

