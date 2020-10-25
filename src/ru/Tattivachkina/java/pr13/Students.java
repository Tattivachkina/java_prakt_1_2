package ru.Tattivachkina.java.pr13;

public class Students {
    Student[] students = new Student[3];
    int[] IDNumber = new int[3];
    public Students() {
        students[0] = new Student (4.2, 5);
        students[1] = new Student (5.0, 3);
        students[2] = new Student (3.5,4 );

    }
    public void sortIDNumber() {
        for (int i=0;i<5;i++) {
            IDNumber[i] = students[i].getIdNum();
        }

        for (int i = 0; i < IDNumber.length - 1; i++) {
            for (int j = IDNumber.length - 1; j > i; j--) {
                if (IDNumber[j - 1] > IDNumber[j]) {
                    double tmp = IDNumber[j - 1];
                    IDNumber[j - 1] = IDNumber[j];
                    IDNumber[j] = (int) tmp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(IDNumber[i]+" ");
        }
    }
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int[] IDNumber) {
        this.IDNumber = IDNumber;
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.sortIDNumber();
    }
}
