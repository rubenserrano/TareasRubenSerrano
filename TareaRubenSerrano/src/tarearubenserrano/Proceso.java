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
public class Proceso extends Thread{
    public Proceso(){
        super();
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() );
        
    }
}
