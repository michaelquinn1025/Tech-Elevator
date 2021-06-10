package com.techelevator;

import java.util.List;

import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TELog logger = new TELog();
			logger.log("Search application started");
			
			
			// Step Four: Instantiate a Search Domain
			//
			SearchDomain searchDomain = new SearchDomain("data");
			System.out.println(searchDomain);
			
			
			
			// Step Six: Single word search
			//
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			searchEngine.indexFiles();
			
			List<String> searchResult1 = searchEngine.search("squirrel");
			

			
			
			// Step Seven: Multiple word search
			//
			
			List<String> searchResult2 = searchEngine.search("telephone line");
			

			TELog.log("Almost done...");
			TELog.log("Done!");
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
