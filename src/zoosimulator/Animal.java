/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author owner1
 */
public class Animal implements IEntity {
    //feilds
    int id;
    String name;
    String species;
    char sex;
    int age;
    int xPosition;
    int yPosition;
    String size;
    int speed;
    double direction;
    int hunger;
    int fatigue;
    Image image;
    String sound;
    
    //constructors
    public Animal(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, Image picture, String animalSound) {
    id = identifier;
    name = animalName;
    species = animalSpecies;
    sex = gender;
    age = animalAge;
    xPosition = xposition;
    yPosition = yposition;
    size = animalSize;
    speed = animalSpeed;
    direction = faceDirection;
    hunger = animalHunger;
    fatigue = animalFatigue;
    image = picture;
    sound = animalSound;
    }
    
    public Animal(int identifier, String animalName, String animalSpecies, char gender, int animalAge, int xposition, int yposition, String animalSize, int animalSpeed, double faceDirection, int animalHunger, int animalFatigue, String animalSound) {
    id = identifier;
    name = animalName;
    species = animalSpecies;
    sex = gender;
    age = animalAge;
    xPosition = xposition;
    yPosition = yposition;
    size = animalSize;
    speed = animalSpeed;
    direction = faceDirection;
    hunger = animalHunger;
    fatigue = animalFatigue;
    sound = animalSound;
    }
    //setters 
    public void setId(int id) {   
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    //getters 

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public int getHunger() {
        return hunger;
    }

    public int getFatigue() {
        return fatigue;
    }

    public Image getImage() {
        return image;
    }

    public String getSound() {
        return sound;
    }
    

    //interface methods
    @Override
    public void move() {   
        double radians = Math.toRadians(direction);
        xPosition = (int) Math.cos(radians) * speed;
        yPosition = (int) Math.sin(radians) * speed;
        fatigue += 1;
        hunger +=1;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
        fatigue += 1;
        hunger += 1;
    }

    @Override
    public void eat() {
        System.out.println("nom nom nom");
        hunger = 0;
    }
    @Override
    public void sleep() {
        System.out.println("zzz...zzz...zzz");
        fatigue = 0;
    }
    @Override
    public void ageUp() {
        age+=1;
        System.out.println(name + " is now " + age + " years old. Happy birthday " + name + "!");
    }
    
    //other methods 

    
}
