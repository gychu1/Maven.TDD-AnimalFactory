package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        System.out.println(givenBirthDate);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String expected = "Mao Mao";
        cat.setName(expected);
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedName);
    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String expected = "meow!";
        String retrievedSpeak = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedSpeak);
    }

    @Test
    public void setBirthDate() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Date expected = new Date(2002, Calendar.FEBRUARY, 1);
        cat.setBirthDate(expected);
        Date retrievedBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedBirthDate);
    }

    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        Food broccoli = new Food();

        // When (we retrieve data from the cat)
        Integer expected = 2;
        cat.eat(food);
        cat.eat(broccoli);
        Integer retrievedMealAte = cat.getNumberOfMealsEaten();
        System.out.println(retrievedMealAte);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedMealAte);
    }

    @Test
    public void getIdTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Integer expected = 0;
        Integer retrievedID = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedID);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        String catName = "Mao Mao";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 8);

        // When
        boolean expectedInheritance = true;
        boolean actualInheritance = cat instanceof Animal;

        // Then
        Assert.assertEquals(expectedInheritance, actualInheritance);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        String catName = "Mao Mao";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 8);

        // When
        boolean expectedInheritance = true;
        boolean actualInheritance = cat instanceof Mammal;

        // Then
        Assert.assertEquals(expectedInheritance, actualInheritance);
    }
}
