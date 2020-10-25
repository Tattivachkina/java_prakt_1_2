package ru.Tattivachkina.java.pr14;

import java.util.Objects;

public class Student implements  Test {
    private int idNum;
    private double number;

    public Student(int idNum, double number) {
        this.idNum = idNum;
        this.number = number;
    }

    public int getidNum() {
        return idNum;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + idNum +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idNum == student.idNum &&
                Double.compare(student.number, number) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNum, number);
    }

    public static void linfind(Test[] test, int number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            if (test[i].getNumber() == number) {
                System.out.println("Линейный поиск: " + number + " это " + (i + 1) + " элемент в массиве ");
                long finish = System.currentTimeMillis();
                long timeConsumedMillis = finish - start;
                System.out.println("Время поиска " + timeConsumedMillis);
                break;
            }
        }
    }

    public static void binfind(Test[] test, int high, int low, double key) {
        long start = System.currentTimeMillis();
        int index = (high + low) / 2;
        while ((test[index].getNumber() != key) && (high <= low)) {
            if (test[index].getNumber() > key) {
                low = index - 1;
            } else if (test[index].getNumber() < key) {
                high = index + 1;
            }
            index = (high + low) / 2;
        }
        if (high <= low) {
            System.out.println("Бинарный поиск: " + key + " это " + ++index + " элемент в массиве");
            long finish = System.currentTimeMillis();
            long timeConsumedMillis = finish - start;
            System.out.println("Время поиска " + timeConsumedMillis);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}