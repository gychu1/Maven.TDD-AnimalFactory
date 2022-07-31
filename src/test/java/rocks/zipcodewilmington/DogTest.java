package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        String expected = "bark!";
        String retrievedSpeak = dog.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedSpeak);
    }

    @Test
    public void setBirthDate() {
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        Date expected = new Date(2002, Calendar.FEBRUARY, 1);
        dog.setBirthDate(expected);
        Date retrievedBirthDate = dog.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedBirthDate);
    }
    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        Food food = new Food();
        Food broccoli = new Food();

        // When
        Integer expected = 2;
        dog.eat(food);
        dog.eat(broccoli);
        Integer retrievedMealAte = dog.getNumberOfMealsEaten();
        System.out.println(retrievedMealAte);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedMealAte);
    }

    @Test
    public void getIdTest() {
        // Given
        Dog dog = new Dog(null, null, 3);

        // When
        Integer expected = 3;
        Integer retrievedID = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedID);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, 3);

        // When
        boolean expectedInheritance = true;
        boolean actualInheritance = dog instanceof Animal;

        // Then
        Assert.assertEquals(expectedInheritance, actualInheritance);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, 3);

        // When
        boolean expectedInheritance = true;
        boolean actualInheritance = dog instanceof Mammal;

        // Then
        Assert.assertEquals(expectedInheritance, actualInheritance);
    }
}
