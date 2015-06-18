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
public class ZawodnikProfesjonalista extends Zawodnik {

    private long numerLicencji;
    private Date dataLicencji;
    private String opis;
    private String sponsor;
    
    public ZawodnikProfesjonalista(Osoba osoba, Plec plec, Date dataRejestracji, String rodzajWyposarzenia,long numerLicencji, Date dataLicencji,String opis,String sponsor ) {
        super(osoba, plec, dataRejestracji, rodzajWyposarzenia);
        this.numerLicencji=numerLicencji;
        this.dataLicencji=dataLicencji;
        this.opis=opis;
        this.sponsor=sponsor;
    }

    public long getNumerLicencji() {
        return numerLicencji;
    }

    public void setNumerLicencji(long numerLicencji) {
        this.numerLicencji = numerLicencji;
    }

    public Date getDataLicencji() {
        return dataLicencji;
    }

    public void setDataLicencji(Date dataLicencji) {
        this.dataLicencji = dataLicencji;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    
}
