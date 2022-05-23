
package projedeneme2;

import java.util.ArrayList;

public class Musteri extends Kisi{
    private long musteriNumarasi;
    private ArrayList<BankaHesabi> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;
    
    public Musteri(String ad, String soyad, String email, long telefonNumarasi){
        super(ad,soyad,email,telefonNumarasi);
        
        hesaplar = new ArrayList<BankaHesabi>();
        krediKartlari = new ArrayList<KrediKarti>();
        
    }
    
    public void setMusteriNumarasi(long musteriNumarasi){
        this.musteriNumarasi=musteriNumarasi;
    }
    public long getMusteriNumarasi(){
        return musteriNumarasi;
    }
    // Bu metoda hesapEkle() metodu varken tam anlamıyla gerek yoktur fakat yorum satırı yapılmak istenmemiştir.
    public void setHesaplar(BankaHesabi hesaplar){
        this.hesaplar.add(hesaplar);
    }
    public ArrayList<BankaHesabi> getHesaplar(){
        return hesaplar;
    }
    // Bu metoda krediKartiEkle() metodu varken tam anlamıyla gerek yoktur fakat yorum satırı yapılmak istenmemiştir.
    public void setKrediKartlari(KrediKarti krediKartlari){
        this.krediKartlari.add(krediKartlari);
        
    }
    public ArrayList<KrediKarti> getKrediKartlari(){
        return krediKartlari;
    }
    
    public void hesapEkle(BankaHesabi hesapTuru){
        hesaplar.add(hesapTuru);
    }
    
    public void krediKartiEkle(KrediKarti kart){
        krediKartlari.add(kart);
    }
    
    public void hesapSil(BankaHesabi hesapTuru){
        hesaplar.remove(hesapTuru);
    }
    
    public void krediKartiSil(KrediKarti kart){
        krediKartlari.remove(kart);
    }
    
    @Override
    public String toString(){
        return(super.toString()+"Musteri Numarasi: "+musteriNumarasi+"\n Hesaplar: "+hesaplar+"\n Kredi Kartlari: "+krediKartlari+"\n");
    }
    
    
}
