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
        Pole pole1=new Pole("Psie pole", "Gdzieśtam", 10);
        Sektor sektor1=Sektor.createSektor(pole1, "Pumpernikiel", "CAłe zielone", 2, 2);
        
        Druzyna druzyna1= new Druzyna("Kolorowe kredki", "Coś tam coś tam", new Date(1,1,2006));
        Druzyna druzyna2= new Druzyna("Malowane klauny", "Coś tam coś tam", new Date(1,1,2006));
        Druzyna druzyna3= new Druzyna("Wredne małpy", "Coś tam coś tam", new Date(1,1,2006));
        Druzyna druzyna4= new Druzyna("Kizi mizi", "Coś tam coś tam", new Date(1,1,2006));
        
        Osoba osoba1=new Osoba("Michał", "Trzonkowski", new Date(10,5,1983));
        Sedzia sedzia1=Sedzia.createSedzia(osoba1, 120254,  new Date(10,5,2002));
        
        Osoba osoba2=new Osoba("Justyna", "Piątkowska", new Date(10,10,1983));
        Sedzia sedzia2=Sedzia.createSedzia(osoba2, 20154, new Date(5,5,2015));
                
        Osoba osoba3 =new Osoba("Radosław", "Wichrowski", new Date(12,12,1980));
        Sedzia sedzia3=Sedzia.createSedzia(osoba3, 3521456, new Date(1,1,2005));
        
        Mecz mecz1 = new Mecz(druzyna1, druzyna2,new Date(1,7,2015), sektor1, sedzia1);
        Mecz mecz2 = new Mecz(druzyna2, druzyna3,new Date(1,7,2015), sektor1, null);
        Mecz mecz3 = new Mecz(druzyna3, druzyna4,new Date(1,7,2015), sektor1, sedzia2);
        Mecz mecz4 = new Mecz(druzyna4, druzyna1,new Date(1,7,2015), sektor1, null);
        Mecz mecz5 = new Mecz(druzyna4, druzyna2,new Date(1,7,2015), sektor1, sedzia3);
        Mecz mecz6 = new Mecz(druzyna3, druzyna1,new Date(1,7,2015), sektor1, null);
        Mecz mecz7 = new Mecz(druzyna2, druzyna1,new Date(1,7,2015), sektor1, sedzia1);
        Mecz mecz8 = new Mecz(druzyna1, druzyna4,new Date(1,7,2015), sektor1, null);
      
        MainForm mform=new MainForm();
        mform.setVisible(true);
    }
    
}
