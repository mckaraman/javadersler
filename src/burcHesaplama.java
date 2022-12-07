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
            System.out.print("Hangi gün doğdunuz 1-31 arasında giriniz : ");
            ay = inp.nextInt();
            if (ay<1||ay>12){
                System.out.print("Yanlış Girdiniz 1-12 arası bir rakam giriniz. \n");
                continue;
            }
            break;
        }
        if (ay==1&&gun>=22){
            System.out.print("Kova Burcusunuz");
        }
        else {
            System.out.print("Oğlak Burcusunuz");
        }
        if (ay==2&&gun>=20){
            System.out.print("Balık Burcusunuz");
        }
        else {
            System.out.print("Kova Burcusunuz");
        }
        if (ay==3&&gun>=21){
            System.out.print("Koç Burcusunuz");
        }
        else {
            System.out.print("Balık Burcusunuz");
        }
        if (ay==4&&gun>=21){
            System.out.print("Boğa Burcusunuz");
        }
        else {
            System.out.print("Koç Burcusunuz");
        }
        if (ay==5&&gun>=22){
            System.out.print("İkizler Burcusunuz");
        }
        else {
            System.out.print("Boğa Burcusunuz");
        }
        if (ay==6&&gun>=23){
            System.out.print("Yengeç Burcusunuz");
        }
        else {
            System.out.print("İkizler Burcusunuz");
        }
        if (ay==7&&gun>=23){
            System.out.print("Aslan Burcusunuz");
        }
        else {
            System.out.print("Yengeç Burcusunuz");
        }
        if (ay==8&&gun>=23){
            System.out.print("Başak Burcusunuz");
        }
        else {
            System.out.print("Aslan Burcusunuz");
        }
        if (ay==9&&gun>=23){
            System.out.print("Terazi Burcusunuz");
        }
        else {
            System.out.print("Başak Burcusunuz");
        }
        if (ay==10&&gun>=23){
            System.out.print("Akrep Burcusunuz");
        }
        else {
            System.out.print("Terazi Burcusunuz");
        }
        if (ay==11&&gun>=22){
            System.out.print("Yay Burcusunuz");
        }
        else {
            System.out.print("Akrep Burcusunuz");
        }
        if (ay==12&&gun>=22){
            System.out.print("Oğlak Burcusunuz");
        }
        else {
            System.out.print("Yay Burcusunuz");
        }
        System.out.println("Burç Yorumları Yakında");
    }
}
