package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position=43;
        int snake= (int) Math.floor(Math.random() * 10) %3;
        int check =(int) Math.floor(Math.random() * 10) %6 +1;
        if(snake==1) {
            position =position + check;
            System.out.println("Ladder Moves Ahead");
        }
        else if(snake==2)  {
            position =position - check;
            System.out.println("Snake Moves Behind");
        }
        else {
            position=position;
            System.out.println("No Play");

        }
        System.out.println("current postion after 43 is: " + position);

    }}
