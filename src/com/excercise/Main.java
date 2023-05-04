package com.excercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party party = new Party();


        while (shouldContinue) {
            System.out.println("1. Guest list");
            System.out.println("2. Add guest");
            System.out.println("3. Remove guest");
            System.out.println("4. Meal list");
            System.out.println("5. Find guest by phone number");
            System.out.println("6. Exit");

            System.out.println();
            System.out.println("Choose number");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.removeGuest();
                case 4 -> party.displayMeals();
                case 5 -> party.displayGuestByPhoneNumber();
                case 6 -> shouldContinue = false;
                default -> System.out.println("It's not available number. Try again.");
            }
        }

    }
}
