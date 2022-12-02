public class EvenNumber {
    public static void main(String[] args) {
        int number = 3;
        int finishNumber = 20;
        int totalEven = 0;

        while (number <= finishNumber) {
            number++;
                    if(!isEvenNumber(number)){
                        continue;
                    }
            totalEven++;
            System.out.println("Even number " + number);
            if (totalEven == 5){
                System.out.println("Total even numbers found = " + totalEven);
                break;
        }
        }


    }
    public static boolean isEvenNumber(int even) {
        return even % 2 == 0;
    }


}
