/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author owner1
 */
public class BirdAnim  extends Animal implements IFlyable {
    //constructors 
    public BirdAnim(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, Image picture, String animalSound) {
        super(identifier, animalName, animalSpecies, gender, animalAge, xposition, yposition, animalSize, animalSpeed, faceDirection, animalHunger, animalFatigue, picture, animalSound);
    }
    
    public BirdAnim(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, String animalSound) {
        super(identifier, animalName, animalSpecies, gender, animalAge, xposition, yposition, animalSize, animalSpeed, faceDirection, animalHunger, animalFatigue, animalSound);
    }
    
    boolean flying;
    
    //methods 
    @Override
    public void fly() {
        System.out.println("The " + name + " is flying!");
        flying = true;
    }
    
    @Override
    public void land() {
        System.out.println("The " + name + " has landed.");
        flying = false;
    }
    
    @Override
    public boolean isFlying() {
       return flying;
    }

    @Override
    public void ageUp() {
        super.ageUp(); 
    }

    @Override
    public void sleep() {
        super.sleep(); 
    }

    @Override
    public void eat() {
        super.eat(); // 
    }

    @Override
    public void makeSound() {
        super.makeSound(); 
    }

    @Override
    public void move() {
        super.move(); 
    }
    
    
}
