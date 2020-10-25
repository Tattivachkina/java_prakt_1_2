package ru.Tattivachkina.java.pr14;

public class Main {
    public static void main(String[] args) {
        Test[] test = new Student[5];
        test[0] = new Student(1, 4.5);
        test[1] = new Student(2, 3.5);
        test[2] = new Student(3, 4.2);
        test[3] = new Student(4, 4.1);
        test[4] = new Student(5, 5.0);
        Student.linfind(test, 5);
        Student.binfind(test, 1, 5, 5);
    }
}
