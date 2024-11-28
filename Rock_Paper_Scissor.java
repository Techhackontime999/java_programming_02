package com.BasicProgram;

import java.util.Scanner;
import java.util.Random;;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        // generate a random number integer within range 0-89
        int randnum = rc.nextInt(90);
        System.out.println("********** Welcome To Rock Paper Scissor *********");
        System.out.println("Condition:\n1.Rock Crushes Scissors.\n2.Scissors Cuts Paper.\n3.Paper Covers Rock.");
        System.out.print("Enter A To Accept : ");
        char Condn = sc.next().charAt(0);
        if (Condn == 'A') {
            // start playing
            char compChoice;
            // comp turn
            if (randnum >= 0 && randnum <= 29) {
                compChoice = 'R';
            } else if (randnum >= 30 && randnum <= 59) {
                compChoice = 'P';
            } else {
                compChoice = 'S';
            }
            // your turn
            System.out.print("Enter You Choice 'R' For Rock 'P' For Paper 'S' For Scissor:   ");
            char userChoice = sc.next().charAt(0);
            // Game win
            if (userChoice == 'R' || userChoice == 'P' || userChoice == 'S') {
                if (userChoice == compChoice) {
                    System.out.println("************************************************");
                    System.out.println("Game is Tie ! Both Chooses: " + userChoice);
                } else if (userChoice == 'R' && compChoice == 'P') {
                    System.out.println("************************************************");

                    System.out.println("Computer Choose: " + compChoice + " You Choose: " + userChoice
                            + "! Computer Win ! You Loose");
                            System.out.println("Oh ! Paper Covers Rock.");
                }

                else if (userChoice == 'S' && compChoice == 'R') {
                    System.out.println("************************************************");

                    System.out.println("Computer Choose: " + compChoice + " You Choose: " + userChoice
                            + "! Computer Win ! You Loose");
                            System.out.println("Oh ! Rock Crushes Scissors.");


                }

                else if (userChoice == 'P' && compChoice == 'S') {
                    System.out.println("************************************************");

                    System.out.println("Computer Choose: " + compChoice + " You Choose: " + userChoice
                            + "! Computer Win ! You Loose");
                            System.out.println("Oh ! Scissors Cuts Paper.");


                } else {
                    System.out.println("************************************************");

                    System.out.println("Computer Choose: " + compChoice + " You Choose: " + userChoice
                            + "! Wow ! You Win ! Computer Loose");


                }
            } else {
                System.out.println("************************************************");

                System.out.println("Invalid Input ! Kindly Try Again.");

            }

        }

        else {
            // No playing
            System.out.println("Need To Accept Condition To Play.");
        }
    }
}
