package Lesson_1;

public class DZ_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 3, b = 4;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 15, b = 10;
        if (a >= b){
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }

}
