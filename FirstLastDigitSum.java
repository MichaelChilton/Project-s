public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0){return -1;} // if less than 0 then return -1
        int stored = number;
        int total = 0;
                 int first = number % 10;  // gets the first number
                 total += first; // adds the first number to my total
            while (stored > 0){
                if (stored < 10){  // collects my last number and then adds it to my total :)
                    total += stored;
                }

            stored /= 10; // divides each loop until it reaches 0 to exit the loop


       }
    return total;
    }
}
