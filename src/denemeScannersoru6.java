import java.util.Scanner;

public class denemeScannersoru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cemberin yaricapini giriniz");
        double yarıcap= scan.nextDouble();
        System.out.println("cemberin cevresi:"+2*3.14*yarıcap);
        System.out.println("Dairenin alanı:"+3.14*yarıcap*yarıcap);
    }
}
