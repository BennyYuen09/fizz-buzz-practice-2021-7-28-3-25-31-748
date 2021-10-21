package tdd.fizzbuzz;

public class FizzBuzz{
    public String countOff(int order) {
        StringBuilder output = new StringBuilder();

        if (order % 3 == 0){
            output.append("Fizz");
        }
        if (order % 5 == 0){
            output.append("Buzz");
        }
        if (order % 7 == 0){
            output.append("Whizz");
        }

        if (output.length() == 0){
            return String.valueOf(order);
        }
        return output.toString();
    }
}
