import java.util.Scanner;

public class Scannerdegerdegistirmeislemi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi1'i giriniz(Tamsayı)");
        int sayi1=scan.nextInt();
        System.out.println("sayi2'yi giriniz(Tamsayı)");
        int sayi2=scan.nextInt();
        int temp=0;
        temp=sayi1;
        sayi1=sayi2;
        sayi2=sayi1;
        System.out.println("sayi1'in yeni degeri"+sayi2);
        System.out.println("sayi2'nin yeni degeri"+sayi1);


    }
}
