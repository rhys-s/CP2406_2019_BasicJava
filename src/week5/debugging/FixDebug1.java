package week5.debugging;

// DebugSix1.java
// Start with a penny
// double it every day
// how much do you have in a 30-day month?
public class FixDebug1 {

    public static void main(String args[]) {
        final int DAYS = 30;
        double money = 0.01;
        int day = 1;
        for (int i = 0; i < 30; i++) {
            money = 2 * money;
            System.out.println("After day " + i + " you have " + money);
        }
    }
}
