
package projedeneme2;

import java.util.ArrayList;

public class BankaPersoneli extends Kisi{
    private long personelID;
    private ArrayList<Musteri> musteriler;
    
    public BankaPersoneli(String ad, String soyad, String email, long telefonNumarasi){
        super(ad,soyad,email,telefonNumarasi);
        
        musteriler = new ArrayList<Musteri>();
        
    }
    // setPersonelID() metodunun olmasının sebebi, rastgele sayı atama işlemi yapılırken bu method yardımıyla personelID değişkenine ulaşılmasıdır.
    public void setPersonelID(long personelID){
        this.personelID=personelID;
    }
    public long getPersonelID(){
        return personelID;
    }
    
    public void setMusteriler(Musteri musteriler){
        this.musteriler.add(musteriler);
    }
    public ArrayList<Musteri> getMusteriler(){
        for(Musteri musteri : musteriler){
            System.out.println("Ad: "+musteri.getAd() +" Soyad: "+ musteri.getSoyad() +" E-mail: "+ musteri.getEmail()+ " Tel No: "+ musteri.getTelefonNumarasi()+ " Musteri No: "+ musteri.getMusteriNumarasi()+ " Hesaplar: "+ musteri.getHesaplar()+ " Kartlar: "+ musteri.getKrediKartlari());
        }
        return musteriler;
    }
    // get Musteriler2() metodunun oluşturulmasının sebebi getMusteriler() ile musteriler arraylistine ulaşırken ekrana yazdırmasının engelleme amacıylakullanılmıştır.
    public ArrayList<Musteri> getMusteriler2(){
        return musteriler;
    }
    
    @Override
    public String toString(){
        return (super.toString()+"Personel ID: "+personelID+"\n Musteriler: "+musteriler+"\n");
        
    }
    
}
