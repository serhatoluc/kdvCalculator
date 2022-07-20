import java.util.Scanner;

public class kdvCalculator {
    public static void main(String[] args) {
        double tutar, kdv, kdvlitutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Tutarı Giriniz: ");
        tutar = input.nextDouble();

        System.out.println("Girilen Tutar: " + tutar);
        kdv = tutar * 0.18;

        System.out.println("KDV Tutarı: " + kdv);
        kdvlitutar = (tutar + kdv);

        System.out.println("KDV Dahil Genel Toplam: " + kdvlitutar);
    }
}
