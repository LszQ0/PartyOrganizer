package com.excercise;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private Boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, Boolean isVegan) { //constructor
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {       //getter - do pobierania info o gościu
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getVegan() {
        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Phone number " + phoneNumber);
        String isVeganString = isVegan ? "YES" : "NO";
        System.out.println("Is vegan?: " + isVeganString);
        System.out.println();
    }


}
