package com.techelevator.draw.tool;

public class DrawTool {

public static void main(String[] args) {
    	
    	WoodenPencil pencil = new WoodenPencil();
    	
    	// we try refer to static properties and methods using the class
    	// rather than an object because static is not associated
    	// with a specific object
    
//    	double defaultLength = WoodenPencil.DEFAULT_LENGTH;
//    	WoodenPencil.getS
    	
//    	pencil.getS
    	
    	double stubLength1 = WoodenPencil.getStubLength();
    	System.out.println("stubLength1: "  + stubLength1);
    	
    	WoodenPencil.setStubLength(4.0);
    	
    	double stubLength2 = WoodenPencil.getStubLength();
    	System.out.println("stubLength2: "  + stubLength2);
    	
    	WoodenPencil pencilWithValues = new WoodenPencil(5.9, 4, "hardness",
    			WoodenPencil.defaultColor, 7.0);
    	
    	WoodenPencil pencilNoValues = new WoodenPencil();
    
    	
    	
    	
    	
    	/*
    	System.out.println("Pencil length: " + pencil.getLength() + " inches");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	System.out.println();
    	
    	pencil.sharpen();
    	System.out.println("Sharpening...");
    	System.out.println("Pencil length: " + pencil.getLength() + " inches");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	System.out.println();
    	
    	pencil.write();
    	System.out.println("Writing...");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	System.out.println();
    	
    	pencil.sharpen();
    	System.out.println("Sharpening...");
    	System.out.println("Pencil length: " + pencil.getLength() + " inches");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	*/
    }

}
