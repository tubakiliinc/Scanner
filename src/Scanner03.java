import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi,soyisminizi ve yaşınızı girin"+
                           "/nHer bilgiden sonra ENTER'a basınız"  );
        char isimilkharf=scanner.nextLine().charAt(0);
        String soyisim=scanner.nextLine();
        double yaş=scanner.nextDouble();
        System.out.println( "girilen bilgiler:"+" " +"soyisim"+","+"yaş");



    }
}
