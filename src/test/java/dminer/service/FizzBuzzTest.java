package dminer.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
	private int number;
    private String expected;
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
        		{ 1, "1" }, { 2, "2" }, { 3, "Fizz" }  
           });
    }

    public FizzBuzzTest(int number, String expected) {
    	this.number = number;
        this.expected = expected;
    }
    
    @Test
    public void shouldSayWithFizzBuzzRule() {
		assertEquals(this.expected, fizzBuzz.say(this.number));
	}
    	
}
