package com.example.games;

public class TempleRun implements Game{
    public  void up(){
        System.out.println("TR jumps");
    }
    public  void down(){
        System.out.println("TR ducks");
    }
    public  void left(){
        System.out.println("TR moves left");
    }
    public  void right(){
        System.out.println("TR moves right");
    }
}
