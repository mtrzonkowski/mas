package mas;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mtrzonkowski
 */
public class Osoba {
    
    private String imie;
    private String nazwisko;
    private Date datrUrodzenia;
    
    private Zawodnik zawodnik;
    private Sedzia  sedzia;

    public Osoba(String imie, String nazwisko, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.datrUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDatrUrodzenia() {
        return datrUrodzenia;
    }

    public void setDatrUrodzenia(Date datrUrodzenia) {
        this.datrUrodzenia = datrUrodzenia;
    }

    public Zawodnik getZawodnik() {
        return zawodnik;
    }
    public void setSedzia(Sedzia sedzia) throws Exception{
        if(this.sedzia!=null && sedzia!=null){
            throw new Exception("Jedna osoba może być tylko jednym sędziom!!!");
        }else{
            if(sedzia!=null)
                
            
                this.sedzia=sedzia;
        }
    }
    public Sedzia getSedzia() {
        return sedzia;
    }
    
    
    
}
