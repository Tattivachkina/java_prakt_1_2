package ru.Tattivachkina.java.pr19.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new  Student[3];
        students[0]= new Student("Сергеев", 19, 12345);
        students[1] = new Student("Иванов", 18, 54321);
        students[2] = new Student("Никитина", 23, 45);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int id = scanner.nextInt();
        Student student = new Student(name, age, id);
        try {
            if (Search(students, student) == true) {
                throw (new Exception());
            } else {
                System.out.println("Found");
            }
        } catch (Exception exe) {
            System.out.println("Not found");
        }
    }
    public static boolean Search(Student[] students, Student student) {
        for (Student student1 : students) {
            if (student1.compareTo(student)) {
                return true;
            }
        }
        return false;
    }
}
