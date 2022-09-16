import java.util.Scanner;

public class Vucut_Kitle {

    public static void main(String[] args) {
        double boy,kilo,kitle_endeksi;
        Scanner Input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = Input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        kilo = Input.nextDouble();

        kitle_endeksi = kilo / (boy*boy);

        System.out.println("Vücut kitle endeksiniz:" + kitle_endeksi);




    }
}
