package dminer.service;

public class FizzBuzz {

	public String say(int number) {
		if(number % 3 == 0)
			return "Fizz";
		if(number % 5 == 0)
			return "Buzz";
		if(number % 3 == 0 && number % 5 == 0)
			return "FizzBuzz"
		return String.valueOf(number);
	}

}
