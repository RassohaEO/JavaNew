package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int money = 100000;
        int year = 5;
        int procent = 20; // godovoi procent

        for (int month = 0; month < year * 12; month++) {
            money = money + ((money / 100 * procent) / 12);

        }
        System.out.println(money);
    }
}
