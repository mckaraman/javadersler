import java.util.Scanner;
public class burcHesaplama {
    public static void main(String[]args){
        int gun,ay;
        Scanner inp = new Scanner(System.in);
        while (true){
            System.out.print("Hangi gün doğdunuz 1-31 arasında giriniz : ");
            gun = inp.nextInt();
            if (gun<1||gun>31){
                System.out.print("Yanlış Girdiniz 1-31 arası bir rakam giriniz. \n");
                continue;
            }
            break;
        }
        while (true){
            System.out.print("Hangi ay doğdunuz 1-12 arasında giriniz : ");
            ay = inp.nextInt();
            if (ay<1||ay>12){
                System.out.print("Yanlış Girdiniz 1-12 arası bir rakam giriniz. \n");
                continue;
            }
            break;
        }
        if (ay==1){
            if (gun>=22) {
                System.out.print("Kova Burcusunuz");
            }
            else {
                System.out.print("Oğlak Burcusunuz");
            }
        }

        else if (ay==2){
            if (gun>=20) {
                System.out.print("Balık Burcusunuz");
            }
            else {
                System.out.print("Kova Burcusunuz");
            }
        }

        else if (ay==3) {
            if (gun >= 21) {
                System.out.print("Koç Burcusunuz");
            } else {
                System.out.print("Balık Burcusunuz");
            }
        }
        else if (ay==4) {
            if (gun >= 21) {
                System.out.print("Boğa Burcusunuz");
            } else {
                System.out.print("Koç Burcusunuz");
            }
        }
        else if (ay==5) {
            if (gun >= 22) {
                System.out.print("İkizler Burcusunuz");
            } else {
                System.out.print("Boğa Burcusunuz");
            }
        }
        else if (ay==6) {
            if (gun >= 23) {
                System.out.print("Yengeç Burcusunuz");
            } else {
                System.out.print("İkizler Burcusunuz");
            }
        }
        else if (ay==7) {
            if (gun >= 23) {
                System.out.print("Aslan Burcusunuz");
            } else {
                System.out.print("Yengeç Burcusunuz");
            }
        }
        else if (ay==8) {
            if (gun >= 23) {
                System.out.print("Başak Burcusunuz");
            } else {
                System.out.print("Aslan Burcusunuz");
            }
        }
        else if (ay==9) {
            if (gun >= 23) {
                System.out.print("Terazi Burcusunuz");
            } else {
                System.out.print("Başak Burcusunuz");
            }
        }
        else if (ay==10) {
            if (gun >= 23) {
                System.out.print("Akrep Burcusunuz");
            } else {
                System.out.print("Terazi Burcusunuz");
            }
        }
        else if (ay==11) {
            if (gun >= 22) {
                System.out.print("Yay Burcusunuz");
            } else {
                System.out.print("Akrep Burcusunuz");
            }
        }
        else if (ay==12) {
            if (gun >= 22) {
                System.out.print("Oğlak Burcusunuz");
            } else {
                System.out.print("Yay Burcusunuz");
            }
        }
        System.out.println("\n Burç Yorumları Yakında");
    }
}
