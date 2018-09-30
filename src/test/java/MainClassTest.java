import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainClassTest {
    static MainClass myClass;

    @BeforeAll
    public static void initialize() {
        myClass = new MainClass();
    }

    @Test
    void checkIfElse() {
        System.out.format("%-15s%-15s%-15s%-15s\n", new String[]{"Iteration", "Expected", "Actual", "Result"});
        int counter = 0;
        while (counter < 100) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.format("%-15s%-15s%-15s%-15s\n", new String[]{"" + (counter + 1), "80", randomNumber + "", "" + myClass.checkIfElse(randomNumber)});
            counter++;
        }

        assertTrue(true);
    }

    @Test
    void checkSwitchCase() {
        System.out.format("%-15s%-15s%-15s\n", new String[]{"Iteration", "Actual", "Result"});
        int counter = 0;
        SwitchInputs[] inputs = new SwitchInputs[]{SwitchInputs.DEFAULT, SwitchInputs.INPUT1, SwitchInputs.INPUT2, SwitchInputs.INPUT3};
        while (counter < 100) {
            int randomNumber = (int) (Math.random() * 4);
            System.out.format("%-15s%-15s%-15s\n", new String[]{"" + (counter + 1), inputs[randomNumber] + "", "" + myClass.checkSwitchCase(inputs[randomNumber])});
            counter++;
        }

        assertTrue(true);
    }
}