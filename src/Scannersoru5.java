import java.util.Scanner;

public class Scannersoru5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isiiminizi,soyisminizi ve yaşınızı giriniz"+
                "/n Her bilgiden sonra ENTER!a basınız" );
        char isimilkharf=scanner.nextLine().charAt(0);
        String soyisim= scanner.nextLine();
        double yaş= scanner.nextDouble();
        System.out.println("girilen bilgiler:"+isimilkharf+" "+soyisim+","+yaş );
    }

}
