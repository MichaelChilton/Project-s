public class getDurationString {
    public static String getDurationString(int minutes, int seconds) {



        int hours = minutes / 60; // see's how many times 60 goes into the number of minutes i have the remainder is calculated below

        int minutes2 = minutes % 60; // give me how many minutes are left over in an hour for example 132 minutes would be 13 minutes and then my hours int will take the 120 minutes



        if(((seconds >= 0) && (seconds <= 59))  && (minutes >=0 )){



            return  hours + "h " + minutes2 + "m " + seconds + "s ";

        }
        return "invalid value";
    }
    public static String getDurationString(int seconds) {



        if(seconds >=0){
            int minutes = seconds / 60;
            int secoundss = seconds % 60;

    return getDurationString.getDurationString(minutes,secoundss);

        }
        return "invalid value";

    }

}

