import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of moeny you want to speand ($): ");
		int initialMoney = scanner.nextInt();
		int money = initialMoney;
		scanner.nextLine();
		boolean playAgain = true;
		while (playAgain) {
			money--;
		
		int num1 = getRandomNumber();
		int num2 = getRandomNumber();
		int num3 = getRandomNumber();
		System.out.println("Random number: " + num1 + ", " + num2 + ", " + num3);
		if(num1 == 7 || num2 == 7 || num3 == 7) {
		if (num1 == 7 && num2 == 7 && num3 == 7) {
			money += 10;
		}
		else if(num1 == 7 || num2 == 7 || num3 == 7) {
			money += 3;
		}
		else {
			money  += 5;
		}
		System.out.println("You won!");
	  }else {
		System.out.println("You lost.");
	  }
		
  }
	public static int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}

}
