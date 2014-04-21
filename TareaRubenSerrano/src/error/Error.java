/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package error;

/**
 *
 * @author ruben
 */
public class Error {

    
    public static void main(String []x) {
      int y[]= new int[5];
      y[2]=7;
                            //probemos que los arreblos
                            /*for(int i=0;i<y.length;i++){
                            System.out.println(y[i]);
                           }       */
      
      for(int i:y){
          System.out.println(i);
          
      }
    }
    
}
