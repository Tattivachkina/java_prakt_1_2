package ru.Tattivachkina.java.pr17;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("note.txt", false)) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException ex) {
            ex.getMessage();
        }

        try (FileReader fileReader = new FileReader("note.txt")) {
            System.out.println("Вывод информации из файла");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }

        try (FileWriter fileWriter2 = new FileWriter("note.txt", false)) {
            System.out.println("Замените информацию");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            fileWriter2.write(str);
            fileWriter2.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
        try (FileWriter fileWriter3 = new FileWriter("note.txt", true)) {
            System.out.println("Добавьте новую информацию");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            fileWriter3.write(str);
            fileWriter3.close();
        } catch (IOException ex) {
            ex.getMessage();
        }

        try (FileReader fileReader2 = new FileReader("note.txt")) {
            System.out.println("Вывод информации из получившегося файла");
            Scanner scanner = new Scanner(fileReader2);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
