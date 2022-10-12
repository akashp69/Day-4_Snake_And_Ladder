package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {

        System.out.println("Snake and Ladder game played with single player at start position 0");
        int position=0;
        int check =(int) (Math.random() * 10) %6 +1;

        position=position + check;
        System.out.println("Current position is :" + position);
    }
}
