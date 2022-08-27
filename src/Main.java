import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        double ortalama;

        System.out.print("Matematik Notunu Giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        muzik = input.nextInt();

        if (matematik < 0 || matematik > 100){
            matematik = 0;
        }else if (fizik < 0 || fizik > 100){
            fizik = 0;
        }else if (turkce < 0 || turkce > 100){
            turkce = 0;
        }else if (kimya < 0 || kimya > 100){
            kimya = 0;
        }else if (muzik < 0 || muzik > 100){
            muzik = 0;
        }

        ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;
        System.out.println(ortalama);
        if (ortalama<55){
            System.out.println("Sınıfta Kaldı");
        }else{
            System.out.println("Sınıfı Geçti");
        }


    }
}
