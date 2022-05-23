
package projedeneme2;

public class VadesizHesap extends BankaHesabi{
    private BankaHesabi hesapTuru;
    
    public VadesizHesap(double bakiye){
        super(bakiye);
    }
    
    public void setHesapTuru(BankaHesabi hesapTuru){
        this.hesapTuru=hesapTuru;
    }
    public BankaHesabi getHesapTuru(){
        return hesapTuru;
    }
    
    public void paraTransferi(BankaHesabi hesapGonderen, BankaHesabi hesapAlici, double miktar){
        
        double a = hesapGonderen.getBakiye();
        double b = hesapAlici.getBakiye();
        a = a - miktar;
        b = b + miktar;
        hesapGonderen.setBakiye(b);
        hesapAlici.setBakiye(a);
    }
    
    public void krediKartiBorcOdeme(KrediKarti kart, double odenecekMiktar){
        double d = kart.getGuncelBorc();
        d = d - odenecekMiktar;
        kart.setGuncelBorc(d);
        double e = kart.getKullanilabilirLimit();
        e = e + odenecekMiktar;
        kart.setKullanilabilirLimit(e);
    }
    
    public void paraYatir(BankaHesabi hesapAlici, double miktar){
        double b = hesapAlici.getBakiye();
        b = b + miktar;
        hesapAlici.setBakiye(b);
    }
    
    @Override
    public String toString(){
        return(super.toString()+"Hesap Turu: Vadesiz Hesap"+"\n");
    }
    
}
