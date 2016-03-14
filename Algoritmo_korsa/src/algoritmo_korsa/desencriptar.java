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
    
    public String mensaje(String texto,int longitud){
            String msj="";
            ArrayList<String> gruposFnl=grupos(texto, longitud);
            for (int i=0; i<gruposFnl.size();i++){
                msj=msj+gruposFnl.get(i);
            }
        return msj;
    }
    
}


