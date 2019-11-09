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
		String userInput = keyboard.next();
		
		while (!userInput.equals("ON")) {
			System.out.println("Please Turn ON Remote To Use Features");
			userInput = keyboard.next();
			
		}
		pressButton();
		
	}
	
	public static void pressButton() {
		System.out.println("button Pressed");
	}
// TODO: Add pressButton() method
// TODO: AddturnOn() method
}
