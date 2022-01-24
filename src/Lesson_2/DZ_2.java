package Lesson_2;

public class DZ_2 {
    public static boolean main(String[] args) {

        public static boolean checkSumm (int a, int b) {
            int sum = a +b;
            if (sum > 10 && sum <=20) {
                return true;
            } else {
                return false;
            }
        }
        public static void checkNumberPrint (int c1) {
            if (c1 < 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Число положительное");
            }
        }
        public static boolean checkNumberSign (int c2) {
            if (c2 < 0) {
                return true;
            } else {
                return false;
            }
        }
        public static void printTextNRaz (String txtToPrint, int n) {
            for (int i = 0; i < n; i++) {
                System.out.println(txtToPrint);
            }

        }
        public static boolean checkYear (int year) {
            if (year %4 == 0 || year %400 == 0 ) {
                if (year %100 !=0) {
                    return true;
                }
            } else {
                return false;
            }
        }

    }
}
