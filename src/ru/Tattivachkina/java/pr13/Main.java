package ru.Tattivachkina.java.pr13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> myStudentArrayList = new ArrayList<Student>();

        Student student1 = new Student(4.98, 1);
        Student student2 = new Student(4.0, 2);
        Student student3 = new Student(3.9, 3);

        myStudentArrayList.add(student1);
        myStudentArrayList.add(student2);
        myStudentArrayList.add(student3);


        ArrayList<Student> myStudentArrayList2 = new ArrayList<Student>();

        Student student4 = new Student(4.5, 4);
        Student student5 = new Student(4.7, 5);
        Student student6 = new Student(4.1, 6);

        myStudentArrayList2.add(student4);
        myStudentArrayList2.add(student5);
        myStudentArrayList2.add(student6);

        myStudentArrayList.addAll(myStudentArrayList2);
        SortingStudentsByGPA myStudentComparator = new SortingStudentsByGPA();
        myStudentArrayList.sort(myStudentComparator);

        System.out.println("Sorted: ");
        for (Student h : myStudentArrayList) {
            System.out.println(h);
        }
        SortingStudentsBYIDNum myStudentComparator2 = new SortingStudentsBYIDNum();
        myStudentArrayList.sort(myStudentComparator2);
        System.out.println("Sorted2: ");
        for (Student h : myStudentArrayList) {
            System.out.println(h);
        }
    }
}