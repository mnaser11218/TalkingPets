package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        boolean endApp = false;
        Scanner scanner = new Scanner(System.in);

        while(!endApp){
            System.out.println("How many pets do you have? ");
            int amountOfPets = scanner.nextInt();

            System.out.println("What type of pet do you have: Cat, Dog or Turtle?");
            String typeOfAnimal = scanner.next();
            System.out.println("What is the name of your " + typeOfAnimal);
            String nameOfAnimal = scanner.next();
        //    System.out.println("You have a : " + typeOfAnimal + " and it's name is: " + nameOfAnimal);

            switch(typeOfAnimal.toLowerCase()){
                case "dog":
                    System.out.println("you have a dog");
                    Pet dog = new Dog();
                    dog.setName(nameOfAnimal);
                    pets.add(dog);
                    break;
                case "cat":
                    Pet cat = new Cat();
                    cat.setName(nameOfAnimal);
                    pets.add(cat);
                    break;
                case "turtle":
                    Pet turtle = new Turtle();
                    turtle.setName(nameOfAnimal);
                    pets.add(turtle);
                    break;
            }

            System.out.println("Do you have any more pets?");
            String closeApp = scanner.next();
            if(closeApp.equalsIgnoreCase("no")){
                endApp = true;
            }
        }
        scanner.close();
        pets.forEach((n) -> System.out.println( "your pet is name is: " + n.getName() + "when it speaks it says: " + n.speak()));




    }
}
