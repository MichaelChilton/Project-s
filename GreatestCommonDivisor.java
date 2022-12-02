public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) { // 9562    6231


        if (first < 10 || second < 10) { //
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;


    }

//    public static int getGreatestCommonDivisor(int first, int second) { // 9562    6231
//
//        if (first < 10 || second < 10){
//            return -1;
//        }
//
//        int x = 1;
//        int second2 = second;
//        int first2 = first;
//        int common2 = 0;
//        while (x < first){
//
//
//            int y = 0;
//            int common = 0;
//
//            common2 = first / x;
//               while (y < second){
//                y += 1;
//
//                if (second2 % y == 0){
//                    common = y;
//                    System.out.println(common2 + " and " + common);
//                }
//                if (common2 == common){
//                   System.out.println("highest number found " + common);
//                   return  y;
//                }
//            }
//            x += 1;
//            System.out.println("x");
//        }
//        return -1;
//    }
//public class GreatestCommonDivisor {
//    public static int getGreatestCommonDivisor(int valOne,int valTwo){
////Return false if any value<10
//        if(valOne<10 || valTwo<10){
//            return -1;
//        }
////Set a to biggest value, b to smallest value
////Check if there is a remainder when a/b
//        int a,b;
//        a = valOne>valTwo? valOne:valTwo;
//        b = valOne<valTwo? valOne:valTwo;
//        int remainder = a%b;
////As long as there is a remainder apply the Euclidean Algorithm
//        while(remainder!=0){
////A holds the current value in B
//            a=b;
////B will hold the last remainder
//            b = remainder;
////Once more we see if we have any remainder when a/b
//            remainder = a%b;
//        }
////If we no longer have a remainder, we know b (the last remainder) is the first value
////That can evenly fit in valOne and valTwo without a remainder.
//        return b;
//    }

}