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
    
    private String naywa;
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private ProfTyp typProfesjonalizmu;
    
    private static double procentZawodnikowProf=0.6;
    private ArrayList<ListaStartowa> listyStartowe;

    public Turniej(String naywa, Date dataRozpoczecia, Date dataZakonczenia, ProfTyp typProfesjonalizmu) {
        this.naywa = naywa;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.typProfesjonalizmu = typProfesjonalizmu;
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
    
    
    
}
