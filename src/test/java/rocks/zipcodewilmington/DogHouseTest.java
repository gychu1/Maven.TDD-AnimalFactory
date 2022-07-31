package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogTest(){
        //Given
        String name = "Luna";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        int expected = 3;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIDTest(){
        //Given
        String name = "Luna";
        Date birthDate = new Date();
        Dog dog = new Dog(name, birthDate, 2);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        DogHouse.remove(2);
        int expected = 0;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest(){
        //Given
        String name = "Luna";
        Date birthDate = new Date();
        Dog dog = new Dog(name, birthDate, 2);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        int expected = 0;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest(){
        //Given
        String name = "Luna";
        Date birthDate = new Date();
        Dog dog = new Dog(name, birthDate, 2);
        String name1 = "Doggo";
        Date birthDate1 = new Date();
        Dog dog1 = new Dog(name1, birthDate1, 5);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        DogHouse.add(dog1);
        DogHouse.remove(5);
        int expected = 1;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest(){
        //Given
        String name = "Luna";
        Date birthDate = new Date();
        Dog dog = new Dog(name, birthDate, 2);
        String name1 = "Doggo";
        Date birthDate1 = new Date();
        Dog dog1 = new Dog(name1, birthDate1, 5);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        DogHouse.add(dog1);
        int expected = 2;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

}
