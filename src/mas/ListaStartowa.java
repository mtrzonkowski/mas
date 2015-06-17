/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mtrzonkowski
 */
public class ListaStartowa {
    
    private String kategoria;
    
    private Turniej turniej;
    private HashMap<String,Druzyna> druzyny;

    private ListaStartowa( Turniej turniej,String kategoria) {
        this.kategoria = kategoria;
        this.turniej = turniej;
    }
    
    public static ListaStartowa createListaStartowa(Turniej turniej,String kategoria){
        return new ListaStartowa(turniej,kategoria);
    }
    
    public void addDruzyna(Druzyna druzyna){
        if(!druzyny.containsKey(druzyna.getNazwa())){
            druzyny.put(druzyna.getNazwa(), druzyna);
            druzyna.addListaStartowa(this);
        }
    }
    public void removeDruzyna(Druzyna druzyna){
        if(!druzyny.containsKey(druzyna.getNazwa())){
            druzyny.remove(druzyna.getNazwa());
            druzyna.removeListaStartowa(this);
        }
    }
    
    private ArrayList<String> getDruzynyKeys(){
        return (ArrayList)druzyny.keySet();
    }
    
    public String toString(){
        return turniej+" lista "+kategoria;
    }
}
