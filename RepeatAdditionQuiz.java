//U10416022洪映舫

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	public static void main(String[] args){

		//set two numbers at random
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// Create the Scanner
		Scanner input = new Scanner(System.in);
		 

		//print out the question for user
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		//user inputs their answer
		int answer = input.nextInt();

		//set up arraylist method for integer
		ArrayList<Integer> doneAnswers = new ArrayList<>();

		//use while loop and give the condition that user input wrong answer    
		while (number1 + number2 != answer) {

			//print out the answers that users has already inputted
			if(doneAnswers.contains(answer)){
				System.out.println("You already answered: " +answer);
			}
			//if the answer is wrong,let user try again
			//print out the quesion again
			System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			
			//add answers data to doneAnswers
			doneAnswers.add(answer);
			
		}
