
package projedeneme2;

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
    JButton jbt,jbt2;
    JTextField jtf,jtf2,jtf3,jtf4,jtf7,jtf8;
    JPanel jpnl;
    JLabel jlb,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8;
    JTextArea jtx;
    
    GUI(String s){
        super(s);
        // Panel tanımlandıktan sonra ekranda olan butonlar ve textarea kısmı gözükmemektedir fakat,
        // mouse imleci ile üzerine gelindiğinde ortaya çıkmaktadır. Textarea kısmı neredeyse gözükmemektedir,
        // içerisine yazı yazınca ortaya çıkmaktadır. Sebebinin Panelde kaynaklı olduğu bilinmekte,
        // fakat çözüm bulunamamaktadır.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        jpnl = new JPanel();
        jpnl.setBounds(0, 20, 900, 600);
        jpnl.setLayout(null);
        this.add(jpnl);
        
        jlb = new JLabel("Ad: ");
        jlb.setBounds(30, 20, 50, 30);
        jpnl.add(jlb);
        
        jlb2 = new JLabel("Soyad: ");
        jlb2.setBounds(30, 70, 50, 30);
        jpnl.add(jlb2);
        
        jlb3 = new JLabel("Mail: ");
        jlb3.setBounds(30, 120, 50, 30);
        jpnl.add(jlb3);
        
        jlb4 = new JLabel("Tel No: ");
        jlb4.setBounds(30, 170, 50, 30);
        jpnl.add(jlb4);
        
        jlb5 = new JLabel("Müşteri Ekle Butonu: ");
        jlb5.setBounds(30, 230, 140, 30);
        jpnl.add(jlb5);
        
        jlb6 = new JLabel("Müşteri Bilgileri Butonu: ");
        jlb6.setBounds(30, 290, 140, 30);
        jpnl.add(jlb6);
        
        jlb7 = new JLabel("Adınız Soyadınız: ");
        jlb7.setBounds(30, 400, 140, 30);
        jpnl.add(jlb7);
        
        jlb8 = new JLabel("Öğrenci Numaranız: ");
        jlb8.setBounds(30, 450, 140, 30);
        jpnl.add(jlb8);
        
        jbt = new JButton("Müşteri Ekle");
        jbt.setBounds(220, 250, 130, 30);
        jbt.setActionCommand("musteriekle");
        this.add(jbt);
        
        jbt2 = new JButton("Müşteri Bilgileri");
        jbt2.setBounds(220, 300, 130, 30);
        jbt2.setActionCommand("musteribilgileri");
        this.add(jbt2);
        
        jtf = new JTextField("ad");
        jtf.setBounds(200, 40, 180, 30);
        this.add(jtf);
        
        jtf2 = new JTextField("soyad");
        jtf2.setBounds(200, 90, 180, 30);
        this.add(jtf2);
        
        jtf3 = new JTextField("mail");
        jtf3.setBounds(200, 140, 180, 30);
        this.add(jtf3);
        
        jtf4 = new JTextField("tel no");
        jtf4.setBounds(200, 190, 180, 30);
        this.add(jtf4);
        
        jtf7 = new JTextField("Mehmet Emir ERDEM");
        jtf7.setBounds(200, 420, 180, 30);
        this.add(jtf7);
        
        jtf8 = new JTextField("20360859091");
        jtf8.setBounds(200, 470, 180, 30);
        this.add(jtf8);
        
        jtx = new JTextArea();
        jtx.setBounds(400, 40, 200, 200);
        this.add(jtx);
        
        jbt.addActionListener(this);
        jbt2.addActionListener(this);
        
        this.setSize(900, 620);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        // Butona basıldıktan sonra komut alınmak istenip, main() metodundaki b1, m1 nesnelerine ulaşmak istenmiştir,
        //fakat başarılı olunamamıştır.
        String komut = e.getActionCommand();
        Random rand = new Random();
        BankaPersoneli b2 = new BankaPersoneli("ad","soyad","mail",9999);
        b2.setPersonelID(rand.nextInt(1000));
        if(komut.equals("musteriekle")){
            Musteri m2 = new Musteri(jtf.getText(),jtf2.getText(),jtf3.getText(),Long.parseLong(jtf4.getText()));
            b2.setMusteriler(m2);
        }
        else if(komut.equals("musteribilgileri")){
            jtx.setText(b2.getMusteriler().toString());
        }
    }
    
}
