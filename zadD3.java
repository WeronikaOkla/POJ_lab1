package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadD3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = (int) scanner.nextDouble();

        if (liczba == 1){
            System.out.println("Styczen");
        } else if (liczba == 2){
            System.out.println("Luty");
        } else if (liczba == 3){
            System.out.println("Marzec");
        } else if (liczba == 4){
            System.out.println("Kwiecien");
        } else if (liczba == 5){
            System.out.println("Maj");
        } else if (liczba == 6){
            System.out.println("Czerwiec");
        } else if (liczba == 7){
            System.out.println("Lipiec");
        } else if (liczba == 8){
            System.out.println("Sierpien");
        } else if (liczba == 9){
            System.out.println("Wrzesien");
        } else if (liczba == 10){
            System.out.println("Pazdziernik");
        } else if (liczba == 11){
            System.out.println("Listopad");
        } else if (liczba == 12){
            System.out.println("Grudzien");
        } else {
            System.out.println("Taki miesiac nie istnieje");
        }

    }
}
