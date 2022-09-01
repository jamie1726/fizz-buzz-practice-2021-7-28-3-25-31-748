package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order){
        String fizz = "Fizz";
        String buzz = "Buzz";
        String whizz = "Whizz";
        if (order%3==0){
            return fizz;
        } else if (order%5==0) {
            return  buzz;
        } else {
            return String.valueOf(order);
        }

    }

}
