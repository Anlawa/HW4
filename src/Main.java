import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {task1();}
    public static void task1() {
        //Задание 1
        int i = 0;

        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
//Задание 2

        int day = 5;
        for (day = 1; day <= 31; day += 7) {
            System.out.println("Сегодня пятница," + day + " число,пора сдавать отчет");

        }
        System.out.println();
        //Задание 3
        int currentYear = 2020;

        int commetStart = currentYear - 200;
        int commetEnd = currentYear + 100;

        for (int year = commetStart; year <= commetEnd; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        }
    }