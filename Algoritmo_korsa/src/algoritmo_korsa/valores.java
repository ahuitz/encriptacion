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
    /**
     * 
     * @param tamCad longitud que tiene el texto que se quiere cifra
     * @return cad, es la concatenación de espacios necesarios para que el texto ingresado
     * por el usuario tenga el tamaño adecuado para hacer subgrupos
     * 
     */
    private String criterioSubcadena(int tamCad){
        String cad ="0";
        int residuo;
        residuo=(tamCad%5);        
        if(residuo==0){
            cad="";
        }else{
            residuo=5-residuo;
            for (int i=0; i<residuo-1;i++){                
                cad=cad+"0";
            }
        }
        return cad;
    }
    /**
     * 
     * @param cadena creada para completar el texto original
     * @return cadena es la concatenación de el texto original y la cadena que complementa el texto
     * para poder ser divisible
     */
    public String getCadena(String cadena){        
        cadena=cadena+criterioSubcadena(cadena.length());
        return cadena;
        
    }
}
