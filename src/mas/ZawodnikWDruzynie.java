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
public class ZawodnikWDruzynie extends MyObject{
    
    
    private Zawodnik zawodnik;
    private Druzyna druzyna;    
    private String pozycja;
    private Date dataPrzystapienia;
    private Date dataOdejscia=null;

    public ZawodnikWDruzynie(Zawodnik zawodnik, Druzyna druzyna,Date dataPrzystapienia, String pozycja) {
        super();
        this.zawodnik = zawodnik;
        this.druzyna = druzyna;
        this.dataPrzystapienia=dataPrzystapienia;
        this.pozycja=pozycja;
        zawodnik.getZawodnikWDrużynie().add(this);
        druzyna.getZawodnicyWDruzynie().add(this);
    } 
    /**
     * Usunięcie referencji na obiekt klasy Zawodnik
     */
    public void removeZawodnik(){
        zawodnik.getZawodnikWDrużynie().remove(this);
        this.zawodnik=null;
    }
    /**
     * Usunięcie referencji na obiekt klasy Druzyna
     */
    public void removeDruzyna(){
        druzyna.getZawodnicyWDruzynie().remove(this);
        this.druzyna=null;
    }
    
    
    public Zawodnik getZawodnik() {
        return zawodnik;
    }

    public void setZawodnik(Zawodnik zawodnik) {
        this.zawodnik = zawodnik;
    }

    public Druzyna getDruzyna() {
        return druzyna;
    }

    public void setDruzyna(Druzyna druzyna) {
        this.druzyna = druzyna;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public Date getDataPrzystapienia() {
        return dataPrzystapienia;
    }

    public void setDataPrzystapienia(Date dataPrzystapienia) {
        this.dataPrzystapienia = dataPrzystapienia;
    }

    public String getDataOdejscia() {
        if(dataOdejscia!=null){
            return zawodnik.toString()+" odszedł z drużyny "+druzyna.toString()+" dnia "+dataOdejscia.toString();
        }else{
            return zawodnik.toString()+" nadal jest w drużynie "+druzyna.toString();
        }
    }

    public void setDataOdejscia(Date dataOdejscia) {
        this.dataOdejscia = dataOdejscia;
    }
    /**
     * Zwraca informacje czy zawodnik jest aktywny.
     * True jeśli zawodnik jest aktywny.
     * False jeśli zawodnik jest nieaktywny.
     * @return 
     */
    public boolean isZawodnikActive(){
        if(dataOdejscia!=null){
            return false;
        }
        else{
            return true;
        }
    }
    
    /**
     * Usunięcie wszystkich referencji tego obiektu jak również na ten obiekt.
     */
    public void destroyZawodnikWDruzynie(){
        removeZawodnik();
        removeDruzyna();
     }
       
}
