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
public class desencriptar {     
    private ArrayList<String> vecGrupos=new ArrayList<String>();
    
    /**
     * 
     * @param texto que ha sido enviado de manera encriptada por otro usuario
     * @param longitud de cada subgrupo que utilizo para encriptar
     * @return vecGrpos que contiene los subgrupos ordenados y con los centros
     * variable centros, almacena el conjunto de letras que forman los centros de las palabras
     * se extraen los centros y se obtiene una nueva cadena "texto" que tiene el resto del mensaje
     * se crean los subgrupos de acuerdo a la longitud enviada por el encriptador -1, por los centros eliminados
     * se invierte el valor de cada subgrupo y se insertan los centros
     * se almacena en un una lista, para enviarla al metodo mensaje 
     */
    private ArrayList grupos(String texto, int longitud){     
        int longCentros=texto.length()-(texto.length()/longitud);
        String centros=texto.substring(longCentros, texto.length());        
        String invertir="";
        texto=texto.substring(0, longCentros); 
        int noSubGrupos=texto.length()/(longitud-1);        
        for (int i=0;i<noSubGrupos; i++){
            String grupo=texto.substring(0, longitud-1);
            for(int j=grupo.length()-1;j>=0;j--){
                if(j==(longitud/2)-1){
                    invertir=invertir+centros.charAt(0);
                    invertir=invertir+grupo.charAt(j);
                }else{
                    invertir=invertir+grupo.charAt(j);
                }                
            }
            centros=centros.substring(1);
            vecGrupos.add(i, invertir);
            invertir="";
            texto=texto.substring(longitud-1);
            //System.out.println(vecGrupos.get(i));
        }      
        
        return vecGrupos;
    }
    /**
     * 
     * @param texto encriptado, enviado por un usuuaro
     * @param longitud de los subgrupos, 
     * @return msj union de todas los subgrupos, para generar el mensaje desencriptado
     */
    public String mensaje(String texto,int longitud){
            String msj="";
            ArrayList<String> gruposFnl=grupos(texto, longitud);
            for (int i=0; i<gruposFnl.size();i++){
                msj=msj+gruposFnl.get(i);
            }
        return msj;
    }
    
}


