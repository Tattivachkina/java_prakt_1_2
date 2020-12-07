package ru.Tattivachkina.java.pr22.ex2;

public class Date {
    private String date;
    private String day;
    private String month;
    private String year;

    public Date (String date){
        this.date = date;
        dateCalendar();
    }
    public void dateCalendar () {
        String[] str = date.split(">");
        char[] chars = str[0].toCharArray();
        day = String.valueOf(chars[1]) + String.valueOf(chars[2]);
        chars = str[1].toCharArray();
        month = String.valueOf(chars[1]) + String.valueOf(chars[2]);
        chars = str[2].toCharArray();
        year = String.valueOf(chars[1]) + String.valueOf(chars[2]) + String.valueOf(chars[3]) + String.valueOf(chars[4]);
    }
    @Override
    public String toString() {
        return "Date {" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
