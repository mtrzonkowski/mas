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
public class TurniejIndywidualny extends Turniej{
    
    private static final int LIMIT_ZAWODNIKOW=1;

    public TurniejIndywidualny(String naywa, Date dataRozpoczecia, Date dataZakonczenia, ProfTyp typProfesjonalizmu) {
        super(naywa, dataRozpoczecia, dataZakonczenia, typProfesjonalizmu);
    }

    public static int getLIMIT_ZAWODNIKOW() {
        return LIMIT_ZAWODNIKOW;
    }
    
}
