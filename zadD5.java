package pl.edu.pjwstk.lab1;

import java.util.Random;
import java.util.Scanner;

public class zadD5 {
    public static void main(String[] args) {

        System.out.println("Papier=0, Kamien=1, Nozyce=2");

        Random liczba = new Random();
        int los = liczba.nextInt(3);

        Scanner scanner = new Scanner(System.in);
        int gracz = scanner.nextInt();

        if (los == gracz){
            System.out.println("Remis");
        } else {
            if (los == 0){
                if (gracz == 1){
                    System.out.println("Przgrales");
                } else {
                    System.out.println("Wygrales");
                }
            } else if (los == 1){
                if (gracz == 2){
                    System.out.println("Przgrales");
                } else {
                    System.out.println("Wygrales");
                }
            } else {
                if (gracz == 0){
                    System.out.println("Przgrales");
                } else {
                    System.out.println("Wygrales");
                }
            }
        }

        System.out.println("Komputer: " + los);

    }
}
