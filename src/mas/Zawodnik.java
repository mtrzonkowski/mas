/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Zawodnik {
    
    private Plec plec;
    private Date dataRejestracji;
    private boolean zawieszenie;
    private String rodzajWyposarzenia;
    
    private Osoba osoba;

    private ArrayList<ZawodnikWDruzynie> zawodnikWDruzynach=new ArrayList<ZawodnikWDruzynie>();
    
    public Zawodnik(Osoba osoba,Plec plec, Date dataRejestracji, String rodzajWyposarzenia) {
        this.osoba = osoba;
        this.plec = plec;
        this.dataRejestracji = dataRejestracji;
        this.rodzajWyposarzenia = rodzajWyposarzenia;
    }
    
    public static Zawodnik createZawodnik(Osoba osoba,Plec plec, Date dataRejestracji, String rodzajWyposarzenia){
         return new Zawodnik(osoba,plec,dataRejestracji,rodzajWyposarzenia);
    }

   

    public Plec getPlec() {
        return plec;
    }

    public Date getDataRejestracji() {
        return dataRejestracji;
    }

    public void setDataRejestracji(Date dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
    }

    public boolean isZawieszenie() {
        return zawieszenie;
    }

    public void setZawieszenie(boolean zawieszenie) {
        this.zawieszenie = zawieszenie;
    }

    public String getRodzajWyposarzenia() {
        return rodzajWyposarzenia;
    }

    public void setRodzajWyposarzenia(String rodzajWyposarzenia) {
        this.rodzajWyposarzenia = rodzajWyposarzenia;
    }
    
    public int getWiek(){
        Date teraz=new Date();
        if((osoba.getDatrUrodzenia().getMonth()>teraz.getMonth())||((osoba.getDatrUrodzenia().getMonth()==teraz.getMonth())&&(osoba.getDatrUrodzenia().getDay()>teraz.getDay()))){
            return osoba.getDatrUrodzenia().getYear()-teraz.getYear()-1;
        }
        else{
            return osoba.getDatrUrodzenia().getYear()-teraz.getYear();
        }
        
    }
    
    public ArrayList<ZawodnikWDruzynie> getZawodnikWDrużynie() {
        return zawodnikWDruzynach;
    }

    public void addDruzyna(Druzyna druzyna) {
        boolean nieMaAsocjacji = true;
        if(!zawodnikWDruzynach.isEmpty()){
            for (ZawodnikWDruzynie zawodnikWDruzynie : zawodnikWDruzynach) {
                if(zawodnikWDruzynie.getDruzyna()== druzyna && zawodnikWDruzynie.isZawodnikActive()){
                    nieMaAsocjacji=false;
                }
            }
        }
        if(nieMaAsocjacji){
            new ZawodnikWDruzynie(this, druzyna);
        }
    }

    public void removeDrużyna(Druzyna druzyna) {
       if(!zawodnikWDruzynach.isEmpty()){
            for (int i=zawodnikWDruzynach.size()-1;i>-1;i--) {
                if(zawodnikWDruzynach.get(i).getDruzyna()==druzyna){
                    zawodnikWDruzynach.get(i).removeDruzyna();
                    zawodnikWDruzynach.get(i).removeZawodnik();
                }
            }
        }
    }
}
