package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order){
        String fizz = "Fizz";
        String buzz = "Buzz";
        if (order%3==0){
            return fizz;
        }
        else {
            return String.valueOf(order);
        }

    }

}
