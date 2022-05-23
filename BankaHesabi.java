
package projedeneme2;

public class BankaHesabi {
    private long iban;
    private double bakiye;
    
    public BankaHesabi(double bakiye){
        this.bakiye=bakiye;
        
    }
    
    public void setIban(long iban){
        this.iban=iban;
    }
    public long getIban(){
        return iban;
    }
    
    public void setBakiye(double bakiye){
        this.bakiye=bakiye;
    }
    public double getBakiye(){
        return bakiye;
    }
    
    @Override
    public String toString(){
        return("IBAN: "+iban+"\n Bakiye: "+bakiye+"\n");
    }
}
