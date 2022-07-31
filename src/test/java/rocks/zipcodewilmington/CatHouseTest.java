package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        //Given
        String name = "Mao";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal);
        int expected = 2;

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIDTest(){
        //Given
        String name = "Mao";
        Date birthDate = new Date();
        Cat cat = new Cat(name, birthDate, 2);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        CatHouse.remove(2);
        int expected = 0;

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){
        //Given
        String name = "Mao";
        Date birthDate = new Date();
        Cat cat = new Cat(name, birthDate, 2);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        int expected = 0;

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest(){
        //Given
        String name = "Mao";
        Date birthDate = new Date();
        Cat cat = new Cat(name, birthDate, 8);
        String name1 = "Mew";
        Date birthDate1 = new Date();
        Cat cat1 = new Cat(name1, birthDate1, 18);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        CatHouse.remove(8);
        int expected = 1;

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest(){
        //Given
        String name = "Mao";
        Date birthDate = new Date();
        Cat cat = new Cat(name, birthDate, 8);
        String name1 = "Mew";
        Date birthDate1 = new Date();
        Cat cat1 = new Cat(name1, birthDate1, 18);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        int expected = 2;

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}
