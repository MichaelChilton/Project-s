public class IntEqualityPrinter {
    public static void printEqual(int parameters , int parameters2 ,  int parameters3 ) {

        if(parameters  < 0  || parameters2 < 0 || parameters3 < 0 ){
            System.out.println("Invalid Value");
        }else if (parameters == parameters2 && parameters == parameters3){
            System.out.println("All numbers are equal");
        }else if (parameters != parameters2 && parameters2 != parameters3 && parameters != parameters3){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
        return;
    }
}
