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
public class Sektor extends MyObject {

    private Pole pole;
    private String sektorNazwa;
    private String sektorOpis;
    private int dlugosc;
    private int szerokosc;
    private ArrayList<Mecz> mecze = new ArrayList<Mecz>();

    private Sektor(Pole pole, String sektorNazwa, String sektorOpis, int dlugosc, int szerokosc) throws Exception {
        super();
        this.pole = pole;
        this.sektorNazwa = sektorNazwa;
        this.sektorOpis = sektorOpis;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;

    }

    public static Sektor createSektor(Pole pole, String sektorNazwa, String sektorOpis, int dlugosc, int szerokosc) throws Exception {
        if (pole != null) {
            Sektor sektor = new Sektor(pole, sektorNazwa, sektorOpis, dlugosc, szerokosc);
            pole.addSektor(sektor);
            return sektor;
        } else {
            throw new Exception("Nie można dodać sektora do niczego");
        }
    }

    public void destroySektor() {
        if (!mecze.isEmpty()) {
            for (Mecz mecz : mecze) {
//            mecz.removeSektor();
            }
            mecze.clear();
        }
//        pole
        if (pole.getSektory().contains(this)) {
            pole.removeSektor(this);
        }
        if (!pole.equals(null)) {
            pole = null;
        }
    }

    public Pole getPole() {
        return pole;
    }

    public String getSektorNazwa() {
        return sektorNazwa;
    }

    public String getSektorOpis() {
        return sektorOpis;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    /**
     * Dodaje mecz na sektorze
     * @param mecz 
     */
    public void addMecz(Mecz mecz) {
        if(!mecze.contains(mecz)){
            mecze.add(mecz);
            mecz.setSektor(this);
        }
        
    }

    /**
     * Usuwa mecz na sektorze
     * @param mecz 
     */
    public void removeMecz(Mecz mecz) {
        if(mecze.contains(mecz)){
            mecze.remove(mecz);
            mecz.setSektor(null);
        }    

    }

    public ArrayList getMecze() {
        return mecze;
    }
    /**
     * Wyświetla listę meczy
     * @return 
     */
    public String getListaMeczyString() {
        String output = "Lista meczy";
        if (mecze.isEmpty()) {
            output += " jest pusta";
        } else {
            output += ":\n";
            for (Mecz mecz : mecze) {
                output += mecz.toString() + "\n";
            }
        }
        return output;
    }
    
    @Override
    public String toString() {
        return this.sektorNazwa;
    }
}
