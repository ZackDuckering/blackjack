package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computersCards = (random.nextInt(11) + 1) + (random.nextInt(11) + 1);

        int firstCard = random.nextInt(11) + 1;
        int secondCard = random.nextInt(11) + 1;


        if ((firstCard == 1) || (firstCard == 11)) {
            System.out.println("Would you like your Ace to be worth 1 or 11");
            firstCard = input.nextInt();
            while ((firstCard != 1) && (firstCard != 11)) {
                System.out.println("That number is not allowed for your first card!");
                firstCard = input.nextInt();
            }

        }
        if ((secondCard == 1) || (secondCard == 11)) {
            System.out.println("Would you like your Ace to be worth 1 or 11");
            secondCard = input.nextInt();
            while ((secondCard != 1) && (secondCard != 11)) {
                System.out.println("That number is not allowed for your second card!");
                secondCard = input.nextInt();
            }
        }
        System.out.println("Your first set of cards are " + firstCard + " and " + secondCard);
        int sum = firstCard + secondCard;
        while (sum < 21) {
            System.out.println("Do you want another card, input yes or no");
            String answer = input.next();
            if (answer.equals("yes")) ;


        }
    }
}
