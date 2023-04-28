package com.skilldistillery.filmquery.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	private DatabaseAccessor db = new DatabaseAccessorObject();
	Scanner input = new Scanner(System.in);
	Actor actor = new Actor();
	Film film = new Film();

	public static void main(String[] args) {
		FilmQueryApp app = new FilmQueryApp();
		app.launch();
	}

	private void launch() {

		startUserInterface(input);

		input.close();

	}

	private void startUserInterface(Scanner input) {
		
		System.out.println("1. Look up film by id");
		System.out.println("2. Look up film by a keyword search");
		System.out.println("3. exit");
		int userChoice = input.nextInt();
	do {	

		input.next();

		switch (userChoice) {
		case 1:
			 	if(db != null) {
			 		
			 	}else {
			 		System.out.println("No such film exist");
			 	}
			break;
		case 2:
			if(db != null) {
		 		
		 	}else {
		 		System.out.println("No such film exist");
		 	}
			break;
		case 3:
			System.out.println("Goodbye");
			break;
		default:
			System.out.println("invalid entry");
			break;
		}
	}while(userChoice != 3);

	}

}
