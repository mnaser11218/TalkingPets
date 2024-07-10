package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testMe(){}


//
//    You must support at least three types of pets.
//    Dog must be one of the types you support.
//    Cat must be one of the types you support.
@Test
public void testDogClass(){
    Dog dog = new Dog();
    Assert.assertTrue(dog instanceof  Dog);
}


    @Test
    public void testCatClass(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof  Cat);
    }
    @Test
    public void testTurtleClass(){
        Turtle turtle = new Turtle();
        Assert.assertTrue(turtle instanceof  Turtle);
    }



//    The Pet class must have a speak method that each subclass overrides.
@Test
public void testPetClassSpeakMethod(){
    Pet pet= new Pet();
    String actual = pet.speak();
    String expected = "Pet is speaking.";
    Assert.assertEquals(expected, actual);
}
    @Test
    public void testCatClassSpeakMethod(){
        Pet cat= new Cat();
        String actual = cat.speak();
        String expected = "Cat is speaking.";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogClassSpeakMethod(){
        Pet dog= new Dog();
        String actual = dog.speak();
        String expected = "Dog is speaking.";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTurtleClassSpeakMethod(){
        Pet turtle= new Turtle();
        String actual = turtle.speak();
        String expected = "Turtle is speaking.";
        Assert.assertEquals(expected, actual);
    }




//    The Pet class must have a name field with setters and getters.

    @Test
    public void testPetClassGetAndSetNameMethod(){
        Pet pet= new Pet();
        pet.setName("new Pet Name");
        String actual = pet.getName();
        String expected = "new Pet Name";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatClassGetAndSetNameMethod(){
        Pet cat= new Cat();
        cat.setName("Cat name");
        String actual = cat.getName();
        String expected = "Cat name";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogClassGetAndSetNameMethod(){
        Dog dog= new Dog();
        dog.setName("Dog name");
        String actual = dog.getName();
        String expected = "Dog name";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTurtleClassGetAndSetNameMethod(){
        Pet turtle= new Turtle();
        turtle.setName("Turtle name");
        String actual = turtle.getName();
        String expected = "Turtle name";
        Assert.assertEquals(expected, actual);
    }








}
