package Loops;

import java.util.Scanner;

public class Q44_GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = 0;
        randomNum = (int) (Math.random() * 100) + 1;
//        System.out.println(randomNum);
        int guessedNum , chances = 8;
        do {
            System.out.print("Guess the number: ");
            guessedNum = sc.nextInt();
            if (guessedNum == randomNum) {
                System.out.println("Congratulations You win !");
                System.out.println(STR."Your Score : \{chances * 10 + 20}");
                break;
            };
            System.out.print(guessedNum > randomNum ? "Think SMALL" : "Think BIG");
            System.out.println(STR.", chances left : \{--chances}");
        }
        while (chances != 0);
    }
}
