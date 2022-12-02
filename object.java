public class object {
    public static String crash(int speed, int distance) { // 50

        if (speed < 0 && distance < 0){
            return "Please input a positive number for all integers";
        }
        int emergencyBrake = 0;

        while(distance >= 0){ // 50

            emergencyBrake+=1;

            distance --;
    }
        speed = speed - emergencyBrake;
        if (speed < 60){
            return "Likely to be alive!";

        } else if (speed > 60 && speed <100) {
            return "May be heavily injured";
        }else return "Sorry for your loss";


    }
}
