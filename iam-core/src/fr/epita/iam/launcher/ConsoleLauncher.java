package fr.epita.iam.launcher;
/* author TanCAO */

import java.util.Scanner;

public class ConsoleLauncher {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the IM application");
		boolean authenticated = authenticate(scanner);
		if (authenticated){
			
		}
	
	System.out.println("Your options");
	}

	private static boolean authenticate(Scanner scanner) {
		System.out.println("Please enter your login");
		String login = scanner.nextLine();
		
		System.out.println("Please enter your password");
		String password = scanner.nextLine();
		
		boolean authenticated=false;
		
		//TODO replace this hardcode check by the real authent method
		if (login.equals("admin") && password.equals("password")){
			System.out.println("You are authenticated");
			return true;
		}
		else {
			System.out.println("Fail");
			scanner.close();
			return false;
		}
		
		menu();
		String answer = scanner.nextLine();
		switch (answer) {
		case "a":
			System.out.println("You selected: ID creation");
			System.out.println("Please enter ID display name");
			String displayName = scanner.nextLine();
			
		}
	}

	private static void menu() {
		System.out.println("You're authenticated");
		System.out.println("Available choice");
		System.out.println("a. Creat an ID");
		System.out.println("b. Modify an ID");
		System.out.println("c. Delete an ID");
		System.out.println("d. List ID");
		System.out.println("e. Quit");
		System.out.println("Your choice (a|b|c|d|e) ? : ");
	}
	
}
