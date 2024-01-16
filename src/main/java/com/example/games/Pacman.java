package com.example.games;

public class Pacman implements Game{
    public  void up(){
        System.out.println("Pacman jumps");
    }
    public  void down(){
        System.out.println("Pacman ducks");
    }
    public  void left(){
        System.out.println("Pacman moves left");
    }
    public  void right(){
        System.out.println("Pacman moves right");
    }
}
