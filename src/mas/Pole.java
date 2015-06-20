/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import java.util.ArrayList;

/**
 *
 * @author mtrzonkowski
 */
public class Pole extends MyObject{

    private String nazwa;
    private String adres;
    private int rozmiar;

    private ArrayList<Sektor> sektory = new ArrayList<Sektor>();
    private static ArrayList<Sektor> wszystkieSektory = new ArrayList<Sektor>();

    public Pole(String nazwa, String adres, int rozmiar) {
        super();
        this.nazwa = nazwa;
        this.adres = adres;
        this.rozmiar = rozmiar;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
    
    /**
     * Dodanie obiektu typu sektor
     * @param sektor
     * @throws Exception 
     */
    public void addSektor(Sektor sektor) throws Exception {
        if(wszystkieSektory.contains(sektor)){
            throw new Exception("Sektor "+sektor+" nalezydo "+sektor.getPole());
        }
        wszystkieSektory.add(sektor);
        if (!sektory.contains(sektor)&&sektor.getPole()==null) {
            sektory.add(sektor);
        }

    }
    /**
     * Usuwa obiekt klasy Sektor
     * @param sektor 
     */
    public void removeSektor(Sektor sektor) {
        if (sektory.contains(sektor)) {
            sektory.remove(sektor);
        }
    }

    public ArrayList<Sektor> getSektory() {
        return sektory;
    }
    
    
}
