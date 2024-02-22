package basic.syntax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int adultHood = 18;
        int userAge;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, how old are you?");
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