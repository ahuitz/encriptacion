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
        int residuo;
        residuo=(tamCad%5);        
        if(residuo==0){
            cad="";
        }else{
            residuo=5-residuo;
            for (int i=0; i<residuo-1;i++){
                //cad=cad.concat("0");
                cad=cad+"0";
            }
        }
        return cad;
    }
    public String getCadena(String cadena){        
        cadena=cadena+criterioSubcadena(cadena.length());
        return cadena;
        
    }
}
