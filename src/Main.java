import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutar=0, toplamTutar;


        Scanner inp = new Scanner(System.in);
        System.out.print("Kdv hesaplancak tutarı giriniz: ");
        tutar = inp.nextDouble();
        if (tutar <= 1000 && tutar > 0) {
            kdvTutar = tutar * 0.18;

        } else if (tutar > 1000) {
            kdvTutar = tutar * 0.08;
        } else {
            System.out.println("Yanlis Tutar giridniz:?");
            return;
        }
        toplamTutar = tutar + kdvTutar;


        System.out.println("Kdv Hesaplancak Tutar: " + tutar);

        System.out.println("Kdv Tutar: " + kdvTutar);

        System.out.println("Kdv'li Toplam Tutar: " + toplamTutar);


    }
}