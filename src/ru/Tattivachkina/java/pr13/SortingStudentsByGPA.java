package ru.Tattivachkina.java.pr13;

import java.util.Comparator;


public class SortingStudentsByGPA implements Comparator <Student> {
    @Override
    public int compare(Student student, Student t1) {
        if (student.getNumber() < t1.getNumber())
            return 1;
        else if (student.getNumber() > t1.getNumber())
            return -1;
        else
            return 0;
    }

}
