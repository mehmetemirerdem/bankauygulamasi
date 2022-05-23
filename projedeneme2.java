
package projedeneme2;

import java.util.Random;
import java.util.Scanner;

public class projedeneme2{
        
    public static void main(String[] args) {
        // Girdi alan ve rastgele sayı atayan nesneler
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Müşterileri 'musteriler' adlı arraylistte tutabilmek için oluşturulan BankaPersoneli nesnesi
        BankaPersoneli b1 = new BankaPersoneli("bankaPersoneliAd", "bankaPersoneliSoyad", "bankaPersoneliMail", 123456789);
        b1.setPersonelID(rand.nextInt(1000));

        
        // Kullanıcı müşteriden ziyade bir banka personeli olarak düşünülmüştür ve bu mantıkla oluşturulan menuler personel tarafından kullanılıyordur.
        // Kullanıcının switch-caseler arasında gezebilmesi için sonsuz döngü açıp, menuler konmuştur ve bu menuler switch-case yapısı ile oluşturulmuştur.
        boolean a = true;
        while(a){
            System.out.println("*******************************************************************");
            System.out.println("Müşteri eklemek için --> 1");
            System.out.println("Müşterileri listelemek için --> 2");
            System.out.println("Çıkış yapmak için --> 3");
            System.out.println("*******************************************************************");
            // İlk seçimi alması için oluşturulan girdi
            int secim1 = input.nextInt();
            switch(secim1){
                case 1:
                    //DİKKAT
                    // GUI sınıfından bir nesne oluştulup müşteri ekleme ve müşteri bilgilerini görüntüleme işlemlerinin yapılması istenmiştir fakat
                    //oluşturulan nesne istenilenleri tam anlamıyla yapamamaktadır. Buna rağmen, pencere nesnesi haricinde menu girdileri istenildiği gibi çalışmaktadır.
                    // GUI nesnesi aktifken 'setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)' metodundan dolayı 'Çıkış yapmak için --> 3' gibi işlemler düzgün çalışmayabilir,
                    // Dolayısıyla , GUI de istendiği gibi çalışmadığından, GUI nesnesinin yorum satırı yapılıp, programın çalışma daha stabil bir sonuç verecektir.
                    GUI pencere = new GUI("Banka Uygulaması");
                    //DİKKAT
                    System.out.println("*******************************************************************");
                    System.out.println("sırasıyla ad soyad email ve telefon numaranızı giriniz");
                    // Anamenuye her geri dönüldüğünde musteri turunde bir nesne yaratılıp, ilk başta tanımlanan 'b1' adlı BankaPersonelinin musteriler isimli ArrayList kısmına atılmaktadır.
                    Musteri m1 = new Musteri(input.next(), input.next(), input.next(), input.nextLong());
                    m1.setMusteriNumarasi(rand.nextInt(1000000));
                    b1.setMusteriler(m1);
                    // Her bir müşterinin 1 adet vadesiz, 1 adet yatirim hesabı ve 1 adet kredi kartı olabilmektedir.
                    // v1,y1 ve k1 nesnelerine bakiye,limit,guncelBorc parametreleri önceden verilmiştir. Böylelikle para aktarma işlemler para eklemeden de kullanılabilir.
                    VadesizHesap v1 = new VadesizHesap(1000);
                    YatirimHesabi y1 = new YatirimHesabi(1000);
                    KrediKarti k1 = new KrediKarti(1000,400);
                    k1.setKullanilabilirLimit(k1.getLimit()-k1.getGuncelBorc());
                    System.out.println("Müşteri Eklendi!");
                    System.out.println("Müşteri menusune yönlendirildiniz.");
                    System.out.println("*******************************************************************");
                    boolean b = true;
                    while(b){
                        System.out.println("*******************************************************************");
                        System.out.println("Hesap Eklemek için --> 1");
                        System.out.println("Hesap Silmek için --> 2");
                        System.out.println("Kredi Karti Eklemek için --> 3");
                        System.out.println("Kredi Karti Silmek için --> 4");
                        System.out.println("Hesaplar Arası ParaTransferi için --> 5");
                        System.out.println("Kredi Karti Borcu Odemek için --> 6");
                        System.out.println("Şu Anda Bulundugunuz Musterinin Yatirim Hesabina Para Eklemek için --> 7");
                        System.out.println("Şu Anda Bulundugunuz Musterinin Yatirim Hesabindan Para Çekmek için --> 8");
                        System.out.println("Şu Anda Bulundugunuz Musterinin Vadesiz Hesabina Para Yatirmak için --> 9");
                        System.out.println("Musterileri Listelemek için --> 10");
                        System.out.println("Ana Menuye Donmek için --> 0");
                        System.out.println("*******************************************************************");
                        int secim2 = input.nextInt();
                        switch(secim2){
                            case 1:
                                System.out.println("*******************************************************************");
                                System.out.println("Vadesiz Hesap Eklemek için --> 1");
                                System.out.println("Yatirim Hesabi Eklemek için --> 2");
                                System.out.println("*******************************************************************");
                                int secim3 = input.nextInt();
                                switch(secim3){
                                    case 1:
                                        // Yeni Iban atanmasının sebebi farklı hesaplar oluşturulduğunu gösterme amaçlıdır.
                                        v1.setIban(rand.nextInt(1000000000));
                                        m1.hesapEkle(v1);
                                        System.out.println("Vadesiz Hesap Eklendi!");
                                        break;
                                    case 2:
                                        // Yeni Iban atanmasının sebebi farklı hesaplar oluşturulduğunu gösterme amaçlıdır.
                                        y1.setIban(rand.nextInt(1000000000));
                                        m1.hesapEkle(y1);
                                        System.out.println("Yatirim Hesabi Eklendi!");
                                        break;
                                    default:
                                        //Sistem hatalı giriş sonucu bir önceki switch-case yapısına geri göndermektedir.
                                        System.out.println("Hatalı Giriş");
                                }
                                break;
                            case 2:
                                // Hesap Silme işlemi sadece en son eklenen müşteri üzerinde yapılabilmektedir.
                                // Daha önce eklenmiş olan müşteriler üzerinde hesap ekleme veya silme işlemi yapılamamaktadır.
                                System.out.println("*******************************************************************");
                                System.out.println("Vadesiz Hesap Silmek için --> 1");
                                System.out.println("Yatirim Hesabi Silmek için --> 2");
                                System.out.println("*******************************************************************");
                                int secim4 = input.nextInt();
                                switch(secim4){
                                    case 1:
                                        if(v1.getBakiye()>0){
                                            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
                                        }
                                        else if(v1.getBakiye()<0){
                                            System.out.println("Lütfen öncelikle borcunuzu ödeyiniz");
                                        }
                                        else{
                                            m1.hesapSil(v1);
                                            System.out.println("Vadesiz Hesap Silindi!");
                                        }
                                        break;
                                    case 2:
                                        if(y1.getBakiye()>0){
                                            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
                                        }
                                        else if(y1.getBakiye()<0){
                                            System.out.println("Lütfen öncelikle borcunuzu ödeyiniz");
                                        }
                                        else{
                                            m1.hesapSil(y1);
                                            System.out.println("Yatirim Hesabi Silindi!");
                                        }
                                        break;
                                    default:
                                        System.out.println("Hatalı Giriş");
                                }
                                break;
                            case 3:
                                // Her bir müşteriye farklı bir kredi kartı eklendiğini göstermek için yeni kart numarası belirlenmiştir.
                                k1.setKartNumarasi(rand.nextInt(1000000000));
                                m1.krediKartiEkle(k1);
                                System.out.println("Kredi Karti Eklendi!");
                                break;
                            case 4:
                                if(k1.getGuncelBorc()==0){
                                    m1.krediKartiSil(k1);
                                    System.out.println("Kredi Karti Silindi!");
                                }
                                else{
                                    System.out.println("Lütfen öncelikle borç ödemesi yapınız");
                                }
                                break;
                            case 5:
                                // Para Transferi yapılabilmesi için kullanıcının, hangi müşterinin kaçıncı müşteri olduğunu switch yapısındaki case:10 seçeneğiyle kontrol etmeli,
                                // eğer ilk müşteri ise 0, ikinci müşteri ise 1 gibi belirtmelidir. Bu işlem aynı şekilde seçilen müşterinin hesaplarının seçmek için geçerlidir ve şu an ki bulunulan müşterinin
                                // hangi hesabından para aktarmak istendiğini seçmek için de geçerlidir. En son olarak miktar girilir.
                                System.out.println("Sırasıyla, kaçıncı kullanıcıya para aktarmak istediğinizi, hangi hesabına para aktarmak istediğinizi, hangi hesabınızdan para aktarmak istediğinizi ve ne kadar para aktarmak istediğinizi giriniz");
                                v1.paraTransferi(b1.getMusteriler2().get(input.nextInt()).getHesaplar().get(input.nextInt()), m1.getHesaplar().get(input.nextInt()), input.nextDouble());
                                System.out.println("Transfer Yapıldı!");
                                break;
                            case 6:
                                // Hesaplar arası para transferi metoduyla mantık olarak aynıdır, kullanıcı seçilir arraylistte bulunduğu indise göre seçilir, kartı da bulunulan indise göre seçilir ve miktar girilir.
                                System.out.println("Sırasıyla,kaçıncı kullanıcının kartına ulaşmak istediğinizi, kullanıcının hangi kartına ulaşmak istediğinizi ve ödenecek miktarı giriniz");
                                // Burada girdilerin ayrı bir değişkenlerde tutulmasının sebebi, müşterinin borcu ödenirken aynı zamanda müşterinin belirli bir hesabındaki bakiyeden de azaltılma yapılmak istenmesidir.
                                int z = input.nextInt();
                                int x = input.nextInt();
                                double zx = input.nextDouble();
                                v1.krediKartiBorcOdeme(b1.getMusteriler2().get(z).getKrediKartlari().get(x), zx);
                                double eskiBakiye = b1.getMusteriler2().get(z).getHesaplar().get(0).getBakiye();
                                double yeniBakiye = eskiBakiye - zx ;
                                v1.setBakiye(yeniBakiye);
                                System.out.println("Borç Ödeme İşlemi Başarılı!");
                                break;
                            case 7:
                                // Şu anda bulunulan müşteride paraTransferi ile bütün hesaplardan başka bütün hesaplara para aktarılabilir (başka müşteriler dahil),
                                // fakat bu metod Şu anda bulunulan müşterinin vadesiz hesabından, yatirim hesabına istenilen miktarda para aktarmayı sağlar.
                                System.out.println("Yatirim Hesabınıza Vadesiz Hesabınızdan aktarmak istediğiniz miktarı giriniz");
                                y1.paraEkle(b1.getMusteriler2().get(b1.getMusteriler2().indexOf(m1)).getHesaplar().get(m1.getHesaplar().indexOf(y1)), m1.getHesaplar().get(m1.getHesaplar().indexOf(v1)), input.nextDouble());
                                System.out.println("Para Aktarma İşlemi Başarılı!");
                                break;
                            case 8:
                                // Bu method şu anda bulunulan müşteride, müşterinin yatirim hesabından, vadesiz hesabına istenilen miktarda para aktarmayı sağlar.
                                System.out.println("Vadesiz Hesabınıza Yatırım Hesabınızdan aktarmak istediğiniz miktari giriniz");
                                y1.paraCek(m1.getHesaplar().get(m1.getHesaplar().indexOf(v1)), b1.getMusteriler2().get(b1.getMusteriler2().indexOf(m1)).getHesaplar().get(m1.getHesaplar().indexOf(y1)), input.nextDouble());
                                System.out.println("Para Aktarma İşlemi Başarılı!");
                                break;
                            case 9:
                                // Bu kısımda şu anda bulunulan müşterinin vadesiz hesabına istenilen miktarda para yatırma işlemi yapılır.
                                System.out.println("Vadesiz Hesabınıza yatirmak istediğiniz miktarı giriniz");
                                v1.paraYatir(m1.getHesaplar().get(m1.getHesaplar().indexOf(v1)), input.nextDouble());
                                System.out.println("Para Yatırma İşlemi Başarılı!");
                                break;
                            case 10:
                                // Kaydedilmiş müşteriler getMusteriler() yardımıyla konsolda gösterilmektedir.
                                // Ana menu haricinde Kullanıcı menusune de konmasının sebebi, Şu anda bulunulan müşterinin hangi diğer müşteriler ile işlem yapabileceğini görmesi amaçlıdır.
                                System.out.println("*******************************************************************");
                                System.out.println("MÜŞTERİLER");
                                b1.getMusteriler();
                                System.out.println("*******************************************************************");
                                break;
                            case 0:
                                b = false;
                                break;
                            default:
                                System.out.println("Hatalı Giriş");
                        }
                    }
                    break;
                case 2:
                    System.out.println("*******************************************************************");
                    System.out.println("MÜŞTERİLER");
                    b1.getMusteriler();
                    System.out.println("*******************************************************************");
                    break;
                case 3:
                    System.out.println("Çıkış Yapıldı!");
                    a = false;
                    break;
                default:
                    System.out.println("Hatalı Giriş");
            }
        }
    }
}
