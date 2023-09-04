import java.util.Scanner;

public class denemescannersoru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi,soyisminizi ve yasinizi girin"+
                           "/n Her bilgiden sonra ENTER'a basiniz" );
                            char isimIlkharf=scan.nextLine().charAt(0);
                            String soyisim= scan.nextLine();
                            double yas= scan.nextDouble();
        System.out.println("girilen bilgiler:"+isimIlkharf+" "+soyisim+","+yas);


    }
}
