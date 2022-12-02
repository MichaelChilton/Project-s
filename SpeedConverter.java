public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {

        if(kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }
    public static void printConvertion(double KilometersPerHour) {

        if(KilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour +
                                " km/h= " + milesPerHour +
                                " mi/h");

        }

    }
}
