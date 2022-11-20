import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner degergir = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        matematik = degergir.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = degergir.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = degergir.nextInt();
        System.out.print("Turkce Notunuz: ");
        turkce = degergir.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = degergir.nextInt();
        System.out.print("Muzik Notunuz: ");
        muzik = degergir.nextInt();
        //Not Hesaplama
        double toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;
        String gectikaldi = sonuc <60 ? "Ortalamanız " + sonuc + " Kaldınız" : "Ortalamanız " + sonuc + " Geçtiniz";
        System.out.println(gectikaldi);

    }
}