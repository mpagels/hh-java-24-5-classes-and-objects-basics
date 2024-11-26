package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("My best chess games", "Bobby Fischer", 150);
        Book book2 = new Book("My worst chess gamges","Martin Pagels", 1500);

        printBook(book);
        printBook(book2);
    }

    public static void printBook(Book book) {
        System.out.println("Das Buch hat den Titel: " + book.title + " Seitenlänge beträgt: " + book.pages + ". Und der Author ist: " + book.author);
    }
}