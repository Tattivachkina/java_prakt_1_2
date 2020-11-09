package ru.Tattivachkina.java.pr22.ex2;

public class Calendar {
    private String time;
    private String hours;
    private String minutes;

    public Calendar(String time) {
        this.time = time;
        timeCalendar();
    }
    
    public void timeCalendar(){
        String[] str = time.split(">");
        char[] tmp = str[0].toCharArray();
        hours = String.valueOf(tmp[1]) + String.valueOf(tmp[2]);
        tmp = str[1].toCharArray();
        minutes = String.valueOf(tmp[1]) + String.valueOf(tmp[2]);
    }

    @Override
    public String toString() {
        return "Time {" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
