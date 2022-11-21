import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[]args){

        double tutar,oran1,oran2;
        Scanner input = new Scanner(System.in);
        oran1=0.18;
        oran2=0.08;
        System.out.print("Lütfen Tutarı Giriniz: ");

        tutar = input.nextInt();
        double kdvorani = tutar>=0&&tutar<=1000 ? oran1 : oran2;
        double kdvtutari = tutar*kdvorani;
        double toplamtutar = kdvtutari+tutar;
        System.out.println("Tutar " + tutar + " ₺ dir.");
        System.out.println("KDV oranı " + kdvorani + " dir");
        System.out.println("KDV tutarı " + kdvtutari + " ₺ dir");
        System.out.println("Toplam ödenecek tutar " + toplamtutar + " ₺ dir.");
    }

}
