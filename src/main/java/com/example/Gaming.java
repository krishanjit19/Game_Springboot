package com.example;

import com.example.games.Game;
import com.example.games.GameRunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
public class Gaming {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Get user input to choose a Game
        int userInput = getUserInput();
        Game selectedGame = (Game)context.getBean("pacman");

        switch (userInput){
            case 1: selectedGame = (Game)context.getBean("pacman");
            break;

            case 2: selectedGame = (Game)context.getBean("mario");
                break;

            case 3: selectedGame = (Game)context.getBean("templeRun");
                break;
            case 0: selectedGame = (Game)context.getBean(Game.class);
        }
        //creating the gme running and running the game
        GameRunner gameRunner = new GameRunner(selectedGame);
        gameRunner.run();
    }

    private static int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the game you want to run [1:Pacman, 2:Mario, 3:TempleRun: ");
        return scanner.nextInt();
    }


}
