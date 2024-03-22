/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author owner1
 */
public class WaterAnim extends Animal implements ISwimmable{

    private boolean surface;
    private boolean breathe;
    public WaterAnim(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, Image picture, String animalSound, boolean canSurface, boolean canBreathe) {
        super(identifier, animalName, animalSpecies, gender, animalAge, xposition, yposition, animalSize, animalSpeed, faceDirection, animalHunger, animalFatigue, picture, animalSound);
        surface = canSurface;
        breathe = canBreathe;
    }
    
    public WaterAnim(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, String animalSound, boolean canSurface, boolean canBreathe) {
        super(identifier, animalName, animalSpecies, gender, animalAge, xposition, yposition, animalSize, animalSpeed, faceDirection, animalHunger, animalFatigue, animalSound);
        surface = canSurface;
        breathe = canBreathe;
    }

    //setters 
    public void setSurface(boolean surface) {
        this.surface = surface;
    }

    public void setBreathe(boolean breathe) {
        this.breathe = breathe;
    }
    
    //getters 

    public boolean isSurface() {
        return surface;
    }

    public boolean isBreathe() {
        return breathe;
    }
    
    //methods 
    @Override
    public boolean canSurface() {
        return surface;
    }
    
    public boolean canBreathe() {
        return breathe;
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
        super.eat(); 
    }

    @Override
    public void move() {
        super.move(); 
    }

    @Override
    public void makeSound() {
        super.makeSound(); 
    }
    
    
    
}
