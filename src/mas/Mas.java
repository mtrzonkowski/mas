/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

import gui.MainForm;
import java.util.Date;

/**
 *
 * @author Michał
 */
public class Mas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Osoba osoba1=new Osoba("Michał", "Trzonkowski", new Date(10,5,1983));
        Sedzia sedzia1=Sedzia.createSedzia(osoba1, 120254,  new Date(10,5,2002));
        
        
        MainForm mform=new MainForm();
        mform.setVisible(true);
    }
    
}
