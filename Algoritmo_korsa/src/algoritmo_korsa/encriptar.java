/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_korsa;

import java.util.ArrayList;

/**
 *
 * @author Rosario
 */
public class encriptar {    
    //private String [] vecSbCad=new String[6];
    private ArrayList<String> vecSbCad=new ArrayList<String>();
    /**
     * 
     * @param texto que se quiere cifrar (ingresado por un usuario) y recibido por el metodo public encriptado
     * @param longitud el tamaño (numero de letras) de los subgrupos que se van a realizar
     * @return vecSbCad que cada posicion representa un subgrupo, y la ultima posicion es 
     * la extracción de todos los caracteres del centro.
     */
    public ArrayList grupos(String texto, int longitud){
        valores val=new valores();        
        String invertir="";
        String centros="";        
        texto=val.getCadena(texto);
        for (int i=0; i<longitud;i++){
            String grupo=texto.substring(0,longitud);                        
            centros=centros+grupo.charAt(longitud/2);            
            for (int j=grupo.length()-1; j>=0; j--){
                if(j!=longitud/2){
                    invertir=invertir+grupo.charAt(j);
                }
            }            
            vecSbCad.add(i,invertir);
            texto=texto.substring(longitud);
            invertir="";
            
        }
        vecSbCad.add(vecSbCad.size(), centros);
        return vecSbCad;
    }
    
    /**
     * 
     * @param texto que se va ha cifrar e ingresado por un usuario 
     * @param longitud de los subgrupos que se quieren crear
     * @return mensaje encriptado 
     */
    public String encriptado(String texto,int longitud){
        String mensaje="";
        ArrayList grupos=grupos(texto, longitud);
        for (int i=0;i<grupos.size();i++){
            mensaje=mensaje+grupos.get(i);
        }
        return mensaje;
    }
}
