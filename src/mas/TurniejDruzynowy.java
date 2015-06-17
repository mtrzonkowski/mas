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

    public TurniejDruzynowy(String naywa, Date dataRozpoczecia, Date dataZakonczenia, ProfTyp typProfesjonalizmu) {
        super(naywa, dataRozpoczecia, dataZakonczenia, typProfesjonalizmu);
    }
    
}
