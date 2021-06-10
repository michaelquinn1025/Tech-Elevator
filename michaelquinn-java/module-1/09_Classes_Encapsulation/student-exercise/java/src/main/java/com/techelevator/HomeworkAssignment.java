package com.techelevator;

public class HomeworkAssignment {
	
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	
	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	
	public int getTotalMarks() {
		return totalMarks;
	}
	
	
	public void setTotalMarks (int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	
	public void setSubmitterName (String submitterName) {
		this.submitterName = submitterName;
	}
	
	
	public String getLetterGrade() {
		double gradeValue = ((double) totalMarks / (double) possibleMarks) * 100;
		
			if (gradeValue < 90 && gradeValue >= 80) {
				letterGrade = "B";
				
			}
			else {
				if (gradeValue < 80 && gradeValue >= 70) {
					letterGrade = "C";
					
				}
				else {
					if (gradeValue < 70 && gradeValue >= 60) {
						letterGrade = "D";
						
					}
					else {
						letterGrade = "F";
					}
				}
			}
	
	
			return letterGrade;

	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}


}
