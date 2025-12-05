package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int generator;
    private int userGuess;
    private int tries;
    Random r= new Random();

    public Game(){
        generator=r.nextInt(501);
        tries=0;
    }

    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        userGuess=sc.nextInt();
    }

    public int guessCondition(){
        tries++;
        if (generator==userGuess){
            System.out.printf("You guessed it correctly. It was %d\n",generator);
            System.out.printf("Congratulations!!! You did it in %d tries.", tries);
            return 1;
        } else if (generator < userGuess) {
            System.out.println("Lower");
            return 0;
        } else if (generator> userGuess) {
            System.out.println("Higher");
            return 0;
        } else{
            System.out.println("Something went wrong. Please try again.");
            return 0;
        }
    }

}

public class guess_the_number {
    public static void main(String[] args) {

        Game player= new Game();
        System.out.println("Enter your guess from 0 to 500:");
        int cons= 0;
        while(cons==0) {
            player.takeUserInput();
            cons= player.guessCondition();
        }
    }

}
