package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadD4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby: ");

        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();

        if (liczba1 > liczba2){
            if(liczba1 > liczba3){
                System.out.println(liczba1);
                if (liczba2 > liczba3){
                    System.out.println(liczba2);
                    System.out.println(liczba3);
                } else {
                    System.out.println(liczba3);
                    System.out.println(liczba2);
                }
            } else {
                System.out.println(liczba3);
                System.out.println(liczba1);
                System.out.println(liczba2);
            }
        } else {
            if(liczba2 > liczba3){
                System.out.println(liczba2);
                if(liczba1 > liczba3){
                    System.out.println(liczba1);
                    System.out.println(liczba3);
                } else {
                    System.out.println(liczba3);
                    System.out.println(liczba1);
                }
            } else {
                System.out.println(liczba3);
                System.out.println(liczba2);
                System.out.println(liczba1);
            }
        }
    }
}
