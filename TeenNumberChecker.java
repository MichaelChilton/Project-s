public class TeenNumberChecker {
    public static boolean hasTeen(int parameter, int parameter2, int parameter3) {

        if (parameter >= 13 && parameter <= 19 ) {
            return true;
        } else if (parameter2 >= 13 && parameter2 <= 19) {
            return true;
        }else if (parameter3 >= 13 && parameter3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int parameter) {
        return parameter >= 13 && parameter <= 19;

    }

}
