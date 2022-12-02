import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 0 :");

        int counter = 1;
        // int number = scanner.nextInt();
        while(counter <= 10){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                if (counter == 10) {

                    System.out.println("Thank you for participating");
                    break;
                }
                    System.out.println("Enter number " + counter + ": ");

                    scanner.nextLine();

            }else {
                    System.out.println("Invalid number");


            }
                    counter++;

        }

        scanner.close();
    }

}
