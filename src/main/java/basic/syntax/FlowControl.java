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
}
