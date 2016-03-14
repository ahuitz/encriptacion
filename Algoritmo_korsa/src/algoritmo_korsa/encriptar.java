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
    ArrayList<String> vecSbCad=new ArrayList<String>();
    
    public ArrayList grupos(String texto){
        valores val=new valores();        
        String invertir="";
        texto=val.getCadena(texto);
        for (int i=0; i<5;i++){
            String sub=texto.substring(0,5);
            for (int j=sub.length()-1; j>=0; j--){
                invertir=invertir+sub.charAt(j);
            }
            vecSbCad.add(i,invertir);
            texto=texto.substring(5);
            invertir="";
            System.out.println(vecSbCad.get(i));
        }
        return vecSbCad;
    }
}
