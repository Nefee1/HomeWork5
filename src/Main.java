import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear > 2015) {
            System.out.println(" обычное предложение об установке приложения");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if (year > 2020 && year < 2024) {
            System.out.println(" Год не является високостным");
        } else {
            System.out.println(" Год является високостным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется дней: 1");
        }
        if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else {
            if (deliveryDistance <= 100) {
                System.out.println("Потребуется дней: 3");
            } else {
                if (deliveryDistance > 100) {
                    System.out.println("Доставки нет");
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон Зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон Весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон Лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон Осень");
                break;
            default:
                System.out.println("Такого месяца нет ");
        }
        System.out.println("Сделано ДЗ");

    }
}


