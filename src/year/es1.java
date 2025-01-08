package year;

public class es1 {

    public static boolean Es1() {
        String x = "ciao";
        if (x.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean Es1Bis() {
        int year = 365;
        if (year % 4 == 0 && year % 400 != 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

