package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dolnego i górnego limitu liczba całkawita");
        while (true) {

            int dolnagranica = scanner.nextInt();
            int gornagranica = scanner.nextInt();
            int kwadratliczby1 = (dolnagranica * dolnagranica);
            int kwadratliczby2 = (gornagranica * gornagranica);
            int sumaKwadratow = 0;
            for (int i = dolnagranica; i <= gornagranica; i++) {
                sumaKwadratow += i * i;
            }
                System.out.println("Dziękuję! dolna granica wynosi: " + kwadratliczby1 + ", a górna " + kwadratliczby2 + " równa " + sumaKwadratow);
            }
        }

    }*/
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Wybierz operację: 1,2,3,4");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.print("Wybierz numer operacji: ");
            int wybor = scanner.nextInt();
            if (wybor == 5) {
                System.out.println("Koniec programu.");
                break;
            }
            if (wybor < 1 || wybor > 5) {
                System.out.println("Niepoprawny numer operacji. Spróbuj ponownie.");
                continue;
            }
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();
            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();
            double wynik = 0;
            switch (wybor) {
                case 1:
                    wynik = liczba1 + liczba2;
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    break;
                case 4:
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można dzielić przez zero!");
                        continue;
                    }
                    break;
            }
            System.out.println("Wynik: " + wynik);
        }


        }
    }





