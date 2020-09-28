package ru.Tattivachkina.java.pr7;

public class Main {
    public static void main(String[] args) {
        Teapot teapot = new Teapot(2,"Metal");
        Plate plate = new Plate(23,"Blue");
        System.out.println(teapot.toString());
        System.out.println(plate.toString());
        Husky husky = new Husky(2,"Bonny");
        Bulldog bulldog = new Bulldog(5,"Grey");
        System.out.println(husky.toString() + "\n"+ bulldog.toString());
        Sofa sofa = new Sofa("Red",5500);
        System.out.println(sofa.toString());
        Sofa[] sofas = new Sofa[2];
        Table[] tables = new Table[2];
        FurnitureShop furnitureShop = new FurnitureShop(sofas, tables);
        tables[0] = new Table(2000,"Brown");
        tables[1] = new Table(1500,"Grey");
        sofas[0] = new Sofa("Red",5500);
        sofas[1] = new Sofa("Black",4000);
        System.out.println(furnitureShop.toString());

    }
}
