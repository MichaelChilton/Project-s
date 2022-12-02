public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 1){
            System.out.println("Invalid Value");
        }
        while(number >= 0){

            int number2 = number % 10;
            switch (number2) {
                case 0:
                    number2 = 0;
                    System.out.println("Zero");
                    break;
                case 1:
                    number2 = 1;
                    System.out.println("One");
                    break;
                case 2:
                    number2 = 2;
                    System.out.println("Two");
                    break;
                case 3:
                    number2 = 3;
                    System.out.println("Three");
                    break;
                case 4:
                    number2 = 4;
                    System.out.println("Four");
                    break;
                case 5:
                    number2 = 5;
                    System.out.println("Five");
                    break;
                case 6:
                    number2 = 6;
                    System.out.println("Six");
                    break;
                case 7:
                    number2 = 7;
                    System.out.println("Seven");
                    break;
                case 8:
                    number2 = 8;
                    System.out.println("Eight");
                    break;
                case 9:
                    number2 = 9;
                    System.out.println("Nine");
                    break;

            }





            number /= 10;

        }

    }
}
