package lesson3;

public class Main5 {
    public static void main(String[] args) {
        //вывести на консоль сумму от 40 до 100
        int suma = 0;
        for (int i = 40; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                suma = suma + i;
            }


        }
        System.out.println(suma);
    }
}
