/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author owner1
 */
public class LandAnim extends Animal {
    //constructors 
    public LandAnim(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, Image picture, String animalSound) {
        super(identifier, animalName, animalSpecies, gender, animalAge, xposition, yposition, animalSize, animalSpeed, faceDirection, animalHunger, animalFatigue, picture, animalSound);
    }
    
    public LandAnim(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, String animalSound) {
        super(identifier, animalName, animalSpecies, gender, animalAge, xposition, yposition, animalSize, animalSpeed, faceDirection, animalHunger, animalFatigue, animalSound);
    }
    //methods 
    @Override
    public void move() {   
       double radians = Math.toRadians(direction);
        xPosition = (int) Math.cos(radians) * speed;
        yPosition = (int) Math.sin(radians) * speed;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void sleep() {
        super.sleep();
    }
    
    public void crawl() {
        System.out.println( name + " is crawling!");
    }
    
    @Override
    public void ageUp() {
        super.ageUp();
    }
}
