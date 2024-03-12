package pl.pp;
import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podaj liczby dni:");
        while (true)
        {
            int liczbadni = scanner.nextInt();
            System.out.println("Dziękuję! Podałeś liczbę: " + liczbadni);
            if (liczbadni < 0)
            {
                break;
            }
            int tygodnie = liczbadni / 7;
            int reszta = liczbadni % 7;
            System.out.println("Przekonwertowana liczbadni to " + tygodnie + "tygodni" + reszta + "dni");
        }
        scanner.close();*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach Fahrenheita,pry podanui -1 program skonce dziawać");
        while (true) {
            double Fahrenheit = scanner.nextDouble();
            if (Fahrenheit == -1)
            {
                break;
            }
            double Celsjusz = (Fahrenheit - 32) / 1.8;
            double kelwin = Celsjusz + 273.16;
            System.out.println("Otrzymany wynik to celsjusz " + Celsjusz + " wynik kelwin " + kelwin);
            System.out.println("Prosze podać kolejną wartośżć,ale nie mnij od -1");
        }
    }
}





