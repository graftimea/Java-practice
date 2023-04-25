package academy.learnprogramming;

public class getDurationString {
    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59 )) {
            return "Invalid value";
        }
        int fullSeconds = minutes * 60 + seconds;
        int hour = (int) fullSeconds / 3600;
        int minute = (int) (fullSeconds - hour * 3600) / 60;
        int second = fullSeconds - hour * 3600 - minute * 60;
        String date = hour + "h ";
        if (minute < 10) {
            date += "0";
        }
        date += minute + "m ";
        if (second < 10) {
            date += "0";
        }
        date += second + "s ";
        return date;
    }
    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "Ivalid value";
        }
        int minute = (int) seconds / 60;
        int second = seconds - minute * 60;
        return  minute + "m " + second + "s";
    }
}
