package lesson3;

public class Main3 {
    public static void main(String[] args) {
        //напечатать на консоль только четные от 10 до 40
        for (int i = 10; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
