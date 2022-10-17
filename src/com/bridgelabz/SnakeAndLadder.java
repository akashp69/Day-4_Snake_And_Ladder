package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int position=96;
        int snake= (int) Math.floor(Math.random() * 10) %3;
        int check =(int) Math.floor(Math.random() * 10) %6 +1;
        if(snake==1) {
            position =position + check;
            if(position<=100)
            System.out.println("Ladder Option Moves Ahead " + position );
        }
        else if(snake==2)  {
            position =position - check;
            System.out.println("Snake Option Moves Behind " + position );
        }
        else {
            position=position;
            System.out.println("No Play");
        }
        if(position<=100)
            System.out.println("current postion after roll die is: " + position);
        else
            System.out.println("Throw Die Again");

        }}
