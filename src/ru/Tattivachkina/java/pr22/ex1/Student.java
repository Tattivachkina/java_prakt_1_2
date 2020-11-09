package ru.Tattivachkina.java.pr22.ex1;

public class Student {
    private String date;

    public Student(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString(String str) {
        String[] words = date.split("/");
        char[] tmp = words[2].toCharArray();
        if (str.equals("1")){
            return words[0] + "/" + words[1] + "/" + tmp[2] + tmp[3];
        }
        if (str.equals("2")){
            return words[0] + "/" + words[1] + "/" + words[2];
        }
        if (str.equals("3")){
            switch (words[1]){
                case "01" : return words[0] + " января " + words[2];
                case "02" : return words[0] + " февраля " + words[2];
                case "03" : return words[0] + " марта " + words[2];
                case "04" : return words[0] + " апреля " + words[2];
                case "05" : return words[0] + " мая " + words[2];
                case "06" : return words[0] + " июня " + words[2];
                case "07" : return words[0] + " июля " + words[2];
                case "08" : return words[0] + " августа " + words[2];
                case "09" : return words[0] + " сентября " + words[2];
                case "10" : return words[0] + " октбяря " + words[2];
                case "11" : return words[0] + " ноября " + words[2];
                case "12" : return words[0] + " декабря " + words[2];
            }
        }
        return null;
    }
}
