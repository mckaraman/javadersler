import java.util.Scanner;
public class biletHesaplama {
    public static void main(String[]args){
        double mesafe,yas,tarife=0.10,ucret;
        int tip;
        Scanner inp = new Scanner(System.in);
        System.out.print("Toplam Gidilecek Yolu KM Cinsinden Yazınız : ");
        mesafe = inp.nextDouble();
        System.out.print("Yaşınız : ");
        yas = inp.nextDouble();
        while (true) {
            System.out.print("Yolculuk Tipiniz Nedir \n 1 - Gidiş \n 2 - Gidiş - Dönüş\n");
            tip = inp.nextInt();
            if (tip != 1 && tip != 2) {
                System.out.print("Bilet Tipinizi Yanlış Girdiniz. \n Yolculuk Tipinizi Tekrar Seçiniz. \n 1 - Gidiş \n 2 - Gidiş - Dönüş\n");
                continue;
            }
            break;
        }
        switch (tip){
            case 1 :
                if (yas<12){
                    ucret=(mesafe*tarife)/2;
                    System.out.print("Ödenecek Tutar : " + ucret);

                }
                else if (yas>=12&&yas<=24){
                    ucret=(mesafe*tarife)*0.90;
                    System.out.print("Ödenecek Tutar : " + ucret);
                }
                else if(yas>65){
                    ucret=(mesafe*tarife)*0.70;
                    System.out.print("Ödenecek Tutar : " + ucret);
                }
                else if(yas>24&&yas<65){
                    ucret=(mesafe*tarife);
                    System.out.print("Ödenecek Tutar : " + ucret);
            }
                break;
            case 2 :
                if (yas<12){
                    ucret=(((mesafe*tarife)/2)*0.80)*2;
                    System.out.print("Ödenecek Tutar : " + ucret);

                }
                else if (yas>=12&&yas<=24){
                    ucret=(((mesafe*tarife)*0.90)*0.80)*2;
                    System.out.print("Ödenecek Tutar : " + ucret);
                }
                else if(yas>65){
                    ucret=(((mesafe*tarife)*0.70)*0.80)*2;
                    System.out.print("Ödenecek Tutar : " + ucret);
                }
                else if(yas>24&&yas<65){
                    ucret=(((mesafe*tarife))*0.80)*2;
                    System.out.print("Ödenecek Tutar : " + ucret);
                }
                break;
        }


    }
}
