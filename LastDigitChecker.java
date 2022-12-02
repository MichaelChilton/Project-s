public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number, int number2, int number3) {
      // if (number < 10 || number2 < 10 || number3 < 10 || number > 1000 || number2 > 1000 || number3 > 1000) {
          // return false;
       //}
        if (isValid(number) && isValid(number2) && isValid(number3)){



        int v = number % 10;
        int x = number2 % 10;
        int c = number3 % 10;

        return v == x || v == c || c == x;



    }
        return false;
    }

    public static boolean isValid(int range) {

        return range >= 10 && range <= 1000;

    }
}
