
package ponomaryova_tests;

import allclasses.ponomaryova.Dogs;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogsTests {
    @Test
    public void addDog(){
        Dogs dog = new Dogs("Джек рассел терьер", 2018, "Фунтик");
        assertEquals("Порода собаки: Джек рассел терьер, Год рождения собаки: 2018, кличка собаки: Фунтик", dog.showDog());

    }

    @Test
    public void howAgeTest(){
        Dogs dogs = new Dogs("Лабрадор", 2020, "Майя");
        String result = dogs.howAge();
        assertEquals("На данный момент собаке 5 лет", dogs.howAge());
    }
}