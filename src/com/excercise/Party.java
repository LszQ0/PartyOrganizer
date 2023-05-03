package com.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private List<Guest> guests = new ArrayList<>(); //potrzebna była zmiana <String> na <Guest>
    Scanner scanner = new Scanner(System.in);

    public void addGuest () {        //definiuje f-cje: nie zwraca nic, tylko dodaje gości
        System.out.println("Write guest's name: ");
        String name = scanner.nextLine();
//        guests.add(name);

        System.out.println("What meal will be brought by the guest?");
        String meal = scanner.nextLine();
//        guests.add(meal);

        System.out.println("What's the guest's phone number?");
        int phoneNumber = Integer.valueOf(scanner.nextLine());    //nextInt po kliknięciu enter aktywuje nastepny nextLine *
//        guests.add(String.valueOf(phoneNumber));  // * scanner.nextInt -> Integer.valueOf(scanner.nextLine())

        System.out.println("Is the guest's vegan? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

            if (isVeganString.equalsIgnoreCase("Y")) {
                isVegan = true;
            } else if (isVeganString.equalsIgnoreCase("N")) {
                isVegan = false;
            } else {
                System.out.println("I assume then, the guest's isn't vegan.");
                isVegan = false;
            }

            Guest guest = new Guest(name, meal, phoneNumber, isVegan);
            guests.add(guest); // doda wszystkie zmienne dotyczące gościa

        }




//    public void removeGuest() {
//        System.out.println("Which guest do you want to remove from the list?");
//        String removeName = scanner.nextLine();
//        guests.remove(removeName);
//    }

//    public List<String> getGuests() {       // definiuje f-cje typu List: zwraca liste gości
//        return guests;                      // rekordy będą pokazane, jeden obok drugiego
//    }

    public void displayGuests() {     // wyświetli gości jeden pod drugim
        for (Guest guest : guests ){       // String guest -> Guest guest
            guest.displayGuestInformation();
        }
    }

}
