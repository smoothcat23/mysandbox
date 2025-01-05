package codingProblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.teachme.codingProblems.Fibonacci;

 
public class FibonacciTest {
    public Fibonacci f;

    @BeforeEach
    public void initTest(){
        f = new Fibonacci(14);
    }

    @Test
    public void checkSequence(){
        int[] expectedSequence = {1,1,2,3,5,8,13};
        Assertions.assertArrayEquals(expectedSequence, f.getSequenceStream());
    }

}
