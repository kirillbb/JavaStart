package basic.syntax;

public class FlowControl {
    public static void main(String[] args) {
    }

    public static void ifElseDemo(boolean var) {
        if (var) {
            System.out.println(1);
        } else if (!var) {
            System.out.println(0);
        } else {
            System.out.println();
        }
    }

    public static int switchCaseDemo(int userInput) {
        switch (userInput) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                break;
            default:
                return -1;
        }

        return 2;
    }

    public static void whileDemo() {
        int num = 0;
        while (num <= 10) {
            if ((num % 2) == 0) {
                num++;
                continue;
            } else {
                System.out.println(num);
                num++;
            }
        }
    }

    public static void forDemo() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void doWhileDemo() {
        int num = 10;
        do {
            System.out.println(num--);
        } while (num >= 0);
    }

    public static void forEachDemo() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int item : array) {
            System.out.println("Item: " + item);
        }
    }
}
