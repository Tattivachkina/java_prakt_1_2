package ru.Tattivachkina.java.pr24.ex2;

import java.util.StringTokenizer;

public class Address {
    private String country, region, town, street, house, housing, apartment;
    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void addressReturn() {
        try {
            String[] strings = address.split(", ");
            strings[0] = strings[0].trim();
            country = strings[0];
            region = strings[1];
            town = strings[2];
            street = strings[3];
            house = strings[4];
            housing = strings[5];
            strings[6] = strings[6].trim();
            apartment = strings[6];
        } catch (Exception ex) {
            System.out.println("Ошибка ввода данных");
        }
    }

}
