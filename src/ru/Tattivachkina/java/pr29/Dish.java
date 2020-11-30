package ru.Tattivachkina.java.pr29;

public final class Dish {
    private String description;

    public Dish(String description) {
        try {
            this.description = description;
        } catch (IllegalArgumentException e) {
            if (description==null) {
                e.printStackTrace();
            }
        }
    }
}
