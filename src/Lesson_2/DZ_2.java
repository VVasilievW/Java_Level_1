package Lesson_2;

public class DZ_2 {
    public static void main(String[] args) {

        public static boolean checkSumm (int a, int b) {
            int sum = a +b;
            if (sum > 10 && sum <=20) {
                return true;
            } else {
                return false;
            }
        }
        public static void chekNumber (int c1) {
            if (c1 < 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Чмсло положительное");
            }
        }


    }
}
