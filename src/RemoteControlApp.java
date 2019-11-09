import java.util.Scanner;

public class RemoteControlApp {
	
	/*
	 * Overview 
	 * We are going to simulate a remote control. It will have buttons "0"
	 * to "9", "ON", and "OFF". In order to operate the remote control, the user
	 * must first turn it on. Once it is turned on, the user can enter a number from
	 * 0 through 9, or turn the remote control back off.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("To Begin, Turn ON The Remote Control: ");
		String userInput = keyboard.next().toLowerCase();
		
		while (!userInput.equals("on")) {
			System.out.println("Please Turn ON Remote To Use Features");
			userInput = keyboard.next().toLowerCase();
		}
		turningON();	// tells program to go to main "turningON()"

	}
	
	public static void turningON() {
		System.out.println("Turning ON.... ");
		inputNum();		// Tells program to go to method "inputNum();"
	}
	public static void pressButton() {
		System.out.println("BOOP!");
		
		inputNum();		//tells program to go to main "inputNum()"
	}
	public static void inputNum() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Input a Number 0 through 9: ");
		String userInput = keyboard.next().toLowerCase();		//prompts user to input another number
	    switch (userInput) {
	    	case "0":
	      case "1":
	      case "2":
	      case "3":
	      case "4":
	      case "5":
	      case "6":
	      case "7":
	      case "8":
	      case "9":
	    	  pressButton();			//sends program back to main "pressButton()" BOOP!
	    	  break;
	      case "off":
	    	  turningOff();
	    	  break;
	      default:
	          System.err.println("Command Not Recognized");
	          inputNum();
	    }
	    keyboard.close();
	    }
		public static void turningOff() {
			System.out.println("TURNING OFF....");
		
	}
}

