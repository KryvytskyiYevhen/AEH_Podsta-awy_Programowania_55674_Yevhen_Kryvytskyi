package pl.pp;
import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {System.out.println("Witaj PP!");

        Scanner scanner = new Scanner (System.in);
        System.out.println("Proszę padaj swoj wiek w latach:");
        int wiek= scanner.nextInt();
        int wiek_w_sekundach = wiek * 365 * 24 * 60;
        System.out.println("Twój wiek przeliczony na sekundy wunosi:" + wiek_w_sekundach);
        scanner.close();

        int x = 10;
        int dwukrottnosc_x = 2 * x;
        int x_kwadrat = x * x;
        System.out.println("Wartość x:" + x);
        System.out.println("Dwukrotność x: " + dwukrottnosc_x);
        System.out.println("Kwadrat x:" +x_kwadrat);

    }
}
