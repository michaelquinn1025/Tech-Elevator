package com.techelevator;

public class RectangleWall extends Wall {

	
	
    public int height;
    public int length;

    public  RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
				
    }
    
    public int getLength() {
    	return length;
    }
    
    public int getHeight() {
    	return height;
    }
    
    @Override
    public int getArea() {
    	return length * height;
    }
    
    public String toString() {
    	return getName() + " (" + "x" + ") square";
    }
		
   


	
		
        
    

    
}
