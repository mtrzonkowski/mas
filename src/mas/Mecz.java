/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import javax.xml.crypto.Data;

/**
 *
 * @author mtrzonkowski
 */
public class Mecz extends MyObject{
    
    private Data dataRozgrywki;
    private int wynik;
    private StanMeczu stanMeczu;
    
    //Asocjacje
    private Druzyna[] druzyny=new Druzyna[2];
    private Sektor sektor;
    private Sedzia sedzia;

    public Mecz(Data dataRozgrywki, Sektor sektor, Sedzia sedzia) {
        super();
        this.dataRozgrywki = dataRozgrywki;
        this.sektor = sektor;
        this.sedzia = sedzia;
        this.stanMeczu=StanMeczu.ZAPLANOWANY;
        this.wynik=-1;
    }

    public Data getDataRozgrywki() {
        return dataRozgrywki;
    }

    public void setDataRozgrywki(Data dataRozgrywki) {
        this.dataRozgrywki = dataRozgrywki;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public Druzyna[] getDruzyny() {
        return druzyny;
    }

    public void setDruzyny(Druzyna[] druzyny) {
        this.druzyny = druzyny;
    }

    public Sektor getSektor() {
        return sektor;
    }

    public void setSektor(Sektor sektor) {
        this.sektor = sektor;
    }

    public Sedzia getSedzia() {
        return sedzia;
    }

    public void setSedzia(Sedzia sedzia) {
        this.sedzia = sedzia;
    }

    public StanMeczu getStanMeczu() {
        return stanMeczu;
    }

    public void setStanMeczu(StanMeczu stanMeczu) {
        this.stanMeczu = stanMeczu;
    }
    
}
