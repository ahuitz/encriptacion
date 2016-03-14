/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_korsa;

/**
 *
 * @author Rosario
 */
public class Algoritmo_korsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        valores val=new valores ();
        encriptar encrip=new encriptar();
        //encrip.grupos("ratón que come quesito",5);
        System.out.println(encrip.encriptado("raton que come quesito", 5));
        /*for (int i=0; i<encrip.vecSbCad.size();i++){
            System.out.println(encrip.vecSbCad.get(i));
        }*/       
        
    }
    
}
