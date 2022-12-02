public class  isPalindrome {
    public static boolean ispalindrome(int number) { // 1001

        int reverse = 0;
        if(number < 0){  // any negative number is converted to positive
            number = number * -1;
        }
        int stored = number;


        while (stored > 0)  // 1001
        {

            int digit = stored % 10;  // First loop : 1001 % 10 = 1 since the remainder would be one
                                      // Second loop : 100.1 % 10 = 0 since 10 goes into 100 perfectly
                                      // Third loop :  10.01 % 10 = 0
                                      // Fourth loop : 1.001 % 10 = 1

            System.out.println(digit); // First loop : this is 1
                                       // Second loop : 0
                                       // Third loop : 0
                                       // Fourth loop : 1

            reverse = (reverse * 10) + digit; // First loop : reverse = 0 so 0*10 = 0 + digit"1" = 1
                                              // Second loop :  reverse = 1 so 1 * 10 = 10 + digit"0" = 10
                                              // Third loop : reverse = 10 * 10 == 100 + digit"0" = 100
                                              // Fourth loop : reverse = 100 * 10 == 1000 + digit"1" = 1001

            System.out.println(reverse); // First loop : 1
                                         // Second loop :  10
                                         // Third loop : 100
                                         // Fourth loop : 1001

            stored /= 10;  // First loop : 1001 / 10 = 100.1
                           // Second loop :  100.1 / 10 == 10.01
                           // Third loop : 10.01 / 10 == 1.001
                           // Fourth loop : 1.001 / 10 == 0.1001 This will exit the loop since it is 0

        }

    return number == reverse;
    }
}
