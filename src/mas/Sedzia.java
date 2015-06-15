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
public class Sedzia {

    private long numerUprawnien;
    private Date dataUzyskaniaUprawnien;

    private Osoba osoba;

    private Sedzia(Osoba osoba, long numerUprawnien, Date dataUzyskaniaUprawnien) throws Exception {
        this.osoba = osoba;
        this.numerUprawnien = numerUprawnien;
        this.dataUzyskaniaUprawnien = dataUzyskaniaUprawnien;
        osoba.setSedzia(this);
    }

    public static Sedzia createSedzia(Osoba osoba, long numerUprawnien, Date dataUzyskaniaUprawnien) throws Exception {
        return new Sedzia(osoba, numerUprawnien, dataUzyskaniaUprawnien);
    }

    public void destroySedzia() {

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
    public String toString() {
        return "Sedzia z uprawnieniami numer " + numerUprawnien + ",które uzyskał dnia " + dataUzyskaniaUprawnien.toString();
    }

}
