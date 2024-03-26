package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak, który chcesz wpisać: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj liczbę znaków w wierszu: ");
        int IleZnakow = scanner.nextInt();

        System.out.print("Podaj liczbę linii do wydrukowania: ");
        int IleLinii = scanner.nextInt();

        printPattern(znak, IleZnakow,IleLinii);


    }
    private static void printPattern(char znak, int IleZnakow, int IleLinii) {
        for (int i = 0; i < IleLinii; i++) {
            for (int j = 0; j < IleZnakow; j++) {
                System.out.print(znak);
            }
            System.out.println();

            }
        }
    }





