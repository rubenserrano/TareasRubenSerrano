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
public class text {
    public static void main(String[] args) throws Exception{
        veiculo as= new veiculo("ford", "negro", "4000");
        Guardarveiculo.guardar(as);
        
        
        for (veiculo ve : Guardarveiculo.leer()){
           System.out.println(ve);
       }
        
      
       }
    }

