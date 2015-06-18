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
public class ZawodnikAmator extends Zawodnik {

    private boolean zgodaRodzicow;
    private boolean potrzebnaZgodaRodzicow;

    public ZawodnikAmator(Osoba osoba, Plec plec, Date dataRejestracji, String rodzajWyposarzenia, boolean zgodaRodzicow, boolean potrzebnaZgodaRodzicow) {
        super(osoba, plec, dataRejestracji, rodzajWyposarzenia);
        this.zgodaRodzicow = zgodaRodzicow;
        this.potrzebnaZgodaRodzicow = potrzebnaZgodaRodzicow;
    }

    public ZawodnikAmator(Osoba osoba, Plec plec, Date dataRejestracji, String rodzajWyposarzenia) {
        this(osoba, plec, dataRejestracji, rodzajWyposarzenia, false, false);
    }

    public boolean isZgodaRodzicow() {
        return zgodaRodzicow;
    }

    public void setZgodaRodzicow(boolean zgodaRodzicow) {
        this.zgodaRodzicow = zgodaRodzicow;
    }

    public boolean isPotrzebnaZgodaRodzicow() {
        return potrzebnaZgodaRodzicow;
    }

    public void setPotrzebnaZgodaRodzicow(boolean potrzebnaZgodaRodzicow) {
        this.potrzebnaZgodaRodzicow = potrzebnaZgodaRodzicow;
    }
    
    
}
