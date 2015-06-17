/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas;

/**
 *
 * @author mtrzonkowski
 */
public enum Plec {
    WOMEN(1,"Kobieta"),
    MEN(2,"Meżczyzna");
    
    public static Plec valueOfPlecId(int id){
        for(Plec plec : values()){
            if(plec.getPlacId()==id){
                return plec;
            }
        }
        return null;
    }
    
    public static Plec valueOfPlecString(String plecStr){
        for(Plec plec:values()){
            if(plec.getPlacString().equals(plecStr)){
                return plec;
            }
        }
            throw new IllegalArgumentException("Nie można znaleść takiej płci ;-D");
    }
    
    private final int plecId;
    private final String plecString;
    
    private Plec (int plecId,String plecString){
        this.plecId=plecId;
        this.plecString=plecString;
    }
    
    public int getPlacId(){
        return this.plecId;
    }
    
    public String getPlacString(){
        return this.plecString;
    }
    
    @Override
    public String toString(){
        return this.getPlacString();
    }
}
