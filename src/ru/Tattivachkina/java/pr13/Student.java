package ru.Tattivachkina.java.pr13;

public class Student {
    private double number;
    private int idNum;

    public Student(double number, int idNum) {
        this.number = number;
        this.idNum = idNum;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", idNum=" + idNum +
                '}';
    }
}
