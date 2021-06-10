package com.techelevator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TELog {

	public static void log(String message) {
		
		// Create File object. This does NOT create a file!
		// The File objects is info ABOUT the file and methods
		// to do some thigs in the filesystem but it does
		// not actually create or open the file
		File logFile = new File("logs/search.log");
		
		boolean appendMode = logFile.exists() ? true : false; 
//		boolean appendMode = false; 
		
		// FileOutputStream can be used when you want to specify
		// whether or not your are appending, as oppsoed to always
		// overwriting. It take a File object and a paramter which
		// indicates whether or not we are appending. If we are,
		// we'll open the file and add to it. If append param is
		// is false. it'll will create a new file anf OVERWRITE
		// anything that was already
		//
		// we use the FileOutputStream as a parameter to PrintWriter
		// (this is an overloaded constructor) and the printwriter
		// will append or overwrite based on the FileOutputStream
		try (PrintWriter writer =
				new PrintWriter(new FileOutputStream(logFile, appendMode))) {
			writer.append(getDateTimeString() + " ");
			writer.append(message);
			writer.append("\n");
			
		} catch (FileNotFoundException fnfex) {
			// repackage exception as a TELogException
			throw new TELogException(fnfex.getMessage());
		}
		
	}
	// format identifiees available at:
	// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	public static String getDateTimeString() {
		LocalDateTime timestamp = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		return timestamp.format(formatter);
				
	}
}
