import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x, A;
        System.out.println("Вы хотите воспользоваться калькулятором?");
        System.out.println("1-да 2-нет");
        A = scanner.nextDouble();
        while (A == 1) {
            System.out.println("Какое действие вы хотите сделать?");
            System.out.println("1-сложение 2-вычитание 3-умножение 4-деление 5-вычислит кв. уровнение");
            System.out.println("выберите цифру данного действия");
            x = scanner.nextDouble();
            if (x == 1) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println("ответ:" + " " + sum(a, b));
            } else if (x == 2) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println("ответ:" + " " + subtraction(a, b));
            } else if (x == 3) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println("ответ:" + " " + multiplication(a, b));
            } else if (x == 4) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println("ответ:" + " " + segmentation(a, b));
            } else if (x == 5) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println("введите третье число");
                c = scanner.nextDouble();
                System.out.println(squarer(a, b, c));
            } else
                System.out.println("попробуйте ещё раз");
            System.out.println("Вы хотите воспользоваться калькулятором?");
            System.out.println("1-да 2-нет");
            A = scanner.nextDouble();
        }
    }
        public static double sum ( double a, double b){
            return (a + b);
        }
        public static double subtraction ( double a, double b){
            return (a - b);
        }
        public static double multiplication ( double a, double b){
            return (a * b);
        }
        public static double segmentation ( double a, double b){
            return (a / b);
        }
        public static String squarer ( double a, double b, double c){
            String S = " ";
            double D = Math.sqrt(b * b - 4 * a * c);
            if (D > 0) {
                double x1 = (-b + D) / (a * 2);
                double x2 = (-b - D) / (a * 2);
                System.out.println("x1 =" + " " + x1);
                System.out.println("x2 =" + " " + x2);
            } else if (D == 0) {
                double x1 = (-b) / (a * 2);
                System.out.println("x =" + " " + x1);
            } else
                System.out.println("ну тут корней нет, это матеша");
            return S;
        }
    }