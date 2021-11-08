package com.makichanov.webtech.task12;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook b = (ProgrammerBook) o;
        return level == b.level
                && (language != null ? language.equals(b.language) : b.language == null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + level;
        return result;
    }

    public String toString() {
        return "_________________________________________\n"
                + "isbn: " + this.getIsbn() + "\nAuthor: " + this.getAuthor() +
                "\nTitle: " + this.getTitle() + "\nPrice: " + this.getPrice() +
                "\nLanguage: " + this.getLanguage() + "\nLevel: " + this.getLevel();
    }

}
