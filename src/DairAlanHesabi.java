import java.util.Scanner;
public class DairAlanHesabi {
    public static void main (String[]args){
        int r,aci;
        double pi=3.14,alan,cevre,merkezalan;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap değerini giriniz : ");
        r = input.nextInt();
        System.out.print("Lütfen merkez açı değerini giriniz : ");
        aci = input.nextInt();
        cevre=2*pi*r;
        alan=pi*r*r;
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        merkezalan=(Math.PI*(r*r)*aci) / 360;
        System.out.println("Bu dairenin çevresi : " + cevre);
        System.out.println("Bu dairenin tüm alanı : " + alan);
        System.out.println("Bu dairenin merkez açılı alanı : " + merkezalan);


    }
}
