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
public class valores {
    valores() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
    private String criterioSubcadena(int tamCad){
        String cad ="0";
        int complemento;
        complemento=(tamCad%5);        
        for (int i=0; i<complemento-1;i++){
            cad=cad.concat("0");
        }
        return cad;
    }
    public String texto(String cadena){        
        cadena=cadena+criterioSubcadena(cadena.length());
        return cadena;
        
    }
}
