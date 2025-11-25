package allclasses.romanova;

public class Book {
    private String title;
    private String author;
    private int page;
    private int price;
    private int year;

    public Book(){
        title = "Название";
        author = "Автор";
        year = 2025;
        page = 100;
        price = 0;
    }

    public Book(String title, String author, int page, int price, int year){
        this.title = title;
        this.author = author;
        this.page = page;
        this.price = price;
        this.year = year;
    }

    public String PrintBook(){
        return title + " - " + author + " (" + year + "), " + page + " стр., цена: " + price;
    }
    public int getBookAge() {
        return 2025 - year;
    }

    public boolean isOldBook() {
        return getBookAge() > 50;
    }

    public boolean isThickBook() {
        return page > 500;
    }

    public String getShortInfo() {
        return title + " (" + year + ") - " + price + " руб.";
    }
}