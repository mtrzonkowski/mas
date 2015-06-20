/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mtrzonkowski
 */
public class MyObject implements Serializable{
    private static HashMap ekstensje=new HashMap();

    public MyObject() {
        ArrayList ekstensja=null;
        Class klasa=this.getClass();
        if(ekstensje.containsKey(klasa)){
              ekstensja=(ArrayList)ekstensje.get(klasa);
        }
        else{
            ekstensja=new ArrayList();
            ekstensje.put(klasa, ekstensja);
        }
        ekstensja.add(this);
        
    }
   
    public static HashMap getEkstensje(){
        return ekstensje;
    }
    
    
}
