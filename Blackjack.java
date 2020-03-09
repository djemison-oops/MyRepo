import java.util.*;
import java.util.Scanner;
import java.lang.String;


import java.util.Scanner;
public class Blackjack { jhgfjhvjvjuhvy
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P1Random rng = new P1Random();

        boolean r = true;
        int selection;
        int dealerWins = 0;
        int yourWins = 0;
        int totalOfCards = 0;
        int numberOfTies = 0;
        int numberOfGamesplayed = 0;
        int i = 0;
                                        //initializing variables outside of while loop
        while (r == true) {

            i++;

            int myNumber1 = rng.nextInt(13) + 1; // if and else if statements used for specials cases of cards

            System.out.println("START GAME #" + i+"\n");

            //int dealersValue = rng.nextInt(11) + 16;
            //int anotherNumber = rng.nextInt(10) + 1;
            if (myNumber1 == 12) {
                System.out.println("Your card is a Queen!");
                myNumber1 = 10;
            } else if (myNumber1 == 13) {
                System.out.println("Your card is a KING!");
                myNumber1 = 10;
            } else if (myNumber1 == 11) {
                System.out.println("Your card is a Jack!");
                myNumber1 = 10;
            } else if (myNumber1 == 1) {
                System.out.println("Your card is a ACE!");

            } else {
                System.out.println("Your card is a " + myNumber1 + "!");
            }
            totalOfCards += myNumber1;
            System.out.println("Your hand is: " + (totalOfCards)+"\n");
           // System.out.println("Your hand is: " + (totalOfCards + myNumber));
            while (r == true) {
                System.out.println("1. Get another card"); // prints out options and what player can do
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit"+ "\n");
                //while (r == true) {
                System.out.print("Choose an option: "); //prompts player to enter number
                selection = scanner.nextInt();
                System.out.println();

                if (selection == 1) { // case 1 adds the card and can end games if 21 or over is reached
                    int myNumber = rng.nextInt(13) + 1;
                    if (myNumber == 12) {
                    System.out.println("Your card is a a Queen!"); //special cases are shown again in this case so that the player knows what card ended the game
                    myNumber = 10;
                } else if (myNumber == 13) {
                    System.out.println("Your card is a KING!");
                    myNumber = 10;
                } else if (myNumber == 11) {
                    System.out.println("Your card is a Jack!");
                    myNumber = 10;
                } else if (myNumber == 1) {
                    System.out.println("Your card is a ACE!");

                } else {
                    System.out.println("Your card is a " + myNumber + "!");
                }

                    totalOfCards += myNumber;
                System.out.println("Your hand is: " + (totalOfCards)+ "\n");

                    if ((totalOfCards) == 21) {
                        System.out.println("BLACKJACK! You win!"); // here is the statement for if the player wins in case 1
                        totalOfCards = 0;
                        yourWins++;
                        numberOfGamesplayed++;
                        break;
                    }
                    if ((totalOfCards) > 21) {
                        System.out.println("You exceeded 21! You lose."); // here is the statement if the player looses in case 1
                        totalOfCards = 0;;
                        dealerWins++;
                        numberOfGamesplayed++;
                        break;

                    }

                    //break;
                } else if (selection == 2) { // case two is for if the player holds and ends the game

                    int dealersValue = rng.nextInt(11)+16;//range for dealerValue is initialized
                    System.out.println("Dealer's hand:" + dealersValue);
                    System.out.println("Your hand is: " + (totalOfCards));
                    if ((dealersValue > 21) || (totalOfCards) > dealersValue) { // the winning statement
                        System.out.println("You win!");
                        yourWins++;
                        totalOfCards = 0;
                        numberOfGamesplayed++;
                        break;
                    }
                    if ((dealersValue == 21) || (totalOfCards) < dealersValue) { // dealer winning statement
                        System.out.println("Dealer wins!");
                        dealerWins++;
                        totalOfCards = 0;
                        numberOfGamesplayed++;
                        break;

                    }
                    if ((dealersValue) == (totalOfCards)) {

                        System.out.println("It's a tie! No one wins!"); // special case for a tie
                        totalOfCards = 0;
                        numberOfTies++;
                        numberOfGamesplayed++;
                        break;
                    }
                    } else if (selection > 4 || selection < 1) {

                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer value between 1 and 4."); // invalid input case
                    } else if (selection == 4) { // to exit loop
                        System.exit(1);
                    }
                    else if (selection == 3) { // to get a breakdown of the past games played

                        System.out.println("Number of Player wins: " + yourWins);
                        System.out.println("Number of Dealer wins: " + dealerWins);
                        System.out.println("Number of tie games: "+ numberOfTies);
                        System.out.println("Total # of games played is: " + numberOfGamesplayed);
                        System.out.println("Percentage of Player wins: " + (((double) yourWins/numberOfGamesplayed)*100)+"%"+ "\n");
                }
                }
                    //}

            }

        }


    }



