public class case1 {
    public static String expcase(int range, int number) {

        if (range <= number || range < 0 || number < 0){
            return "Please enter a postive number and correct range";
        }
        while (number > 10) {
            number /= 10;
        }

            switch (number) {
                case 1:
                    return "Its a great day!";
                case 2:
                    return "When should we explore the world";
                case 3:
                    return "Things can always get a little better";
                case 4:
                    return "You're doing great today";
                case 5:
                    return "Please try to check on your goals today!";
                case 6:
                    return "Remember you're doing a amazing job!";
                case 7:
                    return "Today is a friday make it through";
                case 8:
                    return "Go out and get some food ";
                case 9:
                    return "Go back to work!";
                case 10:
                    return "You got mail";


            }return "It should not make it here";


    }
}
