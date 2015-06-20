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
public class Druzyna extends MyObject{

    //Atrybuty
    private String nazwa;
    private String opis;
    private Date dataPowstania;
    private Date dataRozwiazania;

    //Asocjacje
    private ArrayList<ZawodnikWDruzynie> zawodnicyWDruzynie;
    private ArrayList<ListaStartowa> listyStartowe;
    private ArrayList<Mecz> mecze;

    public Druzyna(String nazwa, String opis, Date dataPowstania) {
        super();
        this.nazwa = nazwa;
        this.opis = opis;
        this.dataPowstania = dataPowstania;
        zawodnicyWDruzynie = new ArrayList<ZawodnikWDruzynie>();
        listyStartowe = new ArrayList<ListaStartowa>();
        mecze = new ArrayList<Mecz>();
    }

    public String getNazwa() {
        return nazwa;
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

    public ArrayList<ZawodnikWDruzynie> getZawodnicyWDruzynie() {
        return zawodnicyWDruzynie;
    }

    public ArrayList<ListaStartowa> getListyStartowe() {
        return listyStartowe;
    }

    public ArrayList<Mecz> getMecze() {
        return mecze;
    }
    

     public void addZawodnik(Zawodnik zawodnik,Date dataPrzytapienia,String pozycja){
       boolean nieMaAsocjacji = true;
        if(!zawodnicyWDruzynie.isEmpty()){
            for (ZawodnikWDruzynie zawodnikWDruzynie : zawodnicyWDruzynie) {
                if(zawodnikWDruzynie.getZawodnik()==zawodnik && zawodnikWDruzynie.isZawodnikActive()){
                    nieMaAsocjacji=false;
                }
            }
        }
        if(nieMaAsocjacji){
            new ZawodnikWDruzynie(zawodnik, this,dataPrzytapienia,pozycja);
        }
    }
    
    public void removeZawodnik(Zawodnik zawodnik){
        if(!zawodnicyWDruzynie.isEmpty()){
            for (int i=zawodnicyWDruzynie.size()-1;i>-1;i--) {
                if(zawodnicyWDruzynie.get(i).getZawodnik()==zawodnik){
                    zawodnicyWDruzynie.get(i).removeZawodnik();
                    zawodnicyWDruzynie.get(i).removeDruzyna();
                    
                }
            }
        }
    }
    
    public ArrayList<Zawodnik> getZawodnicy(){
        ArrayList<Zawodnik> zawodnicy=new ArrayList<Zawodnik>();
        for(ZawodnikWDruzynie zawodnikWDruzynie : zawodnicyWDruzynie){
            zawodnicy.add(zawodnikWDruzynie.getZawodnik());
        }
        return zawodnicy;
    }
    
    public String printZawodnicy(){
        String output="W drużynie "+this.getNazwa()+" są zawodnicy:\n";
        if(zawodnicyWDruzynie.isEmpty()){
            output+="Brak zawodnikiów\n";
        }else{
            for(ZawodnikWDruzynie zawodnikWDruzynie : zawodnicyWDruzynie){
                output+="\t"+zawodnikWDruzynie.getZawodnik()+"\n";
            }
        }
        return output;
    }

    public void destroyDruzyna(){
        for(int i=zawodnicyWDruzynie.size()-1;i>-1;i--){
            zawodnicyWDruzynie.get(i).destroyZawodnikWDruzynie();
        }

    }

    public void dodajMecz(Mecz mecz) throws Exception {
        if(!mecze.contains(mecz)){
            mecze.add(mecz);
            mecz.addDruzyna(this);
        }
    }
    void removeMecz(Mecz mecz) throws Exception {
        if(mecze.contains(mecz)){
            mecze.remove(mecz);
            mecz.removeDruzyna(this);
        }
    }    
    public void addListaStartowa(ListaStartowa listaStartowa){
        if(!listyStartowe.contains(listaStartowa)){
            listyStartowe.add(listaStartowa);
            listaStartowa.addDruzyna(this);
        };
    }
    public void removeListaStartowa(ListaStartowa listaStartowa){
        if(listyStartowe.contains(listaStartowa)){
            listyStartowe.remove(listaStartowa);
            listaStartowa.removeDruzyna(this);
        }
    }
    
    
    @Override
    public String toString() {
        return this.nazwa;
    }

 

}
