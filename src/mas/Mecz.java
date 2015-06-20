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
public class Mecz extends MyObject{
    
    private Date dataRozgrywki;
    private int wynik;
    private StanMeczu stanMeczu;
    
    //Asocjacje
    private Druzyna[] druzyny=new Druzyna[2];
    private Sektor sektor;
    private Sedzia sedzia;

    public Mecz(Druzyna druzyna1,Druzyna druzyna2,Date dataRozgrywki, Sektor sektor, Sedzia sedzia) {
        super();
        this.druzyny[0]=druzyna1;
        this.druzyny[1]=druzyna2;
        this.dataRozgrywki = dataRozgrywki;
        this.sektor = sektor;
        setSedzia(sedzia);
        this.stanMeczu=StanMeczu.ZAPLANOWANY;
        this.wynik=-1;
    }

    public Date getDataRozgrywki() {
        return dataRozgrywki;
    }

    public void setDataRozgrywki(Date dataRozgrywki) {
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
        if(this.sedzia!=sedzia && this.sedzia!=null){
            this.sedzia.removeMecz(this);
        }
        this.sedzia = sedzia;
        if(sedzia!=null){
            sedzia.addMecz(this);
        }
    }

    public StanMeczu getStanMeczu() {
        return stanMeczu;
    }

    public void setStanMeczu(StanMeczu stanMeczu) {
        this.stanMeczu = stanMeczu;
    }
    /**
     * Dodawannie drużyny do meczu.
     * @param druzyna
     * @throws Exception 
     */
    public void addDruzyna(Druzyna druzyna) throws Exception{
        if(druzyny[0]!=null && druzyny[1]!=null){
            druzyna.removeMecz(this);
            throw new Exception("W meczu mogą brać udział tylko dwie druzyny");
        }else
        if(druzyny[0]!=null){
            druzyny[1]=druzyna;
        }else{
            druzyny[0]=druzyna;
        }
    }
    
    /**
     * Usuwanie druzyny z meczu.
     * @param druzyna
     * @throws Exception 
     */
    public void removeDruzyna(Druzyna druzyna) throws Exception{
        if(druzyny[1]==druzyna){
            druzyny[1]=null;
        }else
            if(druzyny[0]==druzyna){
                druzyny[0]=null;
            }else throw new Exception ("Druzyna "+druzyna+" nie bierze udziału w meczu");
         
    }
    
    @Override
    public String toString(){
        return druzyny[0]+"-"+druzyny[1]+" "+dataRozgrywki.getDate()+"/"+dataRozgrywki.getMonth()+"/"+dataRozgrywki.getYear()+" "+sektor;
    }
}
