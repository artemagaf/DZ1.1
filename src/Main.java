import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);
        //2
//        int n = scanner.nextInt();
//        long sum = 0;
//
//        for (int i = 1; i <= n; i += 2) {
//            sum += (long) i * i;
//        }
//        System.out.println(sum);
        //3
//        int n = scanner.nextInt();
//        long factorial = 1;
//
//        for (int i = 2; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);
        //4
//        int n = scanner.nextInt();
//        double sum = 0.0;
//        for (int i = 0; i < n; i++) {
//            sum += scanner.nextInt();
//        }
//        double average = sum / n;
//        System.out.printf("%.3f%n", average);
        //5
//        int n = scanner.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (scanner.nextInt() > 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
        //6
//        int n = scanner.nextInt();
//        for (long x = 1; x <= n; x *= 2) {
//            System.out.print(x + " ");
        //7
//        int n = scanner.nextInt();
//        int sum = 0;
//        if (n == 0) {
//            sum = 0;
//        } else {
//            while (n > 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//        }
//        System.out.println(sum);
        //8
//        int n = scanner.nextInt();
//        int reversed = 0;
//
//        while (n != 0) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;
//            n /= 10;
//        }
//        System.out.println(reversed);
        //9
//        int n = scanner.nextInt();
//        boolean isPrime = true;
//        if (n <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(isPrime ? "YES" : "NO");
        //10
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int current = a;
        for (int i = 0; i < n; i++) {
            System.out.print(current + " ");
            current += d;
        }
        System.out.println();
    }
}