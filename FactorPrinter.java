public class FactorPrinter {
    public static void printFactors(int number) { // 20
        int x = 1;
        if(number < 1){
            System.out.println("Invalid Value");
        }else {
            int print = number;
            while (x <= number) {
                if (print % x == 0) {
                    System.out.println(x);
                }
                x += 1;
            }
        }
    }
}
