package codingProblems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.teachme.codingProblems.Palindrome;

public class PalindromeTest {
    private List<String> palindromStrings;
    private List<String> nonePalindromStrings;
    private Palindrome palindrome;

    @BeforeEach
    public void initTest(){
        palindromStrings = Arrays.asList("", "otto", "anana","saippuakivikauppias");
        nonePalindromStrings = Arrays.asList("Otto", "Nicole","saippaakivikauppias");
        palindrome = new Palindrome();
    }

    @Test
    public void checkPalindromes(){
        palindromStrings.forEach(p -> Assertions.assertEquals(p, palindrome.getPalindrome(p)) );
    }

    @Test
    public void arePalindromes(){
        palindromStrings.forEach(p -> Assertions.assertTrue(palindrome.isPalindrome(p)) );
    }

    @Test
    public void areNotPalindromes(){
        nonePalindromStrings.forEach(p -> Assertions.assertFalse(palindrome.isPalindrome(p)) );
    }

    @Test
    public void checkNull(){
        assertNull( palindrome.getPalindrome(null) );
    }
}
