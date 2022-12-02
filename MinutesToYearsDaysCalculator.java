public class MinutesToYearsDaysCalculator {
    public static  void printYearsAndDays(long minutes) {
        long XX = minutes; // 561600

        long HH = XX / 60L; // 561600 / 60 = 9360 hours
        long Zz =  HH / 24L; // 9360 / 24 = 390 days
        long YY = Zz / 365L; // 390 / 365 = 1 year
        long ZZ = Zz % 365L;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
        }

        return;


    }
}
