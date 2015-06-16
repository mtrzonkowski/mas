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
public class Druzyna {
    
    
    //Atrybuty
    
    private String nazwa;
    private String opis;
    private Date dataPowstania;
    private Date dataRozwiazania;
    
    //Asocjacje
    private ArrayList<ZawodnikWdruzynie> zawodnicyWDruzynie;
    private ArrayList<ListaStartowa> listyStartowe;
    private ArrayList<Mecz> mecze;

    public Druzyna(String nazwa, String opis, Date dataPowstania) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.dataPowstania = dataPowstania;
        zawodnicyWDruzynie=new ArrayList<ZawodnikWDruzynie>();
        listyStartowe=new ArrayList<ListaStartowa>();
        mecze= new ArrayList<Mecz>();
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(Date dataPowstania) {
        this.dataPowstania = dataPowstania;
    }

    public Date getDataRozwiazania() {
        return dataRozwiazania;
    }

    public void setDataRozwiazania(Date dataRozwiazania) {
        this.dataRozwiazania = dataRozwiazania;
    }

    public ArrayList<ZawodnikWdruzynie> getZawodnicyWDruzynie() {
        return zawodnicyWDruzynie;
    }

    public ArrayList<ListaStartowa> getListyStartowe() {
        return listyStartowe;
    }

    public ArrayList<Mecz> getMecze() {
        return mecze;
    }
    
    
    //Metody
    
    public void addZawodnik(Zawodnik zawodnik){
        
    }
    public void removeZawodnik(Zawodnik zawodnik){
        
    }
    public void dodajMecz(Mecz mecz){
        
    }
    
    
    
}
