package com.project.enumTest;

public class LevelTest {

	public static void main(String[] args) {
		Levels l=Levels.LOW;
		
		switch(l) {
		case HIGH:
			System.out.println("This is High level");
			break;
		case LOW:
			System.out.println("This is Low level");
			break;
		case MEDIUM:
			System.out.println("This is Medium level");
			break;
		}
		
		l.show();
		
		

	}

}
