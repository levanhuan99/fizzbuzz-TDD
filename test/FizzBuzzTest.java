import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void testNumber(){
        int number=3;
        String expected= "Fizz ba ";

        String result =FizzBuzz.numberTranslate(number);
        assertEquals(expected,result);
    }
    @Test
    public void testNumber1(){
        int number=5;
        String expected= "Buzz nam ";

        String result =FizzBuzz.numberTranslate(number);
        assertEquals(expected,result);
    }
    @Test
    public void testNumber2(){
        int number=15;
        String expected= "FizzBuzz and mot nam ";

        String result =FizzBuzz.numberTranslate(number);
        assertEquals(expected,result);
    }

    @Test
    public void testNumber3(){
        int number=101;
        String expected= "out of 0-100";

        String result =FizzBuzz.numberTranslate(number);
        assertEquals(expected,result);
    }

}