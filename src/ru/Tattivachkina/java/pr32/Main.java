package ru.Tattivachkina.java.pr32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цену, название и описание");
        Scanner in = new Scanner(System.in);
        int cost = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(cost, name, description);
        try (FileWriter fileWriter = new FileWriter("notefile.txt", false)) {
            fileWriter.write(menuItem.toString());
        } catch (IOException e) {
            e.getMessage();
        }
        try (FileReader fileReader = new FileReader("notefile.txt")) {
            System.out.println("Информация из файла");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
