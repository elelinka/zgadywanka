package com.example.guess;

import java.util.Scanner;

public class GuessNumber {

    public void play() {
        System.out.println("Podaj liczbe");
        Scanner input = new Scanner(System.in);

        while (true) {
            int userNumber = input.nextInt();
            input.nextLine();
            if (!isInRange(userNumber)) {
                System.out.println("Podana liczba jest spoza zakresu. Probuj dalej.");

            } else if (isInRange(userNumber) && !isDividedByThree(userNumber)) {
                System.out.println("Podana liczba nie jest podzielna przez 3. Probuj dalej.");

            } else {
                System.out.println("Liczba trafiona!");
                break;
            }
        }
        input.close();
    }

    private boolean isInRange(int number) {
        return number >= 100 && number <= 200;
    }

    private boolean isDividedByThree(int number) {
        return number % 3 == 0;
    }
}
