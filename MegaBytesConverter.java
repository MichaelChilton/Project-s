public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int xx = kiloBytes; // kiloBytes


        int yy = kiloBytes / 1024; // This should be the MegaBytes

        int zz = xx - (yy * 1024); // this should be the remainder

        if (kiloBytes >= 0) {
            System.out.println(xx + " KB = " + yy + " MB and " + zz + " KB");
        }if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

    }

}
