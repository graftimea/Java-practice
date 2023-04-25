package academy.learning;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double sz1, double sz2) {
        if ((sz1>0 && sz2>0 && sz1-sz2<0.001 && sz1-sz2>-0.001) || (sz1<0 && sz2<0 && sz1-sz2<0.001) || (sz1 == 0 && sz2 == 0)) {
            return true;
        } else {return false;}
    }
}
