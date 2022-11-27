import java.util.Scanner;
public class VucutKitle {
    public static void main(String[]args){
        double boy,kilo,index;
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinde Giriniz: ");
        boy = deger.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = deger.nextDouble();
        index = kilo/(boy*boy);
        System.out.print("Vucüt Kitle İndeksiniz " + index);



    }

}
