package geekbrains_java1;


    public class Homework_1 {
        public Homework_1() {
        }

        private static float calculate(float a, float b, float c, float d) {
            return a * (b + c / d);
        }

        private static boolean twoNumbers(int first, int second) {
            int sum = first + second;
            return sum >= 10 && sum <= 20;
        }

        public static void isPositiveOrNegative(int x) {
            if (x >= 0) {
                System.out.println("Число положительное!");
            } else {
                System.out.println("Число отрицательное!");
            }

        }

        public static boolean isNegative(int x) {
            if(x < 0){
                return true;
            }
            return false;
        }


        public static void greetings(String name) {
            System.out.println("Привет, " + name + "!");
        }

        private static boolean isLeapYear(int year) {
            return year / 4 == 0 && year % 100 != 0 && year % 400 == 0;
        }

        public static void main(String[] args) {
            byte b = 120;
            short s = 460;
            int i = -2494;
            long l = 523344L;
            char с = 5;
            boolean bool = false;
            String str = "First Homework";
            System.out.println("Результат =" + calculate(5.16F, 3.1F, 5.0F, 9.01F));
            System.out.println("Сумма находится между 10 и 20?" + twoNumbers(-7, 25));
            isPositiveOrNegative(99);
            System.out.println(isNegative(-7));;
            greetings("Master Yoda");
            System.out.println("Год високосный?" + isLeapYear(536));
        }
    }
