package ru.Tattivachkina.java.pr22.ex3;

import java.util.Date;

public class Student {
    private Date start;
    private Date finish;

    public void setStart() {
        Date start = new Date();
        long time = start.getTime();
        time = time + (1000 *1000 * (-6));
        start = new Date(time);
        System.out.println("Задание получено: " + start);
    }
    public void setFinish() {
        Date finish = new Date();
        System.out.println("Задание сдано: " + finish);
    }
}
