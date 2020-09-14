package ru.Tattivachkina.java.pr2.ex4;

public class DogsHouse {

    public Dog[] arr = new Dog[10];
    public int i;

    public void addDogs(Dog arr1) {
        arr[i] = arr1;
        i++;
    }

    public void Info() {
        for (int j = 0; j <= i; j++) {
            if (arr[j] != null) {
                System.out.println(arr[j]);
            }
        }
    }
}
