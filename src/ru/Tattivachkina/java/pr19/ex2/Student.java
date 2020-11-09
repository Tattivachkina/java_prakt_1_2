package ru.Tattivachkina.java.pr19.ex2;

public class Student {
    private String name;
    private int age;
    private int iDNum;

    public Student(String name, int age, int iDNum) {
        this.name = name;
        this.age = age;
        this.iDNum = iDNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNum=" + iDNum +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getiDNum() {
        return iDNum;
    }

    public boolean compareTo(Student student){
        if (student.getName() == this.getName()) return true;
        else return false;
    }
}
