
package projedeneme2;

public class KrediKarti {
    private long kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;
    
    public KrediKarti(double limit, double guncelBorc){
        this.limit=limit;
        this.guncelBorc=guncelBorc;
        
    }
    
    public void setKartNumarasi(long kartNumarasi){
        this.kartNumarasi=kartNumarasi;
    }
    public long getKartNumarasi(){
        return kartNumarasi;
    }
    
    public void setLimit(double limit){
        this.limit=limit;
    }
    public double getLimit(){
        return limit;
    }
    
    public void setGuncelBorc(double guncelBorc){
        this.guncelBorc=guncelBorc;
    }
    public double getGuncelBorc(){
        return guncelBorc;
    }
    
    public void setKullanilabilirLimit(double kullanilabilirLimit){
        this.kullanilabilirLimit=kullanilabilirLimit;
    }
    public double getKullanilabilirLimit(){
        return kullanilabilirLimit;
    }
    
    @Override
    public String toString(){
        return("Kart No: "+kartNumarasi+"\n Limit: "+limit+"\n Borc: "+guncelBorc+"\n Kullanılabilir Limit"+kullanilabilirLimit);
    }
}
