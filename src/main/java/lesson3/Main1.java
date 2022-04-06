package lesson3;

public class Main1 {
    public static void main(String[] args) {
        // управляющая конструкция swich


        // 2 3 4 5
        int mark = 40;

        switch (mark) {
            case 2:
                System.out.println("ужас!");
                break;
            case 3:
                System.out.println("не очень");
                break;
            case 4:
                System.out.println("нормально!");
                break;
            case 5:
                System.out.println("отлично!");
                break;
            default:
                System.out.println("это не оценка!!!");

        }
        System.out.println("!!!!");
    }
}
