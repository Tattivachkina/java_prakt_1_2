package ru.Tattivachkina.java.pr24.ex3;

public class Shirt {

    private String idNumber, name, color, size;

    Shirt(String arr){
        try {
            String[] tmp = arr.split(",");
            idNumber = tmp[0];
            name = tmp[1];
            color = tmp[2];
            size = tmp[3];
        }
        catch (Exception e){
            System.out.println("Ошибка ввода данных");
        }
    }
    @Override
    public String toString() {
        return "Shirt{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
