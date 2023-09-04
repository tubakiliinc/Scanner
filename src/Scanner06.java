import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz");
        double yarıcap= scanner.nextDouble();
        System.out.println("Çemberin çevresi"+2*3.14*yarıcap);
        System.out.println("Dairenin alanı:"+3.14*yarıcap*yarıcap);

    }
}
