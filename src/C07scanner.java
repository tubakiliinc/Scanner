import java.util.Scanner;

public class C07scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı1'i giriniz(Tam sayı)");
        int sayı1= scanner.nextInt();
        System.out.println("Sayı2'i giriniz(tam sayı)");
        int sayı2= scanner.nextInt();
        int temp=0;
        temp=sayı2;
        sayı2=sayı1;
        sayı1=temp;
        System.out.println("Sayı1'in yeni degeri:"+sayı2);
        System.out.println("Sayı2'in yyenidegeri:"+sayı2);









    }
}
