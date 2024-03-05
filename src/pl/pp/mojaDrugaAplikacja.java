package pl.pp;
import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {System.out.println("Witaj PP!");
        //to je komentarz blokowy
        Scanner scanner = new Scanner (System.in);
        /*
        To jest komentarz blokowy
        może on mieć wiele linii tak, jak tutaj
         */
        System.out.println("Proszę padaj swoje imię:");
        String forename = scanner.nextLine();
        System.out.println("Proszę podaj swoje nazwisko:");
        String surname = scanner.nextLine();
        scanner.close();
        System.out.println("Witaj " + forename + " " + surname);

        double x=10;//utworzenie zmiennej typu double i przypisanie jej wartości 10
        double y=2;
        //Scanner scanner = new Scanner(System.in);
        var result = x + y;
        System.out.println("x + y = " + result);
        result = x - y;
        System.out.println("x - y = " + result);
        result = x * y;
        System.out.println("x * y = " + result);
        result = x / y;
        System.out.println("x / y = " + result);
        result = x % y;
        System.out.println("x % y = " + result);
        System.out.println("Wpisr dwie liczby rozdielone klawiszem Enter:");
        double first = scanner.nextDouble();//prośba o wartości typu double
        double second = scanner.nextDouble();
        System.out.println("x + y = "+ (first + second));
    }
}
