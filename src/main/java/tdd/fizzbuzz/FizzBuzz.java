package tdd.fizzbuzz;

public class FizzBuzz{
    public String countOff(int order) {

        if (order % 3 == 0){
            return "Fizz";
        }else if (order % 5 == 0){
            return "Buzz";
        }else if (order % 7 == 0){
            return "Whizz";
        }
        return String.valueOf(order);
    }
}
