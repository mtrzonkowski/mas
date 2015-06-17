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
public enum ProfTyp {
    AMAT(1,"Amatorrski"),
    PROF(2,"Profesjonalny");
    
    public static ProfTyp valueOfProfTypId(int id){
        for(ProfTyp typ:values()){
            if(typ.getId()==id){
                return typ;
            }
        }
        return null;
    }
    
    public static ProfTyp valueOfProfTypName(String name){
        for(ProfTyp typ:values()){
            if(typ.getName().equals(name)){
                return typ;
            }
        }
        throw new  IllegalArgumentException("nie ma typu profesjonalizmu o podanej nazwie");
    }
    
    private final int id;
    private final String name;

    private ProfTyp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
    
}
