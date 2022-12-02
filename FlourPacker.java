public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0){return false;}
        int bigCount1 = 0;
        int goal1 = goal;
        if (smallCount >= goal){
            return true;
        }
        int test = 0;
        while (bigCount1 <= bigCount){

            test = bigCount1 * 5;
            goal1 -= test;
            System.out.println(test);
            if (test == goal){
                return true;
            }
            if (test > goal){
                return false;
            }
            if (smallCount >= goal1){
                return true;
            }
            goal1 = goal;
            bigCount1++;
        }
      return false;
    }
}

//
//        int goal1 = 0;
//        if (bigCount1 <= goal){
//            if (bigCount1 == goal){
//                return true;
//            }
//            goal -= bigCount1;
//            if (smallCount >= goal || bigCount1 == goal){
//                return true;
//            }
//        }
//        System.out.println(goal1);