package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String whizz = "Whizz";
        String output = "";

        if (order % 3 == 0)
            output += fizz;
        if (order % 5 == 0)
            output += buzz;
        if (order % 7 == 0)
            output += whizz;
        if (output.length() == 0)
            output = String.valueOf(order);

        return output;
    }

}
