public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (!barking) {
            return false;

        } else if (barking){
            if (hourOfDay < 8 && hourOfDay > 0 || hourOfDay > 22 ) {
                return true;

            }

        }
        return false;
    }
}
