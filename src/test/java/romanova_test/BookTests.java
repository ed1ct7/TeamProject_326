package romanova_test;

import allclasses.romanova.Book;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTests {

    @Test
    public void testDefaultConstructor() {
        Book book = new Book();
        assertEquals("Название", book.title);
        assertEquals("Автор", book.author);
        assertEquals(2025, book.year);
        assertEquals(100, book.page);
        assertEquals(0, book.price);
    }

    @Test
    public void testParameterizedConstructor() {
        Book book = new Book("Война и мир", "Л.Н. Толстой", 1225, 890, 1869);
        assertEquals("Война и мир", book.title);
        assertEquals("Л.Н. Толстой", book.author);
        assertEquals(1225, book.page);
        assertEquals(890, book.price);
        assertEquals(1869, book.year);
    }

    @Test
    public void testPrintBook() {
        Book book = new Book("Преступление и наказание", "Ф.М. Достоевский", 671, 750, 1866);
        String expected = "Преступление и наказание - Ф.М. Достоевский (1866), 671 стр., цена: 750";
        assertEquals(expected, book.PrintBook());
    }

    @Test
    public void testIsThickBook_true() {
        Book book = new Book("1984", "Дж. Оруэлл", 600, 500, 1949);
        assertTrue(book.isThickBook());
    }

    @Test
    public void testIsThickBook_false() {
        Book book = new Book("Сказка о царе Салтане", "А.С. Пушкин", 50, 200, 1831);
        assertFalse(book.isThickBook());
    }

    @Test
    public void testShortInfo() {
        Book book = new Book("Мастер и Маргарита", "М.А. Булгаков", 480, 690, 1967);
        String expected = "Мастер и Маргарита (1967) -690руб.";
        assertEquals(expected, book.ShortInfo());
    }
}