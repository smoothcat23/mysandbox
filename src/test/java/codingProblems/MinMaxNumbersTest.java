package codingProblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.teachme.codingProblems.MinMaxNumbers;

public class MinMaxNumbersTest {
    private MinMaxNumbers mmn;

    @BeforeEach
    public void initTest(){
        int[] numbers = {3,56,214,23,23,7,344};
        mmn = new MinMaxNumbers(numbers);
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }

    @Test
    public void checkLowestNumber(){
        Assertions.assertEquals(3,mmn.getMin());
    }

    @Test
    public void checkHighestNumber(){
        Assertions.assertEquals(344,mmn.getMax());
    }

    @Test
    public void checkNull(){
        mmn.setNumbers(null);
        Assertions.assertThrows(NullPointerException.class, () -> mmn.getMin());
    }

}
