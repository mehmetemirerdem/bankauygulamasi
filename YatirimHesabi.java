
package projedeneme2;

public class YatirimHesabi extends BankaHesabi{
    private BankaHesabi hesapTuru;
    
    public YatirimHesabi(double bakiye){
        super(bakiye);
    }
    
    public void setHesapTuru(BankaHesabi hesapTuru){
        this.hesapTuru=hesapTuru;
    }
    public BankaHesabi getHesapTuru(){
        return hesapTuru;
    }
    
    public void paraEkle(BankaHesabi hesapGonderen, BankaHesabi hesapAlici, double miktar){
        double a = hesapGonderen.getBakiye();
        double b = hesapAlici.getBakiye();
        a = a - miktar;
        b = b + miktar;
        hesapGonderen.setBakiye(b);
        hesapAlici.setBakiye(a);
    }
    
    public void paraCek(BankaHesabi hesapGonderen, BankaHesabi hesapAlici, double miktar){
        double a = hesapGonderen.getBakiye();
        double b = hesapAlici.getBakiye();
        a = a - miktar;
        b = b + miktar;
        hesapGonderen.setBakiye(b);
        hesapAlici.setBakiye(a);
    }
    
    @Override
    public String toString(){
        return(super.toString()+"Hesap Turu: Yatirim Hesabi"+"\n");
    }
    
}
