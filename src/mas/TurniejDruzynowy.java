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
public class TurniejDruzynowy extends Turniej{
    
    private int minLiczbaZawodnikow;
    private int maxLiczbaZawodnikow;
    private int liczzbaZawodnikowRezerwowych;

    public TurniejDruzynowy(String naywa, Date dataRozpoczecia, Date dataZakonczenia, ProfTyp typProfesjonalizmu,int minLiczbaZawodnikow,int maxLiczbaZawodnikow,int liczzbaZawodnikowRezerwowych ) {
        super(naywa, dataRozpoczecia, dataZakonczenia, typProfesjonalizmu);
        this.minLiczbaZawodnikow=minLiczbaZawodnikow;
        this.minLiczbaZawodnikow=maxLiczbaZawodnikow;
        this.liczzbaZawodnikowRezerwowych=liczzbaZawodnikowRezerwowych;
    }

    public int getMinLiczbaZawodnikow() {
        return minLiczbaZawodnikow;
    }

    public void setMinLiczbaZawodnikow(int minLiczbaZawodnikow) {
        this.minLiczbaZawodnikow = minLiczbaZawodnikow;
    }

    public int getMaxLiczbaZawodnikow() {
        return maxLiczbaZawodnikow;
    }

    public void setMaxLiczbaZawodnikow(int maxLiczbaZawodnikow) {
        this.maxLiczbaZawodnikow = maxLiczbaZawodnikow;
    }

    public int getLiczzbaZawodnikowRezerwowych() {
        return liczzbaZawodnikowRezerwowych;
    }

    public void setLiczzbaZawodnikowRezerwowych(int liczzbaZawodnikowRezerwowych) {
        this.liczzbaZawodnikowRezerwowych = liczzbaZawodnikowRezerwowych;
    }
    
}
