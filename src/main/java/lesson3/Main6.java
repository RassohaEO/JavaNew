package lesson3;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //пользовательский интерфейс


        String login = "qwerty";
        String password = "qwert1234";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите логин");
        String inputLogin = scanner.nextLine();

        System.out.println("ВВедите пароль");
        String inputPassword = scanner.nextLine();
        //==равенство примитив типов
        // equals -  равенство ссылочных типов
        if (login.equals(inputLogin) && password.equals(inputPassword)) {
            System.out.println("Вход выполнен");
        } else {
            System.out.println("Неверный лог или пароль");
        }
        scanner.remove();

        // введите фигуру
        // треугольник,прямоугольник,квадрат,круг
        // введите параметры фигуры , если треугольник стороны а б с
        // площадь треугольника
        // периметр треугольника
    }

}
