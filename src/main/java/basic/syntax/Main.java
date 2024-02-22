package basic.syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int adultHood = 18;
        int userAge;
        String userName = "";
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello, what is your name?");
        userName = reader.readLine();
        System.out.println("What date were you born? (just write a number)");
        int date = Integer.parseInt(reader.readLine());

        System.out.println("Hello, " + userName + ", how old are you?");
        userAge = scanner.nextInt();

        if (userAge >= adultHood){
            Move();
        }
        else {
            System.out.println("You can't move now, come back in " + (adultHood - userAge) + " years");
        }
    }

    private static void Move() {
        System.out.println("Amazing! We are moving!");
    }
}