import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double mat,kim,fiz,turk,tar,muz;
        double notOrt;
        Scanner inp = new Scanner(System.in);
        System.out.println("Notlarınızı verilen sırada giriniz: matematik,kimya,fizik,türkçe,tarih,müzik:");
        mat = inp.nextDouble();
        kim= inp.nextDouble();
        fiz =inp.nextDouble();
        turk = inp.nextDouble();
        tar = inp.nextDouble();
        muz = inp.nextDouble();

        notOrt= (mat + tar + fiz + turk + kim + muz) / 6 ;

        System.out.println("ortalamanız" + notOrt);

boolean sonuc = notOrt > 60;

        String str = sonuc ? "Sınıfı geçti." : "Sınıfta kaldı.";

        System.out.println(str);





    }
}