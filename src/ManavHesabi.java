import java.util.Scanner;
public class ManavHesabi {
    public static void main(String[]args){
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5.00,thesap,Armutk,Elmak,Domatesk,Muzk,Patlicank;
        Scanner kilo = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo: ");
        Armutk = kilo.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        Elmak = kilo.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        Domatesk = kilo.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        Muzk = kilo.nextDouble();
        System.out.print("Patlican Kaç Kilo: ");
        Patlicank = kilo.nextDouble();
        thesap=(Muz*Muzk)+(Patlican*Patlicank)+(Domates*Domatesk)+(Elma*Elmak)+(Armut*Armutk);
        System.out.print("Toplam Ödenecek Tutar : " + thesap + " ₺ dir.");


    }
}
