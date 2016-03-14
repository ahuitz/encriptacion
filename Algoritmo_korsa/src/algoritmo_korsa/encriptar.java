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
    public ArrayList<String> vecSbCad=new ArrayList<String>();
    
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
    
    public String encriptado(String texto,int longitud){
        String mensaje="";
        ArrayList grupos=grupos(texto, longitud);
        for (int i=0;i<grupos.size();i++){
            mensaje=mensaje+grupos.get(i);
        }
        return mensaje;
    }
}
