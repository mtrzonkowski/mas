/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

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
    
     /**
     * Metoda zapisu ekstensji do strumienia wyjściowego.
     *
     * @param wyjscie
     * @throws IOException
     */
    public static void zapiszEkstencje(ObjectOutputStream wyjscie) throws IOException {
        wyjscie.writeObject(ekstensje);
    }

    /**
     * Metoda odczytu ekstensji ze strumienia wejsciowego.
     *
     * @param wejscie
     * @throws Exception
     */
    public static void czytajEkstensje(ObjectInputStream wejscie) throws Exception {
        ekstensje = (HashMap) wejscie.readObject();
    }
}
