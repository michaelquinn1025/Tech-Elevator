package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		/*
		System.out.print("Enter the path of a file or directory >>> ");
		String path = userInput.nextLine();
		File f = new File(path); 
		*/

		/*
		 * The File class allows us to inspect various attributes of a file system object
		 */

		/* ***************************
		 * INSPECTING THE FILESYSTEM
		 * ***************************/
		/*
		System.out.println();
		if (f.exists()) { // returns true if a file or directory exists at the file system location, otherwise returns false
			System.out.println("name: " + f.getName());
			System.out.println("absolutePath: " + f.getAbsolutePath());
			if (f.isDirectory()) {
				System.out.println("type: directory");
			} else if (f.isFile()) {
				System.out.println("type: file");
			}
			System.out.println("size : " + f.length());
		} else {
			System.out.println(f.getAbsolutePath() + " does not exist.");
		}
		*/
//		createDirectory();
		
//		createFile();
		
//		createFileInDirectory();
		
//		writeFile();
		
//		writeFileTryWithResources();
		
		writeOrAppend();

	}
	
	public static void createDirectory() {
		File newDir = new File("myDirectory");
		
		if (!newDir.exists()) {
			newDir.mkdir();
		} else {
			System.out.println("Directroy exists.");
		}
		
		
	}
	
	public static void createFile() {
		
		File newFile = new File("myDirectory/myFile.txt");
		
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createFileInDirectory() {
		
		File newFile = new File("myDirectory", "myDirFile.txt");
		
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void writeFile() {
		File file = new File("writeTest.txt");
		
		String message = "Good\nmorning\nclass!!!!!!!!!!!";
		
		try {
			PrintWriter writer = new PrintWriter(file.getAbsoluteFile());
			writer.print(message);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void writeFileTryWithResources() {
		File file = new File("writeTest.txt");
		
		String message = "Good\nmorning\nagain!";
		
		try (PrintWriter writer = new PrintWriter(file.getAbsoluteFile())) {		
			writer.print(message);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void writeOrAppend() {
		File file = new File("writeTest-new.txt");
		String message = "all gone!";
		
		// check if file exists. and set boolean to true if it does
		boolean append = file.exists() ? true : false;
		
		// create PrintWrite with a FileOutputStream which
		// refers to the file object AND has a param
		// indicating whether to append (true=append, false=overwrite)
		//
		// the FileOutputStream is created as part of the PrintWriter
		// creation so that we can wrap the whole in a try-with-resources
		// so it will be flushed and closed when done
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream(file, append))) { 
			
			// when using the FileOutput stream, we use append
			// rather than print and it will decided whether to append
			// or overwrite based on param in FileOutputStream
			// creation
			writer.append(message);	
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}
	

}
