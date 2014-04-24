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
public class prueba extends Thread {
    public static void main(String[] arg){
    Thread t1 = new Thread();
    Thread t2 = new Thread();
    
    t1.setName("primero");
    t2.setName("Segundo");
    
    t1.start();
    t2.start(); 
    }
    @Override
    public void run(){
        System.out.println("Hola"+Thread.currentThread().getName());
           
            
    }
    }
    

