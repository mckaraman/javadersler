import java.util.Scanner;
public class sinifgecme {
    public static void main(String[]args){
        double mat,kimya,fiz,turkce,muz;
        double ortalama;
        double toplampuan=0,derssayisi=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrencilerimizin Dikkatine!!! 0 ve 100 arasında olmayan notlar ortalamaya dahil edilmeyecektir.");
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = input.nextInt();
        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = input.nextInt();
        if (mat>0&&mat<=100){
            toplampuan+=mat;
            derssayisi++;
        }
        if (kimya>0&&kimya<=100){
            toplampuan+=kimya;
            derssayisi++;
        }
        if (fiz>0&&fiz<=100){
            toplampuan+=fiz;
            derssayisi++;
        }
        if (turkce>0&&turkce<=100){
            toplampuan+=turkce;
            derssayisi++;
        }
        if (muz>0&&muz<=100){
            toplampuan+=muz;
            derssayisi++;
        }
        ortalama=(toplampuan/derssayisi);
        System.out.println("Toplam Puanınız: " + toplampuan);
        System.out.println("Ortalamaya Dahil Edilen Ders Sayısı: " + derssayisi);
        System.out.println("Ortalamanız " + ortalama);
        if (ortalama<55){
            System.out.print("Sınıfta Kaldınız");
        }
        else {
            System.out.println("Sınıfı Geçtiniz");
        }
    }
}
