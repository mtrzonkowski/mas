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
public enum StanMeczu {
    
    ZAPLANOWANY(1,"Zaplanowany"),
    ZAWIESZONY(2,"Zawieszony"),
    ODWOLANY(3,"Odwołany"),
    ROZPOCZETY(4,"Rozpoczęty"),
    ZAKONCZONY(5,"Zakończony");
    
     public static StanMeczu valueOfStanMeczuId(int id){
        for(StanMeczu stan : values()){
            if(stan.getStanMeczuId()==id){
                return stan;
            }
        }
        return null;
    }
    
    public static StanMeczu valueOfPlecString(String plecStr){
        for(StanMeczu stan:values()){
            if(stan.getStanMeczuString().equals(plecStr)){
                return stan;
            }
        }
            throw new IllegalArgumentException("Nie można znaleść takiego stanu meczu ;-D");
    }
    
    private final int stanId;
    private final String stanString;
    
    private StanMeczu (int stanId,String stanString){
        this.stanId=stanId;
        this.stanString=stanString;
    }
    
    public int getStanMeczuId(){
        return this.stanId;
    }
    
    public String getStanMeczuString(){
        return this.stanString;
    }
    
    @Override
    public String toString(){
        return this.getStanMeczuString();
    }
    
}
