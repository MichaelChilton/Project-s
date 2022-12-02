public class PerfectNumber {
    public static boolean isPerfectNumber(int number) { // 6
        if (number < 1){
            return false;
        }
        int perfect = 0;
        int x = 0;
        int number2 = number;
        while (x < number2){
            x++;
            if (number2 % x == 0 && x != number){
                perfect += x;
                if (perfect == number){
                    return true;
                }

            }
        }
        return false;
    }
}
