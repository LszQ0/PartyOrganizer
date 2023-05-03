package com.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyGuests {
    private List<String> guests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest () {        //definiuje f-cje: nie zwraca nic, tylko dodaje gości
        System.out.println("Write guest's name: ");
        String name = scanner.nextLine();
        guests.add(name);
    }

    public void removeGuest() {
        System.out.println("Which guest do you want to remove from the list?");
        String removeName = scanner.nextLine();
        guests.remove(removeName);
    }

//    public List<String> getGuests() {       // definiuje f-cje typu List: zwraca liste gości
//        return guests;                      // rekordy będą pokazane, jeden obok drugiego
//    }

    public void displayGuests() {     // wyświetli gości jeden pod drugim
        for (String guest : guests ){
            System.out.println(guest);
        }
    }

}
