package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe studentow: ");
        int liczbastudentow = (int) scanner.nextDouble();

        System.out.println("Podaj imie studenta: ");
        String student = scanner.next();

        System.out.println("Podaj liczbe punktow: ");
        double punkty = scanner.nextDouble();

        for (int i = 2; i <= liczbastudentow; i++){
            System.out.println("Podaj imie kolejnego studenta studenta: ");
            String student2 = scanner.next();
            System.out.println("Podaj liczbe punktow: ");
            double punkty2 = scanner.nextDouble();

            if (punkty < punkty2){
                student = student2;
                punkty =punkty2;
            }
        }
        System.out.println("Najlepszy student to: " + student);
        System.out.println("Punkty " + punkty);
    }
}
