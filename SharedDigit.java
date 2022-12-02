public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){

        if (number1 <= 10 || number2 <= 10 || number1 > 99 || number2 > 99){
            return false;
        }
        int even2 = number2 % 10;
        int even = number1 % 10;
        int num1 = 0;
        int num2 = 0;
        while (number1 > 0){
            if (number1 < 10){
                num1 += number1;
            }
            number1 /= 10;
        }
        while (number2 > 0){
            if (number2 < 10){
                num2 += number2;
            }
            number2 /= 10;
        }

         return even == even2 || even == num2 || num1 == num2 || num1 == even2;
    }
}