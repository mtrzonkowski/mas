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
public class ZawodnikAmator extends Zawodnik{
    
    private boolean zgodaRodzicow;
    private boolean potrzebnaZgodaRodzicow;

    public ZawodnikAmator(Osoba osoba, Plec plec, Date dataRejestracji, String rodzajWyposarzenia) {
        super(osoba, plec, dataRejestracji, rodzajWyposarzenia);
    }
}
