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
public class Turniej {

    private String nazwa;
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private ProfTyp typProfesjonalizmu;
    private static double procentZawodnikowProf = 0.6;

    private ArrayList<ListaStartowa> listyStartowe;

    public Turniej(String nazwa, Date dataRozpoczecia, Date dataZakonczenia, ProfTyp typProfesjonalizmu) {
        this.nazwa = nazwa;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.typProfesjonalizmu = typProfesjonalizmu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(Date dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(Date dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public ProfTyp getTypProfesjonalizmu() {
        return typProfesjonalizmu;
    }

    public void setTypProfesjonalizmu(ProfTyp typProfesjonalizmu) {
        this.typProfesjonalizmu = typProfesjonalizmu;
    }

    public static double getProcentZawodnikowProf() {
        return procentZawodnikowProf;
    }

    public static void setProcentZawodnikowProf(double procentZawodnikowProf) {
        Turniej.procentZawodnikowProf = procentZawodnikowProf;
    }

    public void addListaStartowa(String kategoria) {
        this.listyStartowe.add(ListaStartowa.createListaStartowa(this,kategoria));

    }

    public void removeListaStartowa() {

    }

    public ArrayList<ListaStartowa> getListyStartowe() {
        return listyStartowe;
    }

}
