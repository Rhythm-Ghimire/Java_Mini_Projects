package com.company;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        Random r= new Random();

        System.out.println("Enter R for Rock, P for Paper, S for Scissors: ");
        String userInp= s.next();
        int cpu=r.nextInt(3);

        switch(userInp){
            case "R":
                if(cpu==0){
                    System.out.println("CPU plays ROCK!\nIts a tie.");
                    break;
                } else if(cpu==1){
                    System.out.println("CPU plays Paper!\nCPU wins.");
                    break;
                } else if (cpu==2) {
                    System.out.println("CPU plays Scissors!\nYou win.");
                    break;
                }
                else{
                    System.out.println("Error! Try again.");
                }
                break;

            case "P":
                if(cpu==0){
                    System.out.println("CPU plays ROCK!\nYou win.");
                    break;
                } else if(cpu==1){
                    System.out.println("CPU plays Paper!\nIts a tie.");
                    break;
                } else if (cpu==2) {
                    System.out.println("CPU plays Scissors!\nCPU wins.");
                    break;
                }
                else{
                    System.out.println("Error! Try again.");
                }
                break;

            case "S":
                if(cpu==0){
                    System.out.println("CPU plays ROCK!\nCPU wins.");
                    break;
                } else if(cpu==1){
                    System.out.println("CPU plays Paper!\nYou win.");
                    break;
                } else if (cpu==2) {
                    System.out.println("CPU plays Scissors!\nIts a tie.");
                    break;
                }
                else{
                    System.out.println("Error! Try again.");
                }
                break;

            default:
                System.out.println("Please enter a valid input.");

        }
    }
}
