package dgn;

import java.util.Scanner;

public class Scannercalışma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scanner.nextLine();
        System.out.println("Lütfen soy isnizi giriniz");
        String soyisim= scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        double yas= scanner.nextDouble();
        System.out.println("İsminiz:"+isim);
        System.out.println("Soyisminiz:"+soyisim);
        System.out.println("Yaşınız:"+yas);
        System.out.println("Kaydınız başarı ile tamamlanmıştır");

    }
}
