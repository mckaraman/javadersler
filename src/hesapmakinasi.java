import java.util.Scanner;
public class hesapmakinasi {
    public static void main(String[]args){
        double n1,n2;
        int islem;
        Scanner deger = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = deger.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = deger.nextDouble();
        System.out.print("Yapılacak İşlemi Seçiniz : \n 1 - Toplama \n 2 - Çıkarma \n 3 - Çarpma \n 4 - Bölme \n İşlem Numarasını Giriniz: " );
        islem = deger.nextInt();

        switch (islem){
            case 1:
                System.out.println("Yapılan İşlem Toplama İşlemidir ve Sonucunuz : " + (n1+n2));
                break;
            case 2:
                System.out.println("Yapılan İşlem Çıkarma İşlemidir ve Sonucunuz : " + (n1-n2));
                break;
            case 3:
                System.out.println("Yapılan İşlem Çarpma İşlemidir ve Sonucunuz : " + (n1*n2));
                break;
            case 4:
                System.out.println("Yapılan İşlem Bölme İşlemidir ve Sonucunuz : " + (n1/n2));
                break;
            default:
                System.out.println("Yanlış Değer Girildi Tekrar Deneyiniz:");

        }

    }
}
