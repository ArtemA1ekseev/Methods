package homework;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int year = 2000;
        getLeapYear(year);
        System.out.println(" ");
        System.out.println("Задача 2.");
        int clientOS = 0; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2015;
        getClientOS(clientOS, clientDeviceYear);
        System.out.println(" ");
        System.out.println("Задача 3.");
        int deliveryDistance = 95;
        int deliveryDistanceAnswer = getDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDistanceAnswer);

    }
    // 1 метод.
    public static void getLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    // 2 метод.
    public static void getClientOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
    }
    // 3 метод.
    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            int amountDays = (deliveryDistance - 20);
            if ((amountDays % 40 == 0)) {
                int newAmountDays = (amountDays / 40) + 1;
                return newAmountDays;
            } else {
                int newAmountDays2 = (amountDays / 40) + 2;
                return newAmountDays2;
            }
        }
    }
}
