
package projedeneme2;

public class Kisi {
    private String ad;
    private String soyad;
    private String email;
    private long telefonNumarasi;
    
    public Kisi(String ad, String soyad, String email, long telefonNumarasi){
        this.ad=ad;
        this.soyad=soyad;
        this.email=email;
        this.telefonNumarasi=telefonNumarasi;
        
    }
    
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getAd(){
        return ad;
    }
    
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getSoyad(){
        return soyad;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setTelefonNumarasi(long telefonNumarasi){
        this.telefonNumarasi=telefonNumarasi;
    }
    public long getTelefonNumarasi(){
        return telefonNumarasi;
    }
    
    @Override
    public String toString(){
        return ("ad: "+ad+"\n soyad:"+soyad+"\n email: "+email+"\n Tel No: "+telefonNumarasi+"\n");
        
    }
}
