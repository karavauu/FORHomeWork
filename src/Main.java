import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //1
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);


        //2
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            if (i % 2 != 0)
//            sum += Math.pow(i, 2);
//        }
//
//        System.out.println(sum);


        //3
//        System.out.print("Введите число не меньше 0 и не больше 20: ");
//        int num = sc.nextInt();
//
//        while (num <= 0 || num > 20) {
//            System.err.print("Число не может быть меньше 1 или больше 20\nВведите корректное число:");
//            num = sc.nextInt();
//        }
//
//
//        long factorial = 1;
//        for (int i = 1; i <= num; i++) {
//            factorial *= i;
//        }
//
//        System.out.println(factorial);


        //4
//        double arithmeticMean;
//        int num;
//        double sum = 0;
//        System.out.print("Количество чисел: ");
//        double numQuantity = sc.nextInt();
//
//        for (int i = 0; i < numQuantity; i ++) {
//            System.out.printf("Введите число номер %d: ", i + 1);
//            num = sc.nextInt();
//            sum += num;
//        }
//
//        arithmeticMean = sum / numQuantity;
//        System.out.printf("%.3f", arithmeticMean);
//    }


        //5
//        int num;
//        int counter = 0;
//
//        System.out.print("Количество чисел: ");
//        int numQuantity = sc.nextInt();
//        for (int i = 0; i < numQuantity; i ++) {
//            System.out.printf("Введите число номер %d: ", i + 1);
//            num = sc.nextInt();
//            if (num > 0) {
//                counter += 1;
//            }
//
//        }
//
//        System.out.printf("Количество положительных чисел: %d ", counter);


        //6
//        int num = sc.nextInt();
//        for (long i = 1; i <= num; i++) {
//            System.out.print( (int) Math.pow(2, i) + " ");
//        }


        //7
//        int num  = sc.nextInt();
//        int sum = 0;
//
//        for (; num > 0; num /= 10) {
//            sum += num % 10;
//        }
//
//        System.out.println(sum);


        //8
//        int num  = sc.nextInt();
//        int reverse = 0;
//        for (; num > 0; num /= 10) {
//            reverse = reverse * 10 + num % 10;
//        }
//
//        System.out.println(reverse);


        //9
//        int num = sc.nextInt();
//        boolean isSimple = true;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                isSimple = false;
//                continue;
//            }
//        }
//
//        System.out.println(isSimple ? "YES" : "NO");


        //10
//        System.out.print("Первый член: ");
//        int a = sc.nextInt();
//        System.out.print("Разность: ");
//        int d = sc.nextInt();
//        System.out.print("Кол-во первых членов которые нужно вывести: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            sb.append(a + (d * i)).append(" ");
//
//        }
//
//        System.out.println(sb);


    }
}