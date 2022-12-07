import java.util.Scanner;
public class sayiSiralama {
    public static void main(String[]args){
        int sayi1,sayi2,sayi3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = inp.nextInt();
        System.out.print("Üçünücü Sayıyı Giriniz : ");
        sayi3 = inp.nextInt();
        if (sayi1>sayi2&&sayi1>sayi3){
            if (sayi2>sayi3){
                System.out.print("Sıralama : " + (sayi1) + " > " + (sayi2) + " > " + (sayi3));
            }
            else {
                System.out.print("Sıralama : " + (sayi1) + " > " + (sayi3) + " > " + (sayi2));
            }
        }
        else if (sayi2>sayi1&&sayi2>sayi3){
            if (sayi1>sayi3){
                System.out.print("Sıralama : " + (sayi2) + " > " + (sayi1) + " > " + (sayi3));
            }
            else {
                System.out.print("Sıralama : " + (sayi2) + " > " + (sayi3) + " > " + (sayi1));
            }
        }
        else if (sayi3>sayi1&&sayi3>sayi2){
            if (sayi1>sayi2){
                System.out.print("Sıralama : " + (sayi3) + " > " + (sayi1) + " > " + (sayi2));
            }
            else {
                System.out.print("Sıralama : " + (sayi3) + " > " + (sayi2) + " > " + (sayi1));
            }
        }


    }
}
