/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

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

    private Zawodnik(Osoba osoba,Plec plec, Date dataRejestracji, String rodzajWyposarzenia) {
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
    
}
