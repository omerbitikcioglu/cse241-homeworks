/**
*
* <h1>CSE241(OOP) Homework ~ 7 ~</h1>
*
* @author Ömer Faruk Bitikçioğlu
*
*/

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main( String args[] )
	{
		System.out.printf(" Welcome to N-Puzzle Game!\n\n");

		// Create a new NPuzzle object
		NPuzzle game = new NPuzzle();
		
		// User desides what kind of board to use
		System.out.printf("\tSelect one:\n");
		System.out.println("1) Use a random board");
		System.out.println("2) Load board from a file");
		System.out.println("Selection: ");

		// Gets a menu selection
		int selection;
		Scanner input = new Scanner( System.in );
		selection = input.nextInt();

		// Selection must be either 1 or 2
		if(selection != 1 && selection != 2)
		{
			System.out.println("Invalid input! Program will be terminated!");
			System.exit(1);
		}
		
		if(selection == 1) // Create a random board
		{
			Random rand = new Random();
			
			// Pick random w and h both 1-9
			int width = rand.nextInt(9)+1; // Columns
			int height = rand.nextInt(9)+1; // Rows

			game.setSize(height, width);
			game.reset();
			game.shuffle(100);
		}
		else // Load from file
		{
			// Ask user to enter a file name to load
			System.out.println("Enter file name to load (*.txt):");
			String fileName = new String();
			fileName = input.nextLine();
			
			// Open and read the file
			FileInputStream inpFile = new FileInputStream(fileName);
			
			//....LOAD GAME CONFIG........
		}

		game.print();
		game.play();
	}
}
