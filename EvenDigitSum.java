public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){ return -1;} // if the input is less than 0 or negative it returns a -1
       int even = 0;
        while(number > 1){
            int total;
            total =number;
            total = number % 10; // isolates each number / last digit
            if (total % 2 ==0){ // checks to see if that digit is even if it is then it adds it to the total
                even += total;
            }
            number /= 10; // moves on to the next number by moving the decimal over by one until it exits the loop

        }
     return even;
    }
}
