package ru.Tattivachkina.java.pr13;

import java.util.Comparator;

public class SortingStudentsBYIDNum implements Comparator <Student> {
    @Override
    public int compare(Student student, Student t1) {
        if (student.getIdNum() > t1.getIdNum())
            return 1;
        else if (student.getIdNum() < t1.getIdNum())
            return -1;
        else
            return 0;
    }
}
