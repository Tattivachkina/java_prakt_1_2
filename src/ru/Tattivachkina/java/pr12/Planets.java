package ru.Tattivachkina.java.pr12;

enum Planets {
    Mercury(2, 330),
    Venus (6, 4868),
    Earth(6, 5973),
    Mars (3, 642),
    Jupiter (71, 1898600),
    Saturn (60, 568460),
    Uranus (26, 86832),
    Neptune (24, 102430);

    int radius;
    int mass;
    Planets(int radius, int mass) {
        this.radius = radius;
        this.mass = mass;
    }
}
