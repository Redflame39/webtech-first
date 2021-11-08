package com.makichanov.webtech.task12;

import java.util.ArrayList;
import java.util.Collections;

public class BooksTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("book1", "author1", 1000000, "102"));
        books.add(new Book("book2", "author1", 2000000, "110"));
        books.add(new Book("book3", "author2", 20, "112"));
        books.add(new Book("book4", "author3", 250, "113"));
        books.add(new Book("book5", "author3", 250, "120"));
        books.add(new Book("book6", "author3", 200, "101"));
        books.add(new Book("book7", "author4", 300, "107"));
        books.add(new ProgrammerBook("Programming for beginners",
                "Aleksandr Petrov", 1, "108", "English", 3));
        books.add(new ProgrammerBook("Я написал книгу. Рассказываю, зачем.",
                "Василий Шишков", 40, "103", "Русский", 1));
        books.add(new ProgrammerBook("Как проснуться в 7 утра и не умереть",
                "Иван Владимир", 800, "116", "Русский", 5));
        books.add(new ProgrammerBook("Design patterns",
                "Michael Moore", 228, "114", "English", 1));

        System.out.println("До сортировки\n");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по ИСБН\n");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по названию\n");
        books.sort(BookComparator.NAME_COMPARATOR);
        for (Book book : books) {
            System.out.println(book.toString());
        }


        System.out.println("\n\n\nСортировка по названию а потом по автору\n");
        books.sort(BookComparator.NAME_AND_AUTHOR_COMPARATOR);
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по автору а потом по названию\n");
        books.sort(BookComparator.AUTHOR_AND_NAME_COMPARATOR);
        for (Book book : books) {
            System.out.println(book.toString());
        }


        System.out.println("\n\n\nСортировка по автору \n");
        books.sort(BookComparator.AUTHOR_COMPARATOR);
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по цене \n");
        books.sort(BookComparator.PRICE_COMPARATOR);
        for (Book book : books) {
            System.out.println(book.toString());
        }


        System.out.println("\n\n\nСортировка по автору, названию и цене \n");
        books.sort(BookComparator.AUTHOR_NAME_PRICE_COMPARATOR);
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
