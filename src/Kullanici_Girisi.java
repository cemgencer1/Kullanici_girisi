import java.util.Scanner;
public class Kullanici_Girisi {
    public static void main(String[]args){
        String userName,password;
        Scanner inp= new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName =inp.nextLine();
        System.out.print("Şifrenizi Giriniz :");
        password =inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş İşleminiz Başarılı .");
            }else {
            System.out.println("Hatalı Kullanıcı Adı yada Şifre Girdiniz.");
            }

    }
}
