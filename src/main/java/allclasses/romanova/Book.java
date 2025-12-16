package allclasses.romanova;

public class Book {
    public String title;
    public String author;
    public int page;
    public int price;
    public int year;

    public Book() {
        title = "Название";
        author = "Автор";
        year = 2025;
        page = 100;
        price = 0;
    }

    public Book(String title, String author, int page, int price, int year) {
        this.title = title;
        this.author = author;
        this.page = page;
        this.price = price;
        this.year = year;
    }
    public String PrintBook() {
        return title + " - " + author + " (" + year + "), " + page + " стр., цена: " + price;
    }

    public boolean isThickBook() {
        return page > 500;
    }

    public String ShortInfo() {
        return title + " (" + year + ") -" + price + "руб.";
    }
}