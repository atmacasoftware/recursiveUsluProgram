import java.util.Scanner;

public class Main {

    //Recursive metodun tanımlanması
    static int usHesapla(int taban, int us){

        if(us == 0 || taban == 1){
            return 1;
        } else{
            return taban * usHesapla(taban, us-1);
        }
    }

    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int taban, us;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerlerin alınması
        System.out.print("Taban sayısını giriniz : ");
        taban = input.nextInt();

        System.out.print("Üs sayısını giriniz : ");
        us = input.nextInt();

        //İşlem sonucunun yazdırılması
        System.out.println(taban + " üzeri " + us + " ifadesinin değeri : "  + usHesapla(taban, us));

    }
}