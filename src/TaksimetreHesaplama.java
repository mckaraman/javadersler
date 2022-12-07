import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main (String[]args){
        double km=2.20,acilis=10,katEdilenKm,tutar,odenecekTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilometre yol gittiniz: ");
        katEdilenKm = input.nextDouble();
        tutar = (katEdilenKm*km) + acilis;
        odenecekTutar = tutar<20 ? tutar=20 : tutar;
        System.out.println("Ödemeniz gereken tutar " + odenecekTutar + " ₺ dir");


    }
}
