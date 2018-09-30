enum SwitchInputs {
    INPUT1, INPUT2, INPUT3, DEFAULT
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println(checkIfElse(100));
        System.out.println(checkSwitchCase(SwitchInputs.DEFAULT));
    }

    public static boolean checkIfElse(int input) {
        return input > 80;
    }

    public static int checkSwitchCase(SwitchInputs input) {
        switch (input) {
            case INPUT1:
                return 1;
            case INPUT2:
                return 2;
            case INPUT3:
                return 3;
            default:
                return 0;
        }
    }
}
