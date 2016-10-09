import java.util.Random;
import java.util.Scanner;

public class rps {
	public static void main(String[] args){
		
//Declaration
int wins = 0;
int loses = 0;
int ties = 0;
int rock = 1;
int paper = 2;
int scissors = 3;
int computer;
String userinput;
int userchoice;
boolean infinite=true;


//Object
Random random = new Random();
Scanner scan = new Scanner(System.in);

//Rules
System.out.println("This is a simple game of Rock, Paper, Scissors, so... Rock, Paper, Scissors Shoot!");

userinput = scan.next(); 
computer = random.nextInt(scissors-rock+1)+rock;


//Conditional Statement
switch (userinput) {
	case "Rock":
		userchoice = 1;
		computer = random.nextInt(scissors-rock+1)+rock;
		
		if (computer==rock) {
			System.out.println("Computer Choice: Rock");
			System.out.println("There was a tie!");
			ties++;
			System.out.println("Wins\tLoses\tTies");
			System.out.println(wins+"\t"+loses+"\t"+ties);
			break;
		}
			
		else if (computer==paper){
			System.out.println("Computer Choice: Paper");
			System.out.println("You lose!");
			loses++;
			System.out.println("Wins\tLoses\tTies");
			System.out.println(wins+"\t"+loses+"\t"+ties);
			break;
		}

		else if(computer==scissors){
			System.out.println("Computer Choice: Scissors");
			System.out.println("You win!");
			wins++;
			System.out.println("Wins\tLoses\tTies");
			System.out.println(wins+"\t"+loses+"\t"+ties);
			break;
		}
	case "Paper":
		if (userinput.equalsIgnoreCase("Paper")) {
			userchoice = 2;
			computer = random.nextInt(scissors-rock+1)+rock;
			}
			if (computer==rock) {
				System.out.println("Computer Choice: ");
				System.out.println("You win!");
				wins++;
				System.out.println("Wins\tLoses\tTies");
				System.out.println(wins+"\t"+loses+"\t"+ties);
				break;
			}
				
			else if (computer==paper){
				System.out.println("Computer Choice: Paper");
				System.out.println("There was a tie!");
				ties++;
				System.out.println("Wins\tLoses\tTies");
				System.out.println(wins+"\t"+loses+"\t"+ties);
				break;
			}

			else if(computer==scissors){
				System.out.println("Computer Choice: Scissors");
				System.out.println("You Lose!");
				loses++;
				System.out.println("Wins\tLoses\tTies");
				System.out.println(wins+"\t"+loses+"\t"+ties);
				break;
			}
	case "Scissors":
		if (userinput.equalsIgnoreCase("Scissors")) {
			userchoice = 3;
			computer = random.nextInt(scissors-rock+1)+rock;
			}
			if (computer==rock) {
				System.out.println("Computer Choice: ");
				System.out.println("You lose!");
				loses++;
				System.out.println("Wins\tLoses\tTies");
				System.out.println(wins+"\t"+loses+"\t"+ties);
				break;
			}
				
			else if (computer==paper){
				System.out.println("Computer Choice: Paper");
				System.out.println("You win!");
				wins++;
				System.out.println("Wins\tLoses\tTies");
				System.out.println(wins+"\t"+loses+"\t"+ties);
				break;
			}

			else if(computer==scissors){
				System.out.println("Computer Choice: Scissors");
				System.out.println("There was a tie!");
				ties++;
				System.out.println("Wins\tLoses\tTies");
				System.out.println(wins+"\t"+loses+"\t"+ties);
				break;
			}
		default:
			System.out.println("You have entered an invalid entry, please try again");
			
		
}
}
	
}

	}

