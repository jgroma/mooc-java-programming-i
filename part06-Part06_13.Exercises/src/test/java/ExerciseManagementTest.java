import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ExerciseManagementTest {

    @Test
    public void calculatorInitialValueZero() {
        ExerciseManagement calculator = new ExerciseManagement();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        ExerciseManagement calculator = new ExerciseManagement();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        ExerciseManagement calculator = new ExerciseManagement();
        calculator.subtract(2);
        assertEquals(-2, calculator.getValue());
    }
}
