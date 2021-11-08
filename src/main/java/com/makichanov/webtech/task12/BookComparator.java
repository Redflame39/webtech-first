package com.makichanov.webtech.task12;

import java.util.Comparator;

public final class BookComparator {

    public static final Comparator<Book> NAME_COMPARATOR = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());

    public static final Comparator<Book> AUTHOR_COMPARATOR = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());

    public static Comparator<Book> PRICE_COMPARATOR = (o1, o2) -> o1.getPrice() - o2.getPrice();

    public static Comparator<Book> NAME_AND_AUTHOR_COMPARATOR = (o1, o2) -> {
        int res = o1.getTitle().compareTo(o2.getTitle());
        if (res == 0) res = o1.getAuthor().compareTo(o2.getAuthor());
        return res;
    };

    public static Comparator<Book> AUTHOR_AND_NAME_COMPARATOR = (o1, o2) -> {
        int res = o1.getAuthor().compareTo(o2.getAuthor());
        if (res == 0) res = o1.getTitle().compareTo(o2.getTitle());
        return res;
    };

    public static Comparator<Book> AUTHOR_NAME_PRICE_COMPARATOR = (o1, o2) -> {
        int res = o1.getAuthor().compareTo(o2.getAuthor());
        if (res == 0) res = o1.getTitle().compareTo(o2.getTitle());
        if (res == 0) res = o1.getPrice() - o2.getPrice();
        return res;
    };

    private BookComparator() { }
}
