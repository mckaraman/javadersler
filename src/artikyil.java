import java.util.Scanner;
public class artikyil {
    public static void main(String[]args){
        int yil,kalan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();
        kalan = yil%4;
        if (kalan==0){
            kalan = yil%100;
            if (kalan==0){
                kalan = yil%400;
                if (kalan==0){
                    System.out.print(yil + " Artık Yıldır");
                }
                else {
                    System.out.print(yil + " Artık Yıl Değildir.");
                }
            }
            else {
                System.out.print(yil + " Artık Yıldır");
            }
        }
        else {
            System.out.println(yil + " Artık Yıl Değildir.");
        }
    }
}
