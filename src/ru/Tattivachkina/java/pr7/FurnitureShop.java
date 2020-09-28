package ru.Tattivachkina.java.pr7;

import java.util.Arrays;

public class FurnitureShop extends Furniture {
    public Sofa[] sofas;
    public  Table[] tables;

    public FurnitureShop(Sofa[] sofas, Table[] tables) {
        this.sofas = sofas;
        this.tables = tables;
    }

    public Table[] getTables() {
        return tables;
    }

    public void setTables(Table[] tables) {
        this.tables = tables;
    }

    public Sofa[] getSofas() {
        return sofas;
    }

    public void setSofas(Sofa[] sofas) {
        this.sofas = sofas;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "sofas=" + Arrays.toString(sofas) +
                ", tables=" + Arrays.toString(tables) +
                '}';
    }

    @Override
    void buy() {
    }
}
