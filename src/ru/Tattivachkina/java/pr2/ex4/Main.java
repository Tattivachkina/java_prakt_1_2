package ru.Tattivachkina.java.pr2.ex4;

public class Main {
    public static void main(String[] args) {
        Dog arr1 = new Dog(1, "Эльза");
        Dog arr2 = new Dog(5, "Шарик");
        Dog arr3 = new Dog(7, "Васька");
        DogsHouse house = new DogsHouse();
        house.addDogs(arr1);
        house.addDogs(arr2);
        house.addDogs(arr3);
        house.Info();
        /*
        dgdfgsdfgsdfgsdfg

         */
    }
}
