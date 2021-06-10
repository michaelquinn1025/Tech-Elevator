package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {
	
	private static List<QuizQuestion> questions = new ArrayList<>();

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		loadData();
		
		play(keyboard);
	}
	
	public static void loadData() {
		
		File quizFile = new File("test_quiz.txt");
		
		try (Scanner quiz = new Scanner(quizFile)) {
			while(quiz.hasNextLine()) {
				String quizLine = quiz.nextLine();
			
				addQuestion(quizLine);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
	}
	
	public static void addQuestion(String quizLine) {
		String [] data = quizLine.split("\\|");
		if (data != null && data.length > 0) {
			String question = data[0];
			List<String> answers = new ArrayList<>();
			int correctAnswer = 0;
			for (int i = 1; i < data.length; i++) {
				String answer = data[i];
				
				if (answer.endsWith("*")) {
					answer = answer.substring(0, answer.length() - 1);
					correctAnswer = i;
				}
				
				answers.add(answer);
			}
			QuizQuestion  newQuestion = new QuizQuestion(question, answers,
					correctAnswer);
			questions.add(newQuestion);
		}
	}
	
	public static void play(Scanner keyboard) {
		
		
		for (QuizQuestion question : questions) {
			System.out.println();
			System.out.println(question.getQuestion());
			System.out.println();
			List<String> answers = question.getAnswers();
			for (int i = 0; i < answers.size(); i++) {
				String answer = answers.get(i);
				System.out.println(Integer.valueOf(i + 1).toString()
						+ ". " + answer);
			}
			System.out.println();
			
			// using print rather than println to NOT print return
			System.out.print("Your answer: ");
			
			String userAnswer = keyboard.nextLine();
			
			System.out.println();
			
			String correctAnswerString =
					Integer.valueOf(question.getCorrectAnswer()).toString();
			
			if (userAnswer.equals(correctAnswerString)) {
				System.out.println("Correct!");
			} else {
				System.out.println("Sorry.. that's incorrect.");
			}
			
		}
	}

}
