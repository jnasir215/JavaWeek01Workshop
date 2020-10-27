package com.codedifferently.part01;

import java.io.Console;

public class Greetings {
    public static void main(String[] args) {

        Console console = System.console();			//Defines console to elicit processes from the class Console
        String name = console.readLine("What is your name? ");  //Assigns user input to the String variable "name"
		if((name.equalsIgnoreCase("Hakim")) ||
		   (name.equalsIgnoreCase("Rasheeda"))) {
			console.printf("Hello %s \n", name);		//Greets the user if their  name is Hakim or Rasheeda
			System.exit(0);					//Exits the program
		}
		else console.printf("We are looking to greet either Hakim or Rasheeda. Goodbye! \n");
		System.exit(0);		//If their name is not Hakim or Rasheeda, lets the user know and Exits the program
	}
}

