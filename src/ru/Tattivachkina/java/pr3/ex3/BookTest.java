package ru.Tattivachkina.java.pr3.ex3;

public class BookTest {
    public static void main(String[] args) {
        Book book= new Book("Pushkin","Autumn",1812);
        book.setDate(1813);
        book.setAuthor("Ahamatova");
        System.out.println("Автор: "+book.getAuthor()+"\nНазвание: "+ book.getName()+"\nДата: "+book.getDate());
    }
}
