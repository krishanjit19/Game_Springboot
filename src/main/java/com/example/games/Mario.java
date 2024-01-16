package com.example.games;

public class Mario implements Game{
    public  void up(){
        System.out.println("Mario jumps");
    }
    public  void down(){
        System.out.println("Mario ducks");
    }
    public  void left(){
        System.out.println("Mario moves left");
    }
    public  void right(){
        System.out.println("Mario moves right");
    }
}
