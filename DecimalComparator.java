public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double parameter, double parameter2 )  {

//        return (int) (parameter * 1000) == (int) (parameter2 * 1000);

        if ((int) (parameter * 1000) == (int) (parameter2 * 1000)){

            // 3.1756 -3.175 = -3175 -3175

            System.out.println(true);
            System.out.println(parameter + " " + parameter2);

            return true;
        }
        System.out.println(false);
        System.out.println(parameter + " " + parameter2);

        return false;
    }
}
