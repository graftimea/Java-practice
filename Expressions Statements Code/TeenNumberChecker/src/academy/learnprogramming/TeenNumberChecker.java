package academy.learnprogramming;

public class TeenNumberChecker {
    public static boolean hasTeen(int sz1, int sz2, int sz3) {
        if ((sz1>=13 && sz1<=19) || (sz2>=13 && sz2<=19) || (sz3>=13 && sz3<=19)) {
            return true;
        } else {return false;}
    }
    public static boolean isTeen(int sz) {
        if (sz>=13 && sz<=19) {
            return true;
        } else {return false;}
    }
}
