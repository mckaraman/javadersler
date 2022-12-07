import java.util.Scanner;
public class kullanicikontrol {
    public static void main (String[]args){
        String kAdi,sifre,yenisifre,karar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kAdi = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        sifre = inp.nextLine();
        if (kAdi.equals("patika") && sifre.equals("patika123")) {
            System.out.print("Giriş Başarılı");
        }
            else {
                System.out.println("Şifre Hatalı ! Unuttuysanız Değiştirmek İstermisiniz \n 1 - Evet \n 2 - Hayır");
                karar = inp.nextLine();
                switch (karar) {
                    case "1":
                        System.out.print("Yeni Şifrenizi Giriniz: ");
                        yenisifre = inp.nextLine();
                        if (yenisifre.equals("patika123")){
                            System.out.print("Hata!!! Şifreniz Eski Şifrenizle Aynı Olamaz");
                            }
                                else {
                                System.out.println("Şifre Başarıyla Oluşturuldu!!");
                                }
                                break;
                    case "2":
                        System.out.println("Daha sonra tekrar deneyiniz.");
                        break;
                    default:
                        System.out.println("Hatalı Giriş Yaptınız Tekrar Deneyiniz.");
                }

            }


        }

    }
