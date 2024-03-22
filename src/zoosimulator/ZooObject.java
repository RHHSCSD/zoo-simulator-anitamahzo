/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author owner1
 */
public class ZooObject implements IObject{
    
    //feilds 
    private String type;
    private int xPosition;
    private int yPosition; 
    private int direction;
    private String size;

    //constructors 
    public ZooObject(String objType, int x, int y, int faceDirection, String objSize) {
        type = objType;
        xPosition = x;
        yPosition = y;
        direction = faceDirection;
        size = objSize;
    }
    //setters 
    public void setType(String type) {
        this.type = type;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //getters 

    public String getType() {
        return type;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getDirection() {
        return direction;
    }

    public String getSize() {
        return size;
    }
    
    
    //interface methods 
    @Override
    public void turn(int degrees) {
        direction = direction + degrees;
    }

    @Override
    public void place(int x, int y) {
        xPosition = x;
        yPosition = y;
    }
    
    //other methods 
    
}
