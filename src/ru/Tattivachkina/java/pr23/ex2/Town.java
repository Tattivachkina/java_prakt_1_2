package ru.Tattivachkina.java.pr23.ex2;

public class Town {
    private String town;
    private String country;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Town(String town, String country) {
        this.town = town;
        this.country = country;
    }

    @Override
    public String toString() {
        return "town{" +
                "town='" + town + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

