package mySecondTut;
import java.util.Scanner;
public class javaLessonThree {
	static Scanner userInput = new Scanner(System.in);
	// static means than this thing can be used by the whole class
	public static void main (String[] args) {
		int myNumber = (int) Math.floor(Math.random() * 10);
		
		int num = userInput.nextInt() + myNumber;
		
		if (num < 30) {
			System.out.println("the num is less than 30");
			
		} else if (num < 40){
			System.out.println("the num is less than 40");
		}else{
			System.out.println("the number is bigger than 40");
		}
		
		char theGrade  = 'a';
		
		switch (theGrade){
		case 'B':
			System.out.println("the letter is B");
			break;
			
		case 'A':
		case 'a':
			System.out.println("the letter is not B");
			break;
			
		default:
			System.out.println("you failed");
			break;
			
		// if you do not have break then all the if will be exec once
		}
		
	}
}

// logical operators
// no: ! 
// &&: and 
// |: or
// ^: xor