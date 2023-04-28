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
		int userChoice = 0;

		loop: while (userChoice != 3) {
			menu();
			userChoice = input.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println("Enter film id");
				int id = input.nextInt();
				
				film = db.findFilmById(id);
				if (film != null) {
					System.out.println(film);
				} else {
					System.out.println("No such film exist");
				}
				break;
			case 2:
				System.out.println("Type in keyword");
				String keyword = input.nextLine();
				
				if (keyword != null) {
					System.out.println();

				} else {
					System.out.println("No such film exist");
				}
				break;
			case 3:
				System.out.println("Goodbye");
				break loop;
			default:
				System.out.println("invalid entry");
				break;
			}
		}

	}

	private void menu() {
		System.out.println("1. Look up film by id");
		System.out.println("2. Look up film by a keyword search");
		System.out.println("3. exit");

	}

}
