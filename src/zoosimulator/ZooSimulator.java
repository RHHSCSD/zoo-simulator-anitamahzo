/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author owner1
 */
public class ZooSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //create array of zoo animals
      Animal zooAnimals[] = new Animal[6];
      
      //create objects of the animal classes 
      zooAnimals[0] = new LandAnim(01, "Sandy", "Lion", 'F', 15, 10, 10, "Medium", 6, 90.0, 0, 0, "roar");
      zooAnimals[1] = new LandAnim(02, "Greg", "Tortoise", 'M', 17, 20, 25, "Small", 1, 180.0, 0, 0, "click");
    }
    
}
