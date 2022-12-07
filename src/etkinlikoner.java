import java.util.Scanner;
public class etkinlikoner {
    public static void main(String[]args){
        int derece;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz: ");
        derece = inp.nextInt();
        if (derece<=5){
            System.out.print("Kayak Yapmayı Tercih Edebilirsiinz.");
        }
        else if ((derece>5) && (derece<=15)){
            System.out.print("Sinemaya Gitmenizi Öneririz.");
        }
        else if ((derece>15) && (derece<=25)){
            System.out.print("Pikniğe Gitmenizi Öneririz.");
        }
        else {
            System.out.print("Yüzmeye Gitmenizi Öneririz.");
        }


    }
}
