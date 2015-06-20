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
public class Sedzia extends MyObject{

    private long numerUprawnien;
    private Date dataUzyskaniaUprawnien;

    private Osoba osoba;
    private ArrayList<Mecz> mecze;

    private Sedzia(Osoba osoba, long numerUprawnien, Date dataUzyskaniaUprawnien) throws Exception {
        super();
        this.osoba = osoba;
        this.numerUprawnien = numerUprawnien;
        this.dataUzyskaniaUprawnien = dataUzyskaniaUprawnien;
        osoba.setSedzia(this);
        mecze=new ArrayList<Mecz>();
    }
    /**
     * Tworzy nowy obiekt klasy Sedzia
     * @param osoba
     * @param numerUprawnien
     * @param dataUzyskaniaUprawnien
     * @return
     * @throws Exception 
     */
    public static Sedzia createSedzia(Osoba osoba, long numerUprawnien, Date dataUzyskaniaUprawnien) throws Exception {
        return new Sedzia(osoba, numerUprawnien, dataUzyskaniaUprawnien);
    }
    /**
     * Usuwa referencje na obiekt
     */
    public void destroySedzia() {
        osoba=null;
        mecze.clear();
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public long getNumerUprawnien() {
        return numerUprawnien;
    }

    public void setNumerUprawnien(long numerUprawnien) {
        this.numerUprawnien = numerUprawnien;
    }

    public Date getDataUzyskaniaUprawnien() {
        return dataUzyskaniaUprawnien;
    }

    public void setDataUzyskaniaUprawnien(Date dataUzyskaniaUprawnien) {
        this.dataUzyskaniaUprawnien = dataUzyskaniaUprawnien;
    }

    @Override
    public String toString(){
        return this.getOsoba().getImie()+" "+this.getOsoba().getNazwisko();
    }
    
    public String toStringFull() {
        return this.toString()+" z uprawnieniami numer " + numerUprawnien + ",które uzyskał dnia " + dataUzyskaniaUprawnien.toString();
    }
    /**
     * Dodanie meczu do listy meczy
     * @param mecz 
     */
    public void addMecz(Mecz mecz){
        if(!mecze.contains(mecz)){
            mecze.add(mecz);
            mecz.setSedzia(this);
        }
    }
    
    public ArrayList<Mecz> getMecze() {
        return mecze;
    }

    void removeMecz(Mecz mecz) {
        if(mecze.contains(mecz)){
            mecze.remove(mecz);
            mecz.setSedzia(null);
        }
    }
    
}
